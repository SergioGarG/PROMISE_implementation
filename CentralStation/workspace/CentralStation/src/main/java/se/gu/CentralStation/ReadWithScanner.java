package se.gu.CentralStation;

import java.io.*;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class ReadWithScanner {
	
	public static void main(String... aArgs) throws IOException{
		ReadWithScanner text = new ReadWithScanner();
		int port = PORT;
		String mission = "";
		String event = "";

		String[] robots=text.readData(FILE_PATH+"mission_data.ms", "Robots");  
		String[] events=text.readData(FILE_PATH+"mission_data.ms", "Events");
		String[] actions=text.readData(FILE_PATH+"mission_data.ms", "Actions");
		String[] stoppingEvents=text.readData(FILE_PATH+"mission_data.ms", "StoppingEvents");
		// for(int i=0; i<robots.length; i++) log(robots[i]);
		// for(int i=0; i<events.length; i++) log(events[i]);
		// for(int i=0; i<actions.length; i++) log(actions[i]);

		for(int i=0; i<robots.length; i++){
			log(robots[i]);
			if (robots[i] != null) {
				text.send("starts", IP, Integer.toString(port), false);
				mission=text.readFile(FILE_PATH+"mission_"+robots[i]+".ms");
				text.send(mission, IP, Integer.toString(port), false);
				text.send("events_start", IP, Integer.toString(port), false);
				for(int j=0; j<events.length; j++){
					if (events[j] != null && events[j] != "" && events[j] != "\\s+" && mission.contains(events[j].substring(0,2))){
						log(events[j]);
						text.send(events[j], IP, Integer.toString(port), false);
					}  	//&& mission.contains(events[j].substring(0,2)))
				} 
				text.send("events_end", IP, Integer.toString(port), false);
				for(int j=0; j<actions.length; j++){
					if (actions[j] != null){// && mission.contains(actions[j])) {
						log(actions[j]);
						text.send(actions[j], IP, Integer.toString(port), false);
					}
				}
			}
			//text.send("ends", IP, Integer.toString(port), true);

			text.send("stoppingEvents", IP, Integer.toString(port), false);
			for(int j=0; j<stoppingEvents.length; j++){
				log(stoppingEvents[j]);
				String[] tokens=stoppingEvents[j].split(",");
				if (tokens[0].equals(robots[i])) text.send(stoppingEvents[j], IP, Integer.toString(port), false);
			}
			text.send("stoppingEvents_ends", IP, Integer.toString(port), true);
			
			//The port of the communication manager's server is the 13000
			//We will run it in the local machine, so the IP is 127.0.0.1
			port=port-1000;
		}
	}

	//final static String FILE_PATH = "/home/sergio/repos/ICRA_implementation/CentralStation/workspace/Runtime_testing/integrationexample/src-gen/";
	//final static String FILE_PATH = "CentralStation/workspace/Runtime_paper/integrationexample/src-gen/"; 
	//final static String FILE_PATH = "CentralStation/workspace/Runtime_Promise_paper/promise_integration/src-gen/";
	final static String FILE_PATH = "/home/sergio/repos/ICRA_implementation/CentralStation/workspace/Runtime_Promise_testing/promise_integration/src-gen/";
	final static String IP = "127.0.0.1";
	final static int PORT = 13000;
	final static Charset ENCODING = StandardCharsets.UTF_8;

	////////Reads data as number of robots, events and actions
	String[] readData(String aFileName, String keyword) throws IOException {
		Path path = Paths.get(aFileName);
		//String[] robots = new String[(new File(FILE_PATH).list().length)-2];
		String[] scannedtext = null;
		try (Scanner scanner =  new Scanner(path, ENCODING.name())){
			while (scanner.hasNextLine()){
				String currentline = scanner.nextLine();
				String[] tokens = currentline.split("\\s");

				//Scan robots
				if(tokens[0].matches(keyword) && keyword == "Robots") scannedtext = tokens[2].split(",");

				//Scan actions
				if(tokens[0].matches(keyword) && (keyword == "Actions")){		
					String tokens1 = currentline.substring(currentline.indexOf("[") + 1, currentline.indexOf("]"));
					String [] tokens2 = tokens1.split(",");
					tokens2[0] = tokens2[0].substring(1); //removes the first anoying empty space
					String [] tokens3 = new String[tokens2.length-1];
					for (int i=0; i<tokens2.length-1; i++) tokens3[i]=tokens2[i]; //removes the last item (blank)
					String [] tokens4 = null;
					String [] tokens5 = new String[tokens3.length]; 
					for (int i=0; i<tokens3.length; i++) {
						tokens4=tokens3[i].split("\\s");
						tokens5[i]=tokens4[1];
					}
					List<String> cleaner = new ArrayList<String>(Arrays.asList(tokens5)); 
					cleaner.removeAll(Arrays.asList("", null, "\\s+", "\t", " ")); //remove all the blank items of the list
					scannedtext=cleaner.toArray(new String[0]);
				}

				//Scan events
				if(tokens[0].matches(keyword) && (keyword == "Events")){

					String tokens1 = currentline.substring(currentline.indexOf("[") + 1);//, currentline.indexOf("]"));
					String [] tokens2 = tokens1.split(",");
					tokens2[0] = tokens2[0].substring(1); //removes the first anoying empty space
					List<String> cleaner = new ArrayList<String>(Arrays.asList(tokens2)); 
					cleaner.removeAll(Arrays.asList("", null, "\\s+", "\t", " ")); //remove all the blank items of the list
					scannedtext=cleaner.toArray(new String[0]);
				} 

				//Scan stoppingEvents
				if(tokens[0].matches(keyword) && (keyword == "StoppingEvents")){
					String [] tokens1 = currentline.split("}");
					String [] tokens2 = null;
					List<String> cleaner=new ArrayList<String>();// = new ArrayList<String>;
					int j=0;
					for (int i=0; i<tokens1.length;i++){
						if(tokens1[i].contains("{")){
							tokens2 = tokens1[i].split("\\{");
							cleaner.add(tokens2[1]);
						}

					}
					cleaner.removeAll(Arrays.asList("", null, "{", "}")); //remove all the blank items of the list
					scannedtext=cleaner.toArray(new String[0]);
				}

			}  
		}	
		return scannedtext;
	}
	
	////////Reads a mission from a file 
	String readFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		String all;

		try (Scanner scanner =  new Scanner(path, ENCODING.name())){
			scanner.useDelimiter("\\A");
			all = scanner.next();     
			}  
			return all;
		}


		
	////////Sends the mission, events and actions to the communication manager 
	void send(String mission, String ip, String port, Boolean message)  {

		System.out.println("Sending the string "+mission+" using a POST request");

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost("http://"+ip+":"+port);

		List<NameValuePair> params = new ArrayList<NameValuePair>(1);
		//String sentMission=URLEncoder.encode(mission, "UTF-8");
		String sentMission=mission;
		params.add(new BasicNameValuePair("mission",sentMission ));

		try {
			httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		HttpResponse response;
		try {
			response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				InputStream instram = entity.getContent();
				instram.close();
				if (message) JOptionPane.showMessageDialog(null, "Mission correctly sent!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Mission sent to the robot but no answer received!");
			}
		} catch (IOException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot connect with the robot!");
		}
	}

	private static void log(Object aMsg){
		System.out.println(String.valueOf(aMsg));
		//log(scanner.nextLine());
	}
	
} 
