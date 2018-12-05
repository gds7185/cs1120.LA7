package edu.wmich.cs1120.LA7;

public class LinkedList<E> {	
	
	Node<E> head = new Node<E>(null);	
	
	// Determine if the LinkedList is empty.
	public boolean isEmpty() {
		Node<E> headcopy = head;	
		if (headcopy == null) {
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
			head = newNode;
		}
		else {
		head.setNext(newNode);
		}
	}
	
	// get the object in specific position in the LinkedList used to print the enrolled student contents inside the Course class and return the name
	public E get(int position) {
		Node<E> headcopy = head;	
		E tab = null;
		if(position > size()) {
		}
		else {
			tab = headcopy.getData();
		}
		return tab;
	}
	// Return number of elements in the list.
	public int size() {
		Node<E> headcopy = head;
		int count = 0;
		while(headcopy != null) {
			count++;
			headcopy = headcopy.getNext();
		}
		
		return count;
	}

}
