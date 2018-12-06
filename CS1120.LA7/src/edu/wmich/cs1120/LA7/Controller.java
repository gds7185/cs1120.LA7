package edu.wmich.cs1120.LA7;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Controller implements IController{
	
	LinkedList<Course> myCourses = new LinkedList<Course>();
	PriorityQueue<Request> myRequests = new PriorityQueue<Request>();
	BufferedReader courseFileBR;
	BufferedReader requestFileBR;
	Scanner courseScan;
	Scanner requestScan;
	
	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses,
			BufferedReader fileIn, BufferedReader fileIn1) {
		
		myCourses = courses;
		myRequests = requestQueue;
		courseFileBR = fileIn;
		requestFileBR = fileIn1;
	}
	
	@Override
	public void readCourseFile() {
		 
		//try/catch for buffered reader
		try {
			
			//Strings used for reading input
			String currentLine = "";
			String[] lineArray; 
			
			//Read current line of course.txt
			while((currentLine = courseFileBR.readLine()) != null) {
				
				//Read the comma-separated values from the current line and store in linked list
				lineArray = currentLine.split(",");
				myCourses.add(new Course(lineArray[0], lineArray[1], lineArray[2]));
			}
			courseFileBR.close();
			
		}catch(IOException e) {
			
			System.out.println("Error: Problem reading course file.");
		}
	}

	@Override
	public void readRequestFile() {
		
		requestScan = new Scanner(requestFileBR);
		int i = 1;
		
		while (requestScan.hasNextLine()) {
			i++;
		}
		
		String[] reqArr = new String[i];
		
		for (int j = 0; j < i; j++) {
			reqArr[i] = requestScan.nextLine();
		}
	}

	@Override
	public void addRequest(Request req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processRequests() {
		// TODO Auto-generated method stub
		boolean processed = false;
		
		if (!processed) {
			System.out.println();
		}
	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		
	}
}
