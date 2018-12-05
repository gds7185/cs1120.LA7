package edu.wmich.cs1120.LA7;

public class Course implements ICourse {

	boolean full = false;
	LinkedList<Object> stu = new LinkedList<Object>();
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		int maxVal = 0; 
		//Here we need to change this so that maxVal is equal to the class capacity
		//
		//
		//
		//
		
		if (stu.size() == maxVal) {
			return true;
		}
		return false;
	}

	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		stu.add(name);
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		while (stu.head.getNext()!= null) {
			System.out.println(stu.head.getNext());
		}
	}
	@Override
	public boolean equals(Object arg0) {
		return false;
		
	}
}
