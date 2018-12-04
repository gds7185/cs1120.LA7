package edu.wmich.cs1120.LA7;

public class Course implements ICourse {

	boolean full = false;
	LinkedList<Object> stu = new LinkedList<Object>();
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		
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
		while (stu.headCopy.getNext()!= null) {
			System.out.println(stu.headCopy.getNext());
		}
	}
	@Override
	public boolean equals(Object arg0) {
		return false;
		
	}
}
