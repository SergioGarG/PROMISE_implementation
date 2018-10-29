# the class is implemented using a template method pattern.
#!/usr/bin/env python

import numpy
import Queue
import rospy
import sys
import time
import io
import os
import re

from roseus.msg import StringStamped

import actionlib
from actionlib import SimpleActionClient
from actionlib_msgs.msg import GoalStatus

from abc import abstractmethod

from geometry_msgs.msg import PoseWithCovarianceStamped, PoseStamped, PolygonStamped, Point32, Twist, WrenchStamped

from std_msgs.msg import Bool, String
from nav_msgs.msg import OccupancyGrid
from move_base_msgs.msg import MoveBaseAction, MoveBaseGoal, MoveBaseActionGoal, MoveBaseActionResult

from tf.transformations import euler_from_quaternion, quaternion_from_euler

from ms1_msgs.msg import PlanMsg, PosePlanArray, MovementPlan, ActionSeq, Humans, Human, Objects, Robots

import ms2_kth
from ltl_tools.ltl2ba import run_ltl2ba, parse_ltl
from ltl_tools.promela import find_states, find_symbols
from ms2_kth.msg import LoadUnload, Mission

from sensor_msgs.msg import Image, CameraInfo, PointCloud, JointState

from trajectory_msgs.msg import JointTrajectoryPoint, JointTrajectory

class Status(object):
	def __init__(self):
		self.robotname = None
		self.counter_mission = 0
		self.task_status = String()
		self.resend = False
		self.timer = rospy.Time()
		self.state = 0
		self.resend_task = rospy.Time()
		self.sent=False
		self.stoppingEvents = []

		#Events and event handler
		self.events = []
		self.ongoing_events = []
		self.detected_event = None
		self.event_flag = False
		self.event_handler = []
		self.counter_eh = 0
		self.prev_eh = []
		self.flag_eh = True

		#Fallback variables
		self.fallback = []
		self.counter_fb = 0
		self.prev_fb = []
		self.flag_fb = True
		self.check_again_fb = 0

		#Condition operator variables
		self.condition = []
		self.counter_cond = 0
		self.prev_cond = []
		self.flag_cond = True
		self.check_again_cond = 0

		#Regular expressions
		self.prog_eh = re.compile('.*eh_.+') #Event handler
		self.prog_cond = re.compile('.*cond_.+') #Condition 
		self.prog_fb = re.compile('.*fb_.+') #Fallback

		self.prog_action = re.compile('X .+') #Actions formula

class StoppingEvent(object):
	def __init__(self):
		self.task = String()
		self.event = String()
		

class MissionClass(object):
	def __init__(self):
		self.id = String()
		self.mission = Mission()
		self.counter = 0
		self.first = True
		self.childs = []
		

class EventHandlerClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.success = []
		self.result = None

class FallbackClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.success = None

class ConditionClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.success = []
		self.condition_executed = []
		self.result = None

