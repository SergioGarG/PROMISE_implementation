#!/usr/bin/python
######################################################################
# This component receives missions from Rest and converts them into
# ros messages
######################################################################

from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer
import SocketServer
import rospy
import socket
import struct
import cv2
import numpy as np
import sys
import unicodedata
import roslib
import rosparam
import random
import sys
import time
import threading

from Request_Handler import Request_Handler
from Publisher import Publisher
from sys import getsizeof
from std_msgs.msg import String
from cgi import parse_header, parse_multipart
from urlparse import parse_qs
from std_msgs.msg import String

from ms2_kth.msg import * 

import yaml


class Rest:

	def __init__(self):
		rospy.init_node('communication_manager',anonymous=False,disable_signals=True)	
		pubsubport = rospy.get_param('~pubsubport')
		self.publisher=Publisher(pubsubport)	
		thread = threading.Thread(target=self.publisher.run, args=())
        	thread.daemon = True                            # Daemonize thread
        	thread.start()
	
	def publish(self,msg):
			actions = msg.data
			print ("Sending to the subscribers the set of actions %s" %str(actions))
			self.publisher.send("actions %s" %str(actions))

	def run(self):

		for topic in rospy.get_param('~forwardedtopics').split(","):
			print ("Communication manager will forward messages regarding the topic %s" %str(topic))
			subtopic="~" + topic
			rospy.Subscriber(subtopic, String, self.publish) 
	
		port = rospy.get_param('~port')
                topicType = rospy.get_param('~topicName')
		
		while not rospy.is_shutdown():			
			httpd = HTTPServer(('0.0.0.0', port),Request_Handler)
			print ("Waiting for a new mission on the port %s messages will be forwarded on the topic %s" %(port,topicType))

			httpd.serve_forever()

def main():
	print "Running the communication manager"
	rest=Rest()
        rest.run()

if  __name__ == "__main__":
	rest=Rest()
	rest.run()
