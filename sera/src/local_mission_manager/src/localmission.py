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
		task_status_lock = False
		self.stoppingEvents = []
		self.actions = []

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
		self.prog_eh = re.compile('^.*eh_.+$') #Event handler
		self.prog_cond = re.compile('^.*cond_.+$') #Condition 
		self.prog_fb = re.compile('^.*fb_.+$') #Fallback
		
		self.prog_eh_task = re.compile('^(\s)?eh(\s)?$') #Event handler
		self.prog_cond_task = re.compile('^(\s)?cond(\s)?$') #Condition 
		self.prog_fb_task = re.compile('^(\s)?fb(\s)?$') #Fallback

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
		self.first = False
		self.children = []
		self.parent = None
		

class EventHandlerClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.success = []
		self.result = None
		self.default_index = None
		self.check_again = 0

class FallbackClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.result = None
		self.check_again = 0

class ConditionClass(object):
	def __init__(self):
		self.id = None
		self.index = []
		self.counter = 0
		self.length = 0
		self.success = []
		self.condition_executed = []
		self.result = None
		self.check_again = 0

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

#################################################################################################################################
# self.status.counter_mission: counter that points at the current branch of the mission. Moves vertically
# self.missions[self.status.counter_mission].counter: counter that points at the current task of the branch. Moves horizontally
# self.status.counter_(eh | cond | fb): points at the current instantiation of the target operator
#################################################################################################################################

	def update_manager(self):	
		#To resend the mission if the robot gets stuck