class LocalMission(object):
	# Constructor of the class
	def __init__(self):
		self.status=Status()
		self.missions=None

		self.result=MoveBaseActionResult()
		self.robotName = None
		self.simulation = False
		self.starts = False
		self.events_start = False
		self.mission_ready = False

	def update_manager(self):	
		self.timer_now=rospy.Time.now()
		if self.status.sent==True:
			#print "time",self.timer_now.secs - self.status.resend_task.secs
			if (self.timer_now.secs - self.status.resend_task.secs) > 10:
				self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
				self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	

		# Does all the magic and decision making for event handler operators
		if self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter] == "eh":
			for i in range(0, len(self.missions[self.status.counter_mission].childs)):
				#If the keyword eh is detected, the code checks where is the default mission of the event handler and jumps to it.
				if self.missions[self.missions[self.status.counter_mission].childs[i]].id == "eh_default":
					self.missions[self.status.counter_mission]=self.missions[self.status.counter_mission].childs[i]

			if self.status.detected_event != None and self.status.event_flag == True and self.missions[self.missions[self.status.counter_mission].childs[i]].id=="eh_default":
				for i in range(0, len(self.missions[self.status.counter_mission].childs)):
					if (self.status.detected_event in self.missions[self.missions[self.status.counter_mission].childs[i]].mission.events) and (self.status.prog_eh.match(self.missions[self.missions[self.status.counter_mission].childs[i]].id)):
						if not(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_eh):
							print "Event handler operator detected"
							if self.status.flag_eh:
								self.status.flag_eh = False
							else:
								self.status.counter_eh+=1
							self.status.prev_eh.append(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission))
							self.status.event_handler.append(EventHandlerClass())
							self.status.event_handler[self.status.counter_eh].length=len(self.missions[self.status.counter_mission].childs)
							self.status.event_handler[self.status.counter_eh].index=self.missions[self.status.counter_mission].childs
							self.status.event_handler[self.status.counter_eh].id=self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission)
							for j in range(0, self.status.event_handler[self.status.counter_eh].length):
								self.status.event_handler[self.status.counter_eh].success.append(False)
							

						print "the detected event", self.status.detected_event, "is in the list of triggering events"
						self.status.counter_mission=self.missions[self.status.counter_mission].childs[i]
						print "jump into the mission with id", self.status.counter_mission,",", self.missions[self.status.counter_mission].mission.mission
						self.status.resend = True
						break
				self.status.event_flag = False

		# Add new fb objects to the list to iterate over them
		if self.missions[self.status.counter_mission].childs and self.status.prog_fb.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id) and not \
		(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_fb): 
			self.status.fallback.append(FallbackClass())
			if self.status.flag_fb:
				self.status.flag_fb = False
			else:
				self.status.counter_fb+=1
			self.status.fallback[self.status.counter_fb].length=len(self.missions[self.status.counter_mission].childs)
			self.status.fallback[self.status.counter_fb].index=self.missions[self.status.counter_mission].childs
			self.status.fallback[self.status.counter_fb].id=self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_fb)
			self.status.prev_fb.append(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission))
			self.status.counter_mission+=1
			print "Fallback operator detected with length",self.status.fallback[self.status.counter_fb].length,"and id",self.status.fallback[self.status.counter_fb].id,\
			". Starting from the first item",self.missions[self.status.counter_mission].mission.mission,"with id",self.status.counter_mission
			self.update_manager()

		if self.missions[self.status.counter_mission].childs and self.status.prog_fb.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id) and \
		self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_fb:
			if self.status.fallback[self.status.counter_fb].success != None and self.status.check_again_fb < 1:
				print "already registerted fallback",self.status.fallback[self.status.counter_fb].id
				self.status.check_again_fb +=1
				if self.status.check_again_fb >= 1:
					self.status.fallback[self.status.counter_fb].success = None
					self.status.check_again_fb = 0
					self.status.resend = True
				self.update_manager()
			if self.status.fallback[self.status.counter_fb].success == None:
				#Sets the current mission according to the previous executed objects
				self.status.counter_mission=self.setCurrentCounter("fallback")
				print "correcting mission based on operator, jumping to",self.missions[self.status.counter_mission].mission.mission,"task",self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]

				if self.missions[self.status.counter_mission].childs and self.status.prog_fb.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id) and \
				self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_fb and \
				self.status.counter_fb+1 < len(self.status.fallback):
					self.status.counter_fb+=1	
					print "detected embed operator, jumping to it", self.missions[self.status.fallback[self.status.counter_fb].index[self.status.fallback[self.status.counter_fb].counter]].mission.mission
					self.update_manager()

		# Condition operator
		if self.missions[self.status.counter_mission].childs and self.status.prog_cond.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id) and not \
		(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_cond): 
			self.status.condition.append(ConditionClass())
			if self.status.flag_cond:
				self.status.flag_cond = False
			else:
				self.status.counter_cond+=1		
			self.status.condition[self.status.counter_cond].length=len(self.missions[self.status.counter_mission].childs)
			self.status.condition[self.status.counter_cond].index=self.missions[self.status.counter_mission].childs
			self.status.condition[self.status.counter_cond].id=self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_cond)
			self.status.prev_cond.append(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission))
			for i in range(0, self.status.condition[self.status.counter_cond].length):
				self.status.condition[self.status.counter_cond].condition_executed.append(False)
				self.status.condition[self.status.counter_cond].success.append(False)
			print "Condition operator detected with length",self.status.condition[self.status.counter_cond].length," and id",self.status.condition[self.status.counter_cond].id, \
			". Starting from the first item", self.missions[self.status.counter_mission].mission.mission,"with id",self.status.counter_mission
			self.status.resend = False
			self.missions[self.status.counter_mission].first = False
			self.update_manager()
		
		if self.status.prog_cond.match(self.missions[self.status.counter_mission].id) or (self.missions[self.status.counter_mission].childs and \
		self.status.prog_cond.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id)):
			if self.status.condition[self.status.counter_cond].result != None and self.status.check_again_cond < 1 and \
			(self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_cond): 
				print "already completed condition",self.status.condition[self.status.counter_cond].id
				self.status.check_again_cond +=1
				if self.status.check_again_cond >= 1:
					self.status.condition[self.status.counter_cond].result = None
					for i in range(0, self.status.condition[self.status.counter_cond].length):
						self.status.condition[self.status.counter_cond].condition_executed[i]=False
					self.status.check_again_cond = 0
					self.status.resend = True
				self.update_manager()
			if self.status.condition[self.status.counter_cond].result == None:
				for i in range(0, len(self.status.ongoing_events)):
					if (self.status.ongoing_events[i] in self.missions[self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]].mission.events):
						self.status.counter_mission=self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
						self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter]=True			
						#print "the ongoing event", self.status.ongoing_events[i],"triggers the operator with id",self.status.counter_mission
						#break
						if self.missions[self.status.counter_mission].childs and \
						(self.status.prog_cond.match(self.missions[self.missions[self.status.counter_mission].childs[0]].id) and \
						self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in self.status.prev_cond and \
						self.status.counter_cond+1 < len(self.status.condition)):
							self.status.counter_cond+=1	
							print "detected embed operator, jumping to it"#,self.missions[self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]].mission.mission
							self.update_manager()

				if self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter] == False:
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
					if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
						self.status.condition[self.status.counter_cond].counter+=1
						print "Checking the next item of the condition operator", self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
						self.update_manager()
					else:
						self.status.counter_mission = self.checkParent(self.status.counter_mission, "condition")

		self.process()


	#####################Communication callbacks
	########Subscribers
	def LocalMissionCallback(self, localmission):
		# string containing the local mission
		if localmission.data == "starts":
			self.missions=[]
			#self.status.robotname="tiago"
			self.status.events=[]
			self.status.actions=[]
			self.status.state=1
		elif localmission.data != "events_start" and localmission.data != "ends" and self.status.state==1:
			text = "\n".join([ll.rstrip() for ll in localmission.data.splitlines() if ll.strip()]) #removes the empty lines
			helper1 = text.split("\n") #each line of the local mission specific for each robot
			self.missions = [ MissionClass() for i in range(len(helper1))] #Multiple instantiations of the class, one per line (one per mission)

			###First line of the mission, the per-default mission
			self.missions[0].id='default'
			###The following lines, which contains exceptions based on events
			prev_indentation = 0
			parenting=[]
			for i in range(0, len(self.missions)):				
				helper2 = helper1[i].split("[", 1) # just the default mission of the robot
				self.missions[i].id=helper2[0].replace("\t", "") #remove empty tabs
				helper4 = helper2[1][0:len(helper2[1])-1]
				self.missions[i].mission.mission = helper4.split(",") # array containing all the tasks of the default mission
				for j in range(0, len(self.missions[i].mission.mission)):
					if self.missions[i].mission.mission[j] == None or self.missions[i].mission.mission[j] == "": 
						self.missions[i].mission.mission[j] = "true"

				#Checks the parents and childs on the mission (see the generated trees from the DSL)
				if i != 0:
					indentation=0
					parenting.insert(i,0)
					for j in range(0, len(helper1[i])):
						if helper1[i][j] == '\t':
							indentation+=1
					if indentation > prev_indentation:
						parenting.insert(indentation,(i-1))
						prev_indentation = indentation
					elif indentation == prev_indentation:
						prev_indentation = indentation
					elif indentation < prev_indentation:
						prev_indentation = indentation
					#self.missions[parenting[indentation]].childs.append(self.missions[i].id)
					self.missions[parenting[indentation]].childs.append(i)

		elif localmission.data == "events_start":
			self.status.events.append('default') #The first event is always blank since is the per-default mission
			self.status.state=2
		elif localmission.data != "events_end" and self.status.state==2:
			self.status.events.append(localmission.data)
		elif localmission.data == "events_end":
			#Matches each event to its corresponding mission object
			for j in range(1, len(self.missions)):
				helper = self.missions[j].id.split("_")
				for i in range(0, len(self.status.events)):
					if helper[1] in self.status.events[i]:
						helper2=self.status.events[i].split(" ")
						self.missions[j].mission.events = helper2[0]
			self.status.state=3
		elif localmission.data != "stoppingEvents" and self.status.state==3:
			self.status.actions.append(localmission.data)
		elif localmission.data == "stoppingEvents":
			self.status.state=4
		#Stores the stoppingEvents in the corresponding instantiation of the class.
		#It stores which task is associated to a stoppingEvent and the event itself.
		elif localmission.data != "stoppingEvents_ends" and self.status.state==4:
			helper1 = localmission.data.split(",")
			self.status.stoppingEvents.append(StoppingEvent())
			self.status.stoppingEvents[len(self.status.stoppingEvents)-1].task=helper1[1]
			self.status.stoppingEvents[len(self.status.stoppingEvents)-1].event=helper1[2]

		elif localmission.data == "stoppingEvents_ends":
			print "Mission for robot", self.robotName, "completely received (",len(self.missions),"objects)"
			self.status.state=0
			# for i in range(0, len(self.missions)):
			# 	print "position", i
			# 	print self.missions[i].mission
			# 	print "id", self.missions[i].id
			# 	print "child(s)", self.missions[i].childs
			# 	print "events", self.missions[i].mission.events
			# 	print "-------------"
			self.update_manager()


	def GoalResultCallback(self, goalresult):
		self.result=goalresult
		#print self.result.status.text
		#self.update_manager()

	def TaskStatusCallback(self, taskstatus):
		timer_now=rospy.Time.now()
		#Collects the state of the current task (received from the planner).
		#It only takes the updates with 1 sec of different in their timestamp to avoid bouncing.
		if (timer_now.secs - self.status.timer.secs) > 1:
			self.status.task_status=taskstatus.data
			self.status.timer = rospy.Time.now()
			self.update_manager()

	def TriggeringEventsCallback(self, event):
		### Just a debug version some policies need to be applied to check when the events are affecting the environment or not
		stoppedMission=False
		for i in range(0, len(self.status.stoppingEvents)):
			if(self.status.stoppingEvents[i].event == event.data and \
			self.status.stoppingEvents[i].task == self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]):
				print "stop mission!"
				stoppedMission=True
				if self.status.counter_mission == 0:
					self.SendLocalMission("[] l0", False, self.status.events)
				else:
					self.status.task_status = "accomplished"
				break
					
		if stoppedMission == False:
			#Simulating events that are happening or not in the environment
			self.status.event_flag=False
			if "$remove" in event.data:
				print "event removing requested"
				helper = event.data.split("_", 1)
				for i in range(0, len(self.status.ongoing_events)):
					if helper[1] == self.status.ongoing_events[i]:
						print "removing event from the list (",self.status.ongoing_events[i],")"
						self.status.ongoing_events.remove(self.status.ongoing_events[i])
						break
			else:
				print "event detected by the planner (",event.data,")"
				self.status.detected_event=event.data
				self.status.event_flag = True
				same = False
				for i in range(0, len(self.status.ongoing_events)):
					if event.data == self.status.ongoing_events[i]:
						same = True
						break
				if same == False:
					self.status.ongoing_events.append(event.data)
			
		print "list of current ongoing events (",self.status.ongoing_events,")"		

		self.update_manager()

	########Publishers
	def SendLocalMission(self, localmission, finite, event):
	# sends the received local mission after checking its feasability
		mission=Mission()
		mission.mission.data=localmission
		mission.finite.data=finite
		events=''
		for i in range(0, len(event)):
			events=events+', '+event[i]
		mission.events.data=events

		if mission.mission.data == 'true':
			self.update_manager()

		#Checks if the next task is an action, and if it is and it is not in the actions pool described in the DSL it is not sent
		helper = mission.mission.data.split(" ", 1)	
		if len(helper) > 1:
			helper3 = re.sub('[()]', '', helper[1])
		else:
			helper3 = re.sub('[()]', '', helper[0])
		helper2 = re.sub('[()]', '', mission.mission.data)
		if (self.status.prog_action.match(helper2) and helper3 in self.status.actions) or not self.status.prog_action.match(helper2):
			print "------------------------------------------------"	
			print "Current task", mission.mission.data, "(",mission.finite.data,") of mission", self.missions[self.status.counter_mission].mission.mission
			print "------------------------------------------------"
			self.LocalMissionPublisher.publish(mission)
		else:
			print "Not recognized action(",mission.mission.data,"), task will not be sent"
		self.status.sent=True
		self.status.resend_task=rospy.Time.now()


	################Executing callbacks
	def setCurrentCounter(self, operator):
		#Adjust the local counters for each operator
		if operator == "condition":
			helper=self.status.condition[self.status.counter_cond].id.split("-")
			self.status.counter_cond=int(helper[1])
			counter=self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
		elif operator == "fallback":
			helper=self.status.fallback[self.status.counter_fb].id.split("-")
			self.status.counter_fb=int(helper[1])
			counter=self.status.fallback[self.status.counter_fb].index[self.status.fallback[self.status.counter_fb].counter]
		else:
			"error or not registered operator, returning -1"
			counter=-1
		return counter		

	def checkFinite(self, index, index_mission):	
		#checks whether the target task is finite
		helper = self.missions[index_mission].mission.mission[index].split(" ", 1)	
		if len(helper) > 1:
			helper3 = re.sub('[()]', '', helper[1])
		else:
			helper3 = re.sub('[()]', '', helper[0])
		helper2 = re.sub('[()]', '', self.missions[index_mission].mission.mission[index])
		if helper3 in self.status.actions:
			finite = True
		elif self.status.prog_action.match(helper2):
			print "Not recognized action, cannot check whether it is finite"
			finite=True
		else:
			# print "Mission item ", index, ": ", (self.missions[index_mission].mission.mission[index])
			#ba=run_ltl2ba(self.missions[index_mission].mission.mission[index])
			# print "Mission item ", index, ", BA generated: ", ba
			edges=parse_ltl(self.missions[index_mission].mission.mission[index])
			# print "Mission item ", index, ", transitions: ", edges
			(states, initials, accepts)=find_states(edges)
			# print "Mission item ", index, ", states: ", states, " initials ", initials, " accepts ", accepts
			# symbols=find_symbols(self.missions[index_mission].mission.mission[index])
			# print "Mission item ", index, ", symbols: ", symbols

			for j in range(0, len(accepts)):
				finite=True
				for (f,t) in edges.keys():
					if f == accepts[j]:
						if (edges[(f,t)] != "(1)") and (edges[(f,t)] != "1"):
							finite = False
		return finite

	def evaluateCondition(self, index, index_mission):
		#checks whether the target condition was successful
		for i in range(0, self.status.condition[index].length):
			if self.status.condition[index].success[i]:
				self.status.condition[index].result="success"
			else: 
				self.status.condition[index].result="failure"
				break

	def checkParent(self, counter, operator):
		#gets the parent of the specific branch 
		parent = self.findParent(self.status.counter_mission, operator)
		if parent != -1:
			self.status.counter_mission=parent
			print "Last mission of the",operator,"operator"
			self.status.resend = True
		else:
			print "oh... something went wrong :("
		return parent

	def findParent(self, counter, operator):
		parent = -1 
		self.missions[self.status.counter_mission].counter=0
		## Parent finding algorithm
		for i in range(0, len(self.missions)):
			if counter in self.missions[i].childs: 
				parent = i
				break

		#Event handler
		if parent != -1 and operator == "event_handler":
			print "Mission", self.missions[self.status.counter_mission].mission.mission, "of event handler finished, back to its parent", self.missions[i].mission.mission
			self.missions[self.status.counter_mission].first=True

			if self.status.prog_eh.match(self.missions[parent].id) and self.status.counter_eh-1 >= 0:
				self.status.counter_eh-=1

		# Condition
		elif parent != -1 and operator == "condition":
			self.missions[self.status.counter_mission].first = True
			self.status.condition[self.status.counter_cond].counter = 0
			self.evaluateCondition(self.status.counter_cond, self.status.counter_mission)

			if self.status.prog_eh.match(self.missions[parent].id):
				self.upgradeCounters("condition","event_handler")

			for i in range(0, len(self.missions)):
				if parent in self.missions[i].childs: 
					parent = i
					print "Mission with index",self.status.condition[self.status.counter_cond].counter,"of condition operator completely evaluated, back to its (grand)parent", parent
					break
			if self.status.prog_fb.match(self.missions[self.missions[parent].childs[0]].id):
				self.upgradeCounters("condition","fallback")
				if self.status.prog_eh.match(self.missions[parent].id):
					self.upgradeCounters("fallback","event_handler")
			elif self.status.prog_cond.match(self.missions[self.missions[parent].childs[0]].id):
				self.upgradeCounters("condition","condition")
				if self.status.prog_eh.match(self.missions[parent].id):
					self.upgradeCounters("condition","event_handler")

		# Fallback
		elif parent != -1 and operator == "fallback":
			self.missions[self.status.counter_mission].first = True
			self.status.fallback[self.status.counter_fb].counter = 0
			if self.status.prog_eh.match(self.missions[parent].id):
				self.upgradeCounters("fallback","event_handler")

			for i in range(0, len(self.missions)):
				if parent in self.missions[i].childs: 
					parent = i
					print "Mission with index",self.status.fallback[self.status.counter_fb].counter,"of fallback operator completely evaluated, back to its (grand)parent", parent
					break
			if self.status.prog_fb.match(self.missions[self.missions[parent].childs[0]].id):
				self.upgradeCounters("fallback","fallback")
				if self.status.prog_eh.match(self.missions[parent].id):
					self.upgradeCounters("fallback","event_handler")
			elif self.status.prog_cond.match(self.missions[self.missions[parent].childs[0]].id):
				self.upgradeCounters("fallback","condition")
				if self.status.prog_eh.match(self.missions[parent].id):
					self.upgradeCounters("condition","event_handler")
			
		return parent

	def upgradeCounters(self, operator_current, operator_parent):
		### operator_parent == "event_handler"
		if operator_current == "fallback" and operator_parent == "event_handler":
			if self.status.fallback[self.status.counter_fb].success == True:
				self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter] = True
			elif self.status.fallback[self.status.counter_fb].success == False:
				self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter] = False
			print "upgrade counters fallback (event handler parent)"
		elif operator_current == "condition"  and operator_parent == "event_handler":
			print "self.status.counter_eh",self.status.counter_eh
			print "len(self.status.event_handler)",len(self.status.event_handler)
			print "self.status.event_handler[self.status.counter_eh].success", self.status.event_handler[self.status.counter_eh].success
			print "self.status.event_handler[self.status.counter_eh].counter", self.status.event_handler[self.status.counter_eh].counter
			if self.status.condition[self.status.counter_cond].result == "success":
				self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter] = True
			elif self.status.condition[self.status.counter_cond].result == "failure":
				self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter] = False
			print "upgrade counters condition (event handler parent)"
		### operator_parent == "fallback"
		elif operator_current == "fallback" and operator_parent == "fallback":
			if self.status.counter_fb-1 >= 0:
				self.status.counter_fb-=1		
				if self.status.fallback[self.status.counter_fb+1].success == False and self.status.fallback[self.status.counter_fb].counter+1 < self.status.fallback[self.status.counter_fb].length:
					self.status.fallback[self.status.counter_fb].counter+=1
				elif self.status.fallback[self.status.counter_fb+1].success == True:
					self.status.fallback[self.status.counter_fb].success = True
			print "upgrade counters fallback (fallback parent)"
			print "self.status.fallback[self.status.counter_fb].success",self.status.fallback[self.status.counter_fb].success
			print "self.status.counter_fb",self.status.counter_fb,"self.status.fallback[self.status.counter_fb].counter",self.status.fallback[self.status.counter_fb].counter
		elif operator_current == "condition" and operator_parent == "fallback":
			self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter]=True
			if self.status.condition[self.status.counter_cond].result=="failure" and self.status.fallback[self.status.counter_fb].counter+1 < self.status.fallback[self.status.counter_fb].length:
				self.status.fallback[self.status.counter_fb].counter+=1
			elif self.status.condition[self.status.counter_cond].result=="success":
				self.status.fallback[self.status.counter_fb].success = True

			if self.status.counter_cond-1 >= 0:
				self.status.counter_cond-=1
			print "upgrade counters condition (fallback parent)"
			print "self.status.fallback[self.status.counter_fb].success",self.status.fallback[self.status.counter_fb].success
			print "self.status.counter_fb",self.status.counter_fb,"self.status.fallback[self.status.counter_fb].counter",self.status.fallback[self.status.counter_fb].counter
			print "self.status.counter_cond",self.status.counter_cond,"self.status.condition[self.status.counter_cond].counter",self.status.condition[self.status.counter_cond].counter
		### operator_parent == "condition"
		elif operator_current == "condition" and operator_parent == "condition":
			if self.status.counter_cond-1 >= 0:
				self.status.counter_cond-=1
				self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter]=True
				if self.status.condition[self.status.counter_cond+1].result=="success":
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
				else:
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
				if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
					self.status.condition[self.status.counter_cond].counter += 1
			print "upgrade counters condition (condition parent)"
			print "self.status.counter_cond",self.status.counter_cond,"self.status.condition[self.status.counter_cond].counter",self.status.condition[self.status.counter_cond].counter
		elif operator_current == "fallback" and operator_parent == "condition":
			if self.status.fallback[self.status.counter_fb].success == False:
				self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
			else:
				self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
			self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter]=True
			if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
				self.status.condition[self.status.counter_cond].counter += 1
			if self.status.counter_fb-1 >= 0:
				self.status.counter_fb-=1
			print "upgrade counters fallback (condition parent)"
			print "self.status.counter_fb",self.status.counter_fb,"self.status.fallback[self.status.counter_fb].counter",self.status.fallback[self.status.counter_fb].counter
			print "self.status.counter_cond",self.status.counter_cond,"self.status.condition[self.status.counter_cond].counter",self.status.condition[self.status.counter_cond].counter

	################Process callback
	def process(self):
		# performs the process of execution at run time
		self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
		# print "------------------------------------------------"	
		# print "Current task", self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], "(",self.missions[self.status.counter_mission].mission.finite,") of mission", self.missions[self.status.counter_mission].mission.mission
		# print "------------------------------------------------"

		if self.missions[self.status.counter_mission].first == True or self.status.resend == True:
			print "first or resend"
			self.missions[self.status.counter_mission].first=False
			self.status.resend = False
			self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	
			
		elif self.status.task_status == "accomplished":		
			print "Task accomplished by the planner"
			if((self.missions[self.status.counter_mission].counter + 1) < len(self.missions[self.status.counter_mission].mission.mission)):	
				self.missions[self.status.counter_mission].counter+=1 #self.missions[self.status.counter_mission].counter+1
				self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
				self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	
			elif((self.missions[self.status.counter_mission].counter + 1) >= len(self.missions[self.status.counter_mission].mission.mission) and self.missions[self.status.counter_mission].mission.finite == True):
				print "reached end of the tasks list, mission complete!"
				#######If reached the end of the mission, time to switch to another mission based on the operator

				###Event handler
				if self.status.counter_mission != 0 and self.status.prog_eh.match(self.missions[self.status.counter_mission].id):
					self.status.event_handler[self.status.counter_eh].result = True
					self.status.counter_mission = self.checkParent(self.status.counter_mission, "event_handler")
				###Fallback
				elif self.status.counter_mission != 0 and self.status.prog_fb.match(self.missions[self.status.counter_mission].id):
					self.status.fallback[self.status.counter_fb].success = True
					self.status.counter_mission = self.checkParent(self.status.counter_mission, "fallback")
				###Condition
				elif self.status.counter_mission != 0 and self.status.prog_cond.match(self.missions[self.status.counter_mission].id):
					self.missions[self.status.counter_mission].counter = 0
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
					if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
						self.status.condition[self.status.counter_cond].counter+=1
						print "Mission with index",self.status.counter_mission,"of condition operator succesfully accomplished, checking the next one", self.missions[self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]].mission.mission 
					elif self.status.condition[self.status.counter_cond].counter+1 >= self.status.condition[self.status.counter_cond].length:
						self.status.condition[self.status.counter_cond].counter=0
						self.status.counter_mission = self.checkParent(self.status.counter_mission, "condition")
				self.status.task_status=""
				self.update_manager()
			elif((self.missions[self.status.counter_mission].counter + 1) >= len(self.missions[self.status.counter_mission].mission.mission) and self.missions[self.status.counter_mission].mission.finite == False):
				print "reached end of the tasks list, but the last one is not finite!"

		elif self.status.task_status == "failure":
			print '!!!a failure occurred during mission execution!!!' 

			#####Event Handler
			if self.status.prog_eh.match(self.missions[self.status.counter_mission].id) and self.status.event_handler[self.status.counter_eh].counter+1 < self.status.event_handler[self.status.counter_eh].length:
				self.status.event_handler[self.status.counter_eh].success = False

			#####Fallback
			if self.status.prog_fb.match(self.missions[self.status.counter_mission].id) and self.status.fallback[self.status.counter_fb].counter+1 < self.status.fallback[self.status.counter_fb].length:
				self.status.fallback[self.status.counter_fb].counter+=1
				self.status.counter_mission=self.status.fallback[self.status.counter_fb].index[self.status.fallback[self.status.counter_fb].counter]
				self.status.resend=True	
				self.status.fallback[self.status.counter_fb].success = False
				self.update_manager()
			elif self.status.prog_fb.match(self.missions[self.status.counter_mission].id) and self.status.fallback[self.status.counter_fb].counter+1 >= self.status.fallback[self.status.counter_fb].length:
				self.status.fallback[self.status.counter_fb].success = False
				self.status.counter_mission = self.checkParent(self.status.counter_mission, "fallback")

			#####Condition
			if self.status.prog_cond.match(self.missions[self.status.counter_mission].id) and self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
				self.status.condition[self.status.counter_cond].counter+=1
				self.status.counter_mission=self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
				self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
				print "Mission with index",self.status.condition[self.status.counter_cond].counter,"of condition operator failed, checking the next one",self.missions[self.status.counter_mission].mission.mission
				self.status.resend=True	
			elif self.status.prog_cond.match(self.missions[self.status.counter_mission].id) and self.status.condition[self.status.counter_cond].counter+1 >= self.status.condition[self.status.counter_cond].length:
				self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
				self.status.condition[self.status.counter_cond].counter=0
				self.status.counter_mission = self.checkParent(self.status.counter_mission, "condition")

			self.update_manager()

		self.status.task_status = ""

	def run_component(self):
		rospy.init_node('localmission')
		self.robotName = rospy.get_param('~robotName')
		self.status.timer = rospy.Time.now()

		rospy.Subscriber("triggering_events", String, self.TriggeringEventsCallback)
		if self.simulation:
			rospy.Subscriber('/robot_0/move_base/result', MoveBaseActionResult, self.GoalResultCallback)
			rospy.Subscriber("local_mission/ext", String, self.LocalMissionCallback)
			self.LocalMissionPublisher = rospy.Publisher('local_mission', Mission, queue_size = 100)
		else:
			if (self.robotName == 'tiago' or self.robotName == 'turtlebot'):
				rospy.Subscriber('move_base/result', MoveBaseActionResult, self.GoalResultCallback)
				rospy.Subscriber("local_mission/ext", String, self.LocalMissionCallback)
				self.LocalMissionPublisher = rospy.Publisher('local_mission', Mission, queue_size = 100)
				print self.robotName
			else:
				rospy.Subscriber('/summit_xl/move_base/result', MoveBaseActionResult, self.GoalResultCallback)
				rospy.Subscriber("/summit_xl/local_mission/ext", String, self.LocalMissionCallback)
				self.LocalMissionPublisher = rospy.Publisher('/summit_xl/local_mission', Mission, queue_size = 100)
				print self.robotName

		rospy.Subscriber("task_status", String, self.TaskStatusCallback)

		rate = rospy.Rate(10)
		while not rospy.is_shutdown():
			try:
				rate.sleep()
			except rospy.ROSInterruptException:
				pass

	@abstractmethod
	def localmission_method(self, map, shared_map, robotstatus, robot_status_robotnumber, localmission, local_mission_robotnumber, robot_pose, robot_pose_robotnumber):
		pass