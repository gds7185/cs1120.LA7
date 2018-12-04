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
		Node<E> object = list.headCopy.getNext();
		E obj = object.getData();
	    return obj;		
	}
//Print the contents of the queue 
	public void Qprint() {
		System.out.println("The contents of the Queue: ");
		while (list.headCopy.getNext() != null) {
			System.out.println(list.headCopy.getNext());
		}
		System.out.println("End of Queue");
	} 
	
	
}
