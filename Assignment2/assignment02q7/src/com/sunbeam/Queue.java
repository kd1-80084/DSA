package com.sunbeam;

public class Queue {
	private int front;
	private int rear;
	private int arr[];
	private final int size;
	
	public Queue( int size) {
		this.front = 0;
		this.rear = 0;
		this.arr = new int[size];
		this.size = size;
	}
	
	public boolean isFull() {
		return this.rear==size;
	}
	
	public boolean isEmpty() {
		return (this.rear==this.front);
	}
	
	public void push(int data) {
		arr[rear]=data;
		this.rear++;
		if(front==-1)
			front++;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public void pop() {
		arr[this.front]=0;
		front++;
	}
	

}
