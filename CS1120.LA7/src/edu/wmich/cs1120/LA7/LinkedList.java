package edu.wmich.cs1120.LA7;

public class LinkedList<E> {	
	
	Node<E> headCopy = new Node<E>(null);
	
	
	// Determine if the LinkedList is empty.
	public boolean isEmpty() {
		if (headCopy == null) {
			return true;
		}
		else {
		return false;
		}
	}
	// Add object received to the linked list if he/she has the priority.
	public void add(E item) {
		Node<E> newNode = new Node<E>(item);
		if (isEmpty()) {
			headCopy = newNode;
		}
		else {
		headCopy.setNext(newNode);
		}
	}
	// get the object in specific position in the LinkedList used to print the enrolled student contents inside the Course class and return the name
	public E get(int position) {
		E tab = null;
		if(position > size()) {
		}
		else {
			tab = headCopy.getData();
		}
		return tab;
	}
	// Return number of elements in the list.
	public int size() {
		int count = 0;
		while(headCopy != null) {
			count++;
			headCopy = headCopy.getNext();
		}
		
		return count;
	}

}
