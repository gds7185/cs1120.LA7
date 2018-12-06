package edu.wmich.cs1120.LA7;

import java.util.Scanner;

public class Request {
	
	Scanner scan;
	String NAME, DEPT, LEVEL, COURSE_DEPT = "";
	int COURSE_NUM = 0;
	double[][] GPA;
	
	public interface Comparable<T>{  // Pre-existing interface in Java documentation		
			int compareTo(T other);
		}
	
	// Constructor
	public Request(String studentName, String studentDept, String studentLevel,
				String courseDept, int courseNumber, double[][] GPA_Array) {
		
		NAME = studentName;
		DEPT = studentDept;
		LEVEL = studentLevel;
		COURSE_DEPT = courseDept;
		COURSE_NUM = courseNumber;
		GPA = GPA_Array;
	}
	
	// Returns number of years to graduation (0 for seniors, 1 for juniors etc.). This is determined from the 
	// student’s level – senior, junior, etc.
	public int yearsFromGraduation(String level) {
		
		if (level == "Senior") {
			
		return 0;
		}
		else if (level =="Junior") {
			return 1;
		}
		else if (level == "Sophomore") {
			return 3;
		}
		else if (level == "Freshman") {
			return 4;
		}
		else {
			return 5;
		}
	
	}

	// Calculate the GPA for a particular student.
	private double GPA_Cal(double[][] GPA_Array) {
		
		return 0;	
	}

	// Getters for a student’s name and department, and the department and number of a course 
	public void setName(String name) {
		NAME = name;
	}
	public String getName() {
		return NAME;
	}
	public void setStudentDepartment(String stuDepart) {
		DEPT = stuDepart;
	}
	public String getStudentDepartment() {
		return DEPT;
	}
	public void setCourseDepartment(String courseDepart) {
		COURSE_DEPT = courseDepart;
	}
	public String getCourseDepartment() {
		return COURSE_DEPT;
	}
	public void setCourse(int num) {
		COURSE_NUM = num;
	}
	public int getCourse() {
		return COURSE_NUM;
	}
	
}
