package com.sunbeam;

public class CircularQueue {
	private int front;
	private int rear;
	private int arr[];
	private final int size;
	
	public CircularQueue( int size) {
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
		this.size = size;
	}
	
	public boolean isFull() {
		return (this.front==-1 && rear==size-1)||(front==rear && rear!=-1);
	}
	
	public boolean isEmpty() {
		return (this.rear==this.front && rear==-1);
	}
	
	public void push(int data) {
		this.rear=(rear+1)% size;
		arr[rear]=data;
		if(front==-1)
			front++;
	}
	
	public int peek() {
		return arr[front]%size;
	}
	
	public void pop() {
		arr[this.front]=0;
		front=front%size;
		if(front==rear)
			front=rear=-1;
	}	
}