# 		self.timer_now=rospy.Time.now()
# 		if (self.timer_now.secs - self.status.resend_task.secs) > 40:
# 			print "time",self.timer_now.secs - self.status.resend_task.secs
# 			self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
# 			self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	

		#This method tries to detect calls to embed operators ("eh", "fb", "cond") and jumps to the appropriated branches if necessary.
		self.checkOperator()

		########### EVENT HANDLER
		# Does all the magic and decision making for event handler operators

		########### FALLBACK
		# All the required code is within the process method

		########### CONDITION
		# Condition operator
		if self.status.prog_cond.match(self.missions[self.status.counter_mission].id):
			for i in range(0, len(self.status.ongoing_events)):
				if (self.status.ongoing_events[i] in self.missions[self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]].mission.events):
					self.status.counter_mission=self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
					self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter]=True			
					# ongoing event", self.status.ongoing_events[i],"triggers the operator with id",self.status.counter_mission
					break
			if self.status.condition[self.status.counter_cond].condition_executed[self.status.condition[self.status.counter_cond].counter] == False:
				self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
				if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
					self.status.condition[self.status.counter_cond].counter+=1
					#print "Checking the next item of the condition operator", self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
					self.update_manager()
				else:
					self.evaluateResult("cond", self.status.condition, self.status.counter_cond)
					self.missions[self.status.counter_mission].counter=0
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
					self.status.task_status == "accomplished"
					self.status.condition[self.status.counter_cond].counter=0

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

				#Checks the parents and children on the mission (see the generated trees from the DSL)
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
					#self.missions[parenting[indentation]].children.append(self.missions[i].id)
					self.missions[parenting[indentation]].children.append(i)
			for i in range(0, len(self.missions)):	
				for j in range(0, len(self.missions)):
					if j in self.missions[i].children: 
						self.missions[j].parent = i

		elif localmission.data == "events_start":
			self.status.events.append('default') #The first event is always blank since is the per-default mission
			self.status.state=2
		elif localmission.data != "events_end" and self.status.state==2:
			self.status.events.append(localmission.data)
		elif localmission.data == "events_end":
			#Matches each event to its corresponding mission object
			if self.missions != None:
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
			self.status.state=0
			if self.missions != None:
				print "Mission for robot", self.robotName, "completely received (",len(self.missions),"objects)"
				self.update_manager()
			else:
				print "Something happened during the mission reception. Please, send it again"
			# for i in range(0, len(self.missions)):
			# 	print "position", i
			# 	print self.missions[i].mission
			# 	print "id", self.missions[i].id
			# 	print "child(s)", self.missions[i].children
			# 	print "parent", self.missions[i].parent
			# 	print "events", self.missions[i].mission.events
			# 	print "-------------"
			


	def GoalResultCallback(self, goalresult):
		self.result=goalresult
		#print self.result.status.text
		#self.update_manager()

	def TaskStatusCallback(self, taskstatus):
		#Collects the state of the current task (received from the planner).
		#It only takes the updates with 1 sec of different in their timestamp to avoid bouncing.
		if taskstatus.data == "mission_updated":
			print "mission correctly updated!"
			self.SendTriggerEventStatus("updated")	
		if (rospy.Time.now().secs - self.status.timer.secs) > 2 and self.status.task_status_lock == False:
			self.status.task_status=taskstatus.data
			self.status.timer = rospy.Time.now()
			self.status.task_status_lock = True

			#Here I should add an exception when mission was not correctly updated
					
			self.update_manager()
		

	def TriggeringEventsCallback(self, event):
		### Just a debug version some policies need to be applied to check when the events are affecting the environment or not
		self.status.stoppedMission=False
		for i in range(0, len(self.status.stoppingEvents)):
			if(re.sub(' ', '', self.status.stoppingEvents[i].event) == re.sub(' ', '', event.data) and \
			re.sub(' ', '', self.status.stoppingEvents[i].task) == re.sub(' ', '', self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter])):
				print "stop mission!"
				#Sending true to the planner makes it stop the current task
				self.SendLocalMission("true", True, self.status.events)	
				self.status.stoppedMission=True
				self.status.task_status = "accomplished"
				break
					
		if self.status.stoppedMission == False:
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
				self.checkEvent()
			
		print "list of current ongoing events (",self.status.ongoing_events,")"		
		self.update_manager()

	########Publishers
	def SendTriggerEventStatus(self, status):
		print "answer", status.data
		self.TriggerEventStatusPublisher.publish(status.data)
		
	def SendLocalMission(self, localmission, finite, event):
	# sends the received local mission after checking its feasibility
		mission=Mission()
		mission.mission.data=localmission
		mission.finite.data=finite
		events=''
		for i in range(0, len(event)):
			events=events+', '+event[i]
		mission.events.data=events

		self.status.sent=True
		self.status.resend_task=rospy.Time.now()
		self.status.task_status_lock = False
		self.status.task_status = ""
		#Checks if the next task is an action, and if it is and it is not in the actions pool described in the DSL it is not sent
		helper = mission.mission.data.split(" ", 1)	
		if len(helper) > 1:
			helper3 = re.sub('[()]', '', helper[1])
		else:
			helper3 = re.sub('[()]', '', helper[0])
		helper2 = re.sub('[()]', '', mission.mission.data)
		if (self.status.prog_action.match(helper2) and helper3 in self.status.actions) or not self.status.prog_action.match(helper2):
			print "------------------------------------------------"	
			print "Current task", mission.mission.data, "(",mission.finite.data,") of mission", self.missions[self.status.counter_mission].mission.mission, "(branch",self.status.counter_mission,"task",self.missions[self.status.counter_mission].counter,")"
			print "------------------------------------------------"
			# Do not send the keywords as missions!
			if not self.status.prog_eh_task.match(mission.mission.data) and not self.status.prog_cond_task.match(mission.mission.data) and not self.status.prog_fb_task.match(mission.mission.data):
				self.LocalMissionPublisher.publish(mission)
			else:
				print "else"
				self.update_manager()
		else:
			print "Not recognized action(",mission.mission.data,"), task will not be sent"
			
		if mission.mission.data == 'true':
			self.update_manager()
			
	################Executing callbacks
	def returnIndex(self, operator, rex, instantiation, previous):
		index=0
		for index in range(0, len(previous)):
			if previous[index] == self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) and \
			instantiation[index].result != None:
				break
							 
		equal=False
		for n in range(0, len(instantiation)):
			if self.missions[self.status.counter_mission].parent != None:
				for j in range(0, len(self.missions[self.missions[self.status.counter_mission].parent].children)):
					if self.missions[self.status.counter_mission].id == self.missions[self.missions[self.missions[self.status.counter_mission].parent].children[j]].id:
						equal=True
						break
			if equal:
				if instantiation[index].result != None and instantiation[index].check_again <= 1:
					instantiation[index].check_again+=1
				elif instantiation[index].result != None and instantiation[index].check_again > 1:
					instantiation[index].result = None
					instantiation[index].check_again=0
				if operator == "eh":
					self.status.counter_eh=n
					self.status.event_handler=instantiation
				if operator == "fb":
					self.status.counter_fb=n
					self.status.fallback=instantiation
				if operator == "cond":
					self.status.counter_cond=n
					self.status.condition=instantiation
				equal=False
				break
		return index

	
	def checkOperator(self):
		index=0
		####Event handler
		if self.status.prog_eh_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		len(self.status.event_handler)>0:
			index=self.returnIndex("eh", self.status.prog_eh_task, self.status.event_handler, self.status.prev_eh)
		if self.status.prog_eh_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		(len(self.status.event_handler)==0 or \
		self.status.event_handler[index].result == None):
			for i in range(0, len(self.missions[self.status.counter_mission].children)):
				#If the keyword eh is detected, the code checks where is the default mission of the event handler and jumps to it.
				if self.missions[self.missions[self.status.counter_mission].children[i]].id == "eh_default": 
					self.instantiateOperator("eh", self.status.prev_eh, self.status.flag_eh, self.status.counter_eh, self.status.event_handler, self.status.prog_eh, i)
					break

		####Fallback
		if self.status.prog_fb_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		len(self.status.fallback)>0:
			index=self.returnIndex("fb", self.status.prog_fb_task, self.status.fallback, self.status.prev_fb)
		if self.status.prog_fb_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		(len(self.status.fallback)==0 or \
		self.status.fallback[index].result == None):
			for i in range(0, len(self.missions[self.status.counter_mission].children)):
				#If the keyword fb is detected, the code checks where is the first branch of the fallback and jumps to it.
				if self.missions[self.missions[self.status.counter_mission].children[i]].id == "fb_1": 
					self.instantiateOperator("fb", self.status.prev_fb, self.status.flag_fb, self.status.counter_fb, self.status.fallback, self.status.prog_fb, i)
					break

		####Condition
		if self.status.prog_cond_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		len(self.status.condition)>0:
			index=self.returnIndex("cond", self.status.prog_cond_task, self.status.condition, self.status.prev_cond)		
		if self.status.prog_cond_task.match(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter]) and \
		(len(self.status.condition)==0 or \
		self.status.condition[index].result == None):
			for i in range(0, len(self.missions[self.status.counter_mission].children)):
				#If the keyword cond is detected, the code checks where is the first branch of the condition and jumps to it.
				if self.status.prog_cond.match(self.missions[self.missions[self.status.counter_mission].children[i]].id): 
					self.instantiateOperator("cond", self.status.prev_cond, self.status.flag_cond, self.status.counter_cond, self.status.condition, self.status.prog_cond, i)
					break

				
	def instantiateOperator(self, operator, previous, flag, counter, instantiation, rex, i):
		# Checks if the event_handler has been already registered. If not, it instantiates it along with some data
		if not (self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission) in previous): 
			# Increments the operator's counter if it's not the first instantiation
			if flag:
				flag = False
			else:
				counter+=1		
			if operator == "eh":
				instantiation.append(EventHandlerClass())
				instantiation[counter].default_index = self.missions[self.status.counter_mission].children[i]
			elif operator == "fb":
				instantiation.append(FallbackClass())
			elif operator == "cond":
				instantiation.append(ConditionClass())
			instantiation[counter].length=0
			for j in range(i, len(self.missions[self.status.counter_mission].children)):
				if rex.match(self.missions[self.missions[self.status.counter_mission].children[j]].id):
					instantiation[counter].length+=1
					instantiation[counter].index.append(self.missions[self.status.counter_mission].children[j])
			instantiation[counter].id=self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission)
			if operator == "eh" or operator == "cond":
				for j in range(0, instantiation[counter].length):
					instantiation[counter].success.append(True)
					if operator == "cond":
						instantiation[counter].condition_executed.append(False)
			instantiation[counter].result=None
			previous.append(instantiation[counter].id)
			print operator,"operator detected with length",instantiation[counter].length,", id",instantiation[counter].id,\
			", index",instantiation[counter].index, "counter",counter, \
			". Starting from the first item",self.missions[self.missions[self.status.counter_mission].children[i]].mission.mission,"with id",self.missions[self.status.counter_mission].children[i]
		else:
			for j in range(0, len(previous)):
				if previous[j] == self.missions[self.status.counter_mission].id+"-"+str(self.status.counter_mission):
					counter=j
					print "Already registered",operator,"with id",instantiation[counter].id
					break
		self.status.counter_mission=self.missions[self.status.counter_mission].children[i]
		if operator == "eh":
			self.status.prev_eh=previous
			self.status.flag_eh=flag
			self.status.counter_eh=counter
			self.status.event_handler=instantiation
			self.status.prog_eh=rex
		elif operator == "fb":
			self.status.prev_fb=previous
			self.status.flag_fb=flag
			self.status.counter_fb=counter
			self.status.fallback=instantiation
			self.status.prog_fb=rex
		elif operator == "cond":
			self.status.prev_cond=previous
			self.status.flag_cond=flag
			self.status.counter_cond=counter
			self.status.condition=instantiation
			self.status.prog_cond=rex
			
		self.status.resend=True

	def checkEvent(self):
		if self.missions[self.status.counter_mission].id != None and self.missions[self.status.counter_mission].id=="eh_default":
			for i in range(0, len(self.status.event_handler[self.status.counter_eh].index)):
				if len(self.status.event_handler) > 0 and \
				(self.status.detected_event in self.missions[self.status.event_handler[self.status.counter_eh].index[i]].mission.events):
					print "the detected event", self.status.detected_event, "is in the list of triggering events"
					self.status.counter_mission=self.status.event_handler[self.status.counter_eh].index[i]
					print "jump into the mission with id", self.status.counter_mission,",", self.missions[self.status.counter_mission].mission.mission
					self.status.resend = True
					self.status.event_handler[self.status.counter_eh].counter=i
					self.status.counter_mission=self.status.event_handler[self.status.counter_eh].index[self.status.event_handler[self.status.counter_eh].counter]
					break
