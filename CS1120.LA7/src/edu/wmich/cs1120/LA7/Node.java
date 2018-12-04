package edu.wmich.cs1120.LA7;

public class Node<E> implements INode<E>{

	private E data;
	private Node<E> next;
	
	public Node(E dataValue) {
		this.data = dataValue;
		next = null;
	}				
	public Node(E dataValue, Node<E> nextNode) {
		this.data = dataValue;
		this.next = nextNode;
	}	
	
	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public Node<E> getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	@Override
	public void setNext(Node<E> next) {
		// TODO Auto-generated method stub
		this.next = next;
	}


}
