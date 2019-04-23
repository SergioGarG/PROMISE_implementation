# PROMISE platform implementation

In this repository we provide the implementation of PROMISE, our tool for multi-robot mission specification. The contents are mainly divided in two groups:

1. The centralized-allocated software, which is mainly instantiated as an Eclipse workspace (~/PROMISE_implementation/CentralStation/workspace):

	* A meta-model of the system, where operators are defined in a modular way, inheriting characteristics from an abstract class. It permits an easy way of implementing new operators if needed.

	* The DSL, implemented in Xtext and Sirius, (both can be integrated into the same workbench), what permits the mission definition in parallel in both visual and textual fashions. This is indeed a helpful feature since, for instance, while text is able to carry more detailed information, a diagram highlights the relationship between elements much better.

	* An Xtend script (~/PROMISE_implementation/CentralStation/workspace/org.xtext.missionrobots.Mission/src/org/xtext/missionrobots/generator/MissionGenerator.xtend), which automatically generates a mission tree in LTL. This mission tree is sent to each robot, where an appropriate choreographer manages it.

	* A Java executable which sends a mission tree to each corresponding robot, previously defined by the DSL. This is the only part of the centralized software which is not contained in the Eclipse workspace. Its maven package is allocated in (~/PROMISE_implementation/CentralStation/CentralStation). When executed, it sends the mission to each correspinding robot. The IP and ports corresponding with your robots can be edit in the file (~/PROMISE_implementation/CentralStation/CentralStation/src/main/java/se/gu/CentralStation/ReadWithScanner.java). After you saved your changes, you have to build the maven package again by navigating to its folder (~/PROMISE_implementation/CentralStation/CentralStation) and:
        ```sh
        mvn package
        ```
	    However, an already working executable is allocated in the root folder. To execute it just navigate to the root folder and:

        ```sh
        java -jar CentralStation-1.0-SNAPSHOT-jar-with-dependencies.jar 
        ```

    	It assumes that the local machine will forward the missions to the robotic team, starting from the port 13000.
    * We provide a set of plugins that may be installed to simplify the installation.

2. We also provide an implementation to test our work using either real robots or via simulation. For the current implementation of PROMISE we use the ROS middleware to manage the communication between the software components allocated within each robot. The ROS pachages are allocated in (~/ICRA_implementation/sera). We developed two software components:

	* Communication and collaboration manager. It serves as a proxy between the Service-Oriented Architecture paradigm of communication and the ROS environment. 

	* Local mission manager. It encapsulates a high-level choreographer for the mission tree within each robot. The choreographer is the component in charge of reading the lines of the mission tree, choosing the correct branch and going through its set of tasks. 

# Usage of PROMISE

First, the mission specifier needs the Ecplise IDE (https://www.eclipse.org/) to be installed along with Xtext (https://www.eclipse.org/Xtext/) and Sirius (https://www.eclipse.org/sirius/) modelling tools.

The ROS environment must be ready. Launch the required components with the provided bash files. 
```sh
bash set environment.sh GUI-OFF-ON NofRobots
```
For instance, for a scenario with two robots and no Gazebo GUI:
```sh
bash set environment.sh 0 2
```

A planner able to understand LTL formulas as input must be executed as well. For instance: https://github.com/MengGuo/P_MAS_TG

The mission can be send now by using the java executable. Just execute it as explained before:
```sh
java -jar CentralStation-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

The robots will start executing your encoded mission. 


