#!/usr/bin/env python
import rospy
import roslib
import numpy
import Queue
import sys
import time


from localmission import LocalMission

##------------------------------------------------------------------------------------------------
## LOCAL MISSION MANAGER
##------------------------------------------------------------------------------------------------------------------------------------
class DummyLocalMission(LocalMission):
	def __init__(self):
		LocalMission.__init__(self)

	def localmission_method(self, map, shared_map, robotstatus, robot_status_robotnumber, localmission, local_mission_robotnumber, robot_pose, robot_pose_robotnumber):
		pass

if __name__ == '__main__':
	try:
		print 'Calling the dummylocalmission method' 
		mg=DummyLocalMission()
		mg.run_component()
	except rospy.ROSInterruptException:
		pass


	
	
