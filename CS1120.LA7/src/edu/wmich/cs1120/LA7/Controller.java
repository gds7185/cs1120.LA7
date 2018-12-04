package edu.wmich.cs1120.LA7;

import java.io.BufferedReader;
import java.util.Scanner;

public class Controller implements IController{
	
	BufferedReader FileIn;
	BufferedReader FileIN1;
	Scanner cou;
	Scanner req;
	
	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses,
			BufferedReader fileIn, BufferedReader fileIn1) {
		FileIn = fileIn;
		FileIN1 = fileIn1;
		
	}
	
	
	@Override
	public void readCourseFile() {
		// TODO Auto-generated method stub
	 cou = new Scanner(FileIn);
	 
	}

	@Override
	public void readRequestFile() {
		// TODO Auto-generated method stub
		req = new Scanner(FileIN1);
		int i = 1;
		while (req.hasNextLine()) {
			i++;
		}
		String[] reqArr = new String[i];
		for (int j = 0; j < i; j++) {
			reqArr[i] = req.nextLine();
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