# 				else:
# 					print "the detected event", self.status.detected_event, "is not in the list of triggering events, I'll keep looking for it"
			self.status.event_flag = False
			
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

	def evaluateResult(self, operator, instantiation, index): 
		#checks whether the target condition or event handler was successful
		for i in range(0, instantiation[index].length):
			if instantiation[index].success[i]:
				instantiation[index].result="success"
			else: 
				instantiation[index].result="failure"
				break
		if operator=="eh":
			self.status.event_handler=instantiation
		elif operator=="cond":
			self.status.condition=instantiation
		print "Operator", operator, "(index",index,") was a",instantiation[index].result

	################Process callback
	def process(self):
		# performs the process of execution at run time
		self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
		# print "------------------------------------------------"	
		# print "Current task", self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], "(",self.missions[self.status.counter_mission].mission.finite,") of mission", self.missions[self.status.counter_mission].mission.mission
		# print "------------------------------------------------"
		if self.missions[self.status.counter_mission].first == True or self.status.resend == True:
			self.missions[self.status.counter_mission].first=False
			self.status.resend = False
			self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	
			
		elif self.status.task_status == "accomplished":		
			print "Task accomplished by the planner"
			self.status.task_status_lock = True
			if((self.missions[self.status.counter_mission].counter + 1) < len(self.missions[self.status.counter_mission].mission.mission)) and \
			(self.missions[self.status.counter_mission].mission.finite == True or self.status.stoppedMission == True):	
				self.status.stoppedMission = False
				self.missions[self.status.counter_mission].counter+=1 
				self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
				self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	
			elif((self.missions[self.status.counter_mission].counter + 1) >= len(self.missions[self.status.counter_mission].mission.mission)) \
			and (self.missions[self.status.counter_mission].mission.finite == True or self.status.stoppedMission == True):
				print "reached end of the tasks list, mission complete!"
				self.status.stoppedMission = False
				#######If reached the end of the mission, time to switch to another mission based on the operator
				###Keyword
				if self.status.counter_mission != 0 and (self.status.prog_eh_task.match(self.missions[self.status.counter_mission].id) or self.status.prog_fb_task.match(self.missions[self.status.counter_mission].id) or self.status.prog_cond_task.match(self.missions[self.status.counter_mission].id)):	
					self.status.task_status == ""						 
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
				###Event handler
				elif self.status.counter_mission != 0 and self.status.prog_eh.match(self.missions[self.status.counter_mission].id):
					self.missions[self.status.counter_mission].counter=0
					if self.missions[self.status.counter_mission].id == "eh_default":
						self.status.counter_mission=self.missions[self.status.counter_mission].parent
						self.status.task_status == "accomplished"
						self.evaluateResult("eh", self.status.event_handler, self.status.counter_eh)
					else:
						self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter]=True
						self.status.counter_mission=self.status.event_handler[self.status.counter_eh].default_index
						self.status.resend = True
					self.status.event_handler[self.status.counter_eh].counter=0

				###Fallback
				elif self.status.counter_mission != 0 and self.status.prog_fb.match(self.missions[self.status.counter_mission].id):
					self.status.fallback[self.status.counter_fb].result = "success"
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
					self.status.task_status == "accomplished"
					self.status.fallback[self.status.counter_fb].counter=0
					
				###Condition
				elif self.status.counter_mission != 0 and self.status.prog_cond.match(self.missions[self.status.counter_mission].id):
					self.missions[self.status.counter_mission].counter = 0
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=True
					if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
						self.status.condition[self.status.counter_cond].counter+=1
						print "Mission with index",self.status.counter_mission,"of condition operator succesfully accomplished, checking the next one", self.missions[self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]].mission.mission 
					elif self.status.condition[self.status.counter_cond].counter+1 >= self.status.condition[self.status.counter_cond].length:
						self.status.condition[self.status.counter_cond].counter=0
						self.evaluateResult("cond", self.status.condition, self.status.counter_cond)
						self.missions[self.status.counter_mission].counter=0
						self.status.counter_mission=self.missions[self.status.counter_mission].parent
						self.status.task_status == "accomplished"
				self.update_manager()

			elif(self.missions[self.status.counter_mission].mission.finite == False and \
				self.status.stoppedMission == False):
					print "reached end of the tasks list, but the last one is not finite!"
					

		elif self.status.task_status == "failure":
			print '!!!a failure occurred during mission execution!!!' 

			#####Event Handler
			if self.status.prog_eh.match(self.missions[self.status.counter_mission].id):
				self.missions[self.status.counter_mission].counter=0
				if self.missions[self.status.counter_mission].id == "eh_default":
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
					self.status.task_status == "accomplished"
					evaluateResult("eh", self.status.event_handler, self.status.counter_eh)
				else:
					self.status.event_handler[self.status.counter_eh].success[self.status.event_handler[self.status.counter_eh].counter]=False
					self.status.counter_mission=self.status.event_handler[self.status.counter_eh].default_index
					self.status.resend = True
				self.status.event_handler[self.status.counter_eh].counter=0
				self.update_manager()

			#####Fallback
			if self.status.prog_fb.match(self.missions[self.status.counter_mission].id):
				self.missions[self.status.counter_mission].counter=0
				if self.status.fallback[self.status.counter_fb].counter+1 < self.status.fallback[self.status.counter_fb].length:
					self.status.fallback[self.status.counter_fb].counter+=1
					self.status.counter_mission=self.status.fallback[self.status.counter_fb].index[self.status.fallback[self.status.counter_fb].counter]
					self.status.resend=True	
				elif self.status.fallback[self.status.counter_fb].counter+1 >= self.status.fallback[self.status.counter_fb].length:
					self.status.fallback[self.status.counter_fb].result = "failure"
					self.status.task_status == "accomplished"
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
					self.status.fallback[self.status.counter_fb].counter=0
				self.update_manager()

			#####Condition
			if self.status.prog_cond.match(self.missions[self.status.counter_mission].id):
				if self.status.condition[self.status.counter_cond].counter+1 < self.status.condition[self.status.counter_cond].length:
					self.status.condition[self.status.counter_cond].counter+=1
					self.status.counter_mission=self.status.condition[self.status.counter_cond].index[self.status.condition[self.status.counter_cond].counter]
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
					print "Mission with index",self.status.condition[self.status.counter_cond].counter,"of condition operator failed, checking the next one",self.missions[self.status.counter_mission].mission.mission
					self.status.resend=True	
				elif self.status.condition[self.status.counter_cond].counter+1 >= self.status.condition[self.status.counter_cond].length:
					self.status.condition[self.status.counter_cond].success[self.status.condition[self.status.counter_cond].counter]=False
					self.status.condition[self.status.counter_cond].counter=0
					self.evaluateResult("cond", self.status.condition, self.status.counter_cond)
					self.missions[self.status.counter_mission].counter=0
					self.status.counter_mission=self.missions[self.status.counter_mission].parent
					self.status.task_status == "accomplished"
				self.update_manager()


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
				self.TriggerEventStatusPublisher = rospy.Publisher('trigger_events_status', String, queue_size = 100)
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
				if (rospy.Time.now().secs - self.status.resend_task.secs) > 40 and self.missions != None and len(self.missions) > 0:
					print "The robot got stucked for",rospy.Time.now().secs - self.status.resend_task.secs,"secs, resending mission"
					self.missions[self.status.counter_mission].mission.finite=self.checkFinite(self.missions[self.status.counter_mission].counter, self.status.counter_mission) 
					self.SendLocalMission(self.missions[self.status.counter_mission].mission.mission[self.missions[self.status.counter_mission].counter], self.missions[self.status.counter_mission].mission.finite, self.status.events)	
				rate.sleep()
			except rospy.ROSInterruptException:
				pass

	@abstractmethod
	def localmission_method(self, map, shared_map, robotstatus, robot_status_robotnumber, localmission, local_mission_robotnumber, robot_pose, robot_pose_robotnumber):
		pass