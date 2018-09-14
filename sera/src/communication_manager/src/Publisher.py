#!/usr/bin/python
######################################################################
# This component is a publisher component.
# It accepts new connections on a specific ports. 
# It keep tracks of the connected clients and sends messages 
# to those cleints
######################################################################

#:Date: 2001-08-16
#:Version: 1
#:Authors: - Claudio Menghi
#          - cla.menghi@gmail.com

import SocketServer
import socket
from sets import Set

class Publisher:

    # creates a new publisher that is waiting for subscribers on a given port
    # :param pubsubport: string the port upon which the publisher is listening
    def __init__(self, pubsubport):
    	self.socketset=set()
       	self.sock=None
        self.port=pubsubport

    # creates a new publisher that is waiting for subscribers on a given port
    # :param pubsubport: string  the port upon which the publisher is listening
    def run(self):
        self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        HOST = '0.0.0.0'                 # Symbolic name meaning the local host
        self.sock.bind((HOST, self.port))
        self.sock.listen(1)        
        while(True):	
		print('Waiting for a subscriber')
        	conn, addr = self.sock.accept()
        	print('subscriber added')
        	self.socketset.add(conn)
    
    
    # sends a message to all the subscribers
    # :param msg: string the message to be sent
    def send(self, msg):
	
	print('subscriber, sending the message %s ' %str(msg))
    	for socket in self.socketset:
			print('sending the message to the first subscriber')
			#socket.send("ciao")
			socket.send(str(msg)+'\n')
			
def main():
	print "Running the communication manager"
	rest=Publisher()
	rest.run()
	

if  __name__ == "__main__":
	rest=Publisher()
	rest.run()
