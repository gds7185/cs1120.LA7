package edu.wmich.cs1120.LA7;

public class PriorityQueue<E> {
	
	LinkedList<E> list = new LinkedList<E>();
	
	// Determine if the priority queue is empty.
	public boolean isEmpty() {
		if (list == null) {
			return true;
		}
		return false;
	}
	
	//Add object received to the priority queue taking into consideration the rules governing priority.
	public void enqueue(E data) {
		list.add(data);
	}
	
	//Remove the next object to be processed from the priority queue.
	public E dequeue() {
		if (list.isEmpty()) {
	        return null;
	    }
		else {
			E object = list.head.getNext().getData();
	    	return object;
		}
	}
	
//Print the contents of the queue 
	public void Qprint() {
		if(isEmpty() != true) {
			System.out.println("The contents of the Queue: ");
			while (list.head.getNext() != null) {
				System.out.println(list.head.getNext());
			}
			System.out.println("End of Queue");
		}
		else {
			System.out.println("The Queue is empty.");
		}
	} 
	
	
}
