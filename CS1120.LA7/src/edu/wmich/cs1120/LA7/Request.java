package edu.wmich.cs1120.LA7;

public class Request {
	
	
	public interface Comparable<T>{  // Pre-existing interface in Java documentation		
			int compareTo(T other);
		}
	// Constructor
	public Request(String studentName, String studentDept, String studentLevel,
				String courseDept, int courseNumber, double[][] GPA_Array) {
		
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

	String Name, studentDepartment, courseDepartment;
	int course;
	
	public void setName(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setStudentDepartment(String stuDepart) {
		studentDepartment = stuDepart;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setCourseDepartment(String courseDepart) {
		courseDepartment = courseDepart;
	}
	public String getCourseDepartment() {
		return courseDepartment;
	}
	public void setCourse(int num) {
		course = num;
	}
	public int getCourse() {
		return course;
	}
	
	
	
	// Getters for a student’s name and department, and the department and number of a course 

}
