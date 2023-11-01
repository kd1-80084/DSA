package com.sunbeam;

public class Stack {
	List l1;

	public Stack() {
		l1=new List();
	}
	
	public boolean isEmpty() {
		return l1.isEmpty();
	}
	
	public void push(int value) {
		l1.addFirst(value);
	}
	
	public void pop() {
		l1.delFirst();
	}
	
	public int peek() {
		return l1.getHeadData();
	}
	
	public void DisplayStack() {
		System.out.println("Stack: ");
		l1.display();
	}

}
