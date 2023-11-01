package com.sunbeam;

public class Queue {
	List l1;

	public Queue() {
		l1=new List();
	}
	
	public boolean isEmpty() {
		return l1.isEmpty();
	}
	
	public void push(int value) {
		l1.addFirst(value);
	}
	
	public void pop() {
		l1.delLast();
	}
	
	public int peek() {
		return l1.getTailData();
	}
	
	public void DisplayStack() {
		System.out.println("Queue: ");
		l1.display();
	}

}
