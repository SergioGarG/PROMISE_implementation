cmake_minimum_required(VERSION 2.8.3)
project(communication_manager)

find_package(catkin REQUIRED 
					COMPONENTS 
					rospy 
					roscpp
					actionlib_msgs 
					actionlib)

find_package(catkin REQUIRED)


catkin_package()

include_directories(${catkin_INCLUDE_DIRS} )

add_message_files(
    FILES
    MissionLocations.msg
    MissionActions.msg
#   Message2.msg
 )


catkin_python_setup()
