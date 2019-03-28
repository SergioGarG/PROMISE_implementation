/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */
package se.gu.promise.wizards;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Model class containing the data for the holiday wizard
 */
public class MissionModel 
{
	public static final String copyright = "(c) Copyright IBM Corporation 2002.";
		
	// list of robots, spearated by commas
	protected String robots;
	
	// list of locations, spearated by commas
	protected String locations;
	
	// list of events, spearated by commas
	protected String events;
	
	// list of actions, spearated by commas
	protected String actions;
	
	//name of the selected .promise file
	String fileName;
	String path;
	
	// true if the mission needs to be reset
	protected boolean resetMission;



	public String toString()
	{
		String s;
		s="mission{ \n";
		//conditional
		if ((events != null && events != " " && events != "" && events.trim().length() != 0) || 
				(actions != null && actions != " " && actions != "" && actions.trim().length() != 0)) {
			s=s+"\tconditions{ \n";
			if (events != null && events != " " && events != "" && events.trim().length() != 0) {
				events.replaceAll("\\s+","");
				String [] arrOfStr = events.split(","); 
				s=s+"\t\tevents\n "; //then set of events
				for(int i=0; i<arrOfStr.length; i++) {
					if(i!=arrOfStr.length-1)
						s=s+"\t\t"+arrOfStr[i]+": \"description of event "+arrOfStr[i]+"\",\n";
					else
						s=s+"\t\t"+arrOfStr[i]+": \"description of event "+arrOfStr[i]+"\"\n";
				}
			}
			if (actions != null && actions != " " && actions != "" && actions.trim().length() != 0) {
				actions.replaceAll("\\s+","");
				s=s+"\t\tactions\n "; //then set of actions
				String [] arrOfStr2 = actions.split(","); 
				for(int i=0; i<arrOfStr2.length; i++){
					if(i!=arrOfStr2.length-1)
						s=s+"\t\t"+arrOfStr2[i]+": \"description of action "+arrOfStr2[i]+"\",\n";
					else
						s=s+"\t\t"+arrOfStr2[i]+": \"description of action "+arrOfStr2[i]+"\"\n";
				}
			}
			s=s+"\n\t} \n";
		}
		s=s+"\trobots "; //then set of robots
		s=s+robots+"\n";
		s=s+"\tlocations "; //then set of locations
		s=s+locations+"\n";
		s=s+"\toperators{ parallel{ \n"; 
		s=s+"\t\t// Your operators come here\n";
		s=s+"\t\t}\n";
		s=s+"\t}\n";
		s=s+"}";
		
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		    writer.write(s);
		    writer.close();
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		return s;	
	}
}
