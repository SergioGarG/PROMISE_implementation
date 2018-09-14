execute_process(COMMAND "/home/sergio/repos/ICRA_implementation/sera/build/communication_manager/catkin_generated/python_distutils_install.sh" RESULT_VARIABLE res)

if(NOT res EQUAL 0)
  message(FATAL_ERROR "execute_process(/home/sergio/repos/ICRA_implementation/sera/build/communication_manager/catkin_generated/python_distutils_install.sh) returned error code ")
endif()
