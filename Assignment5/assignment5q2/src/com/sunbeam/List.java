package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.data = value;
			this.next = null;
			this.prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	List(){
		this.head=null;
		this.tail=null;
	}
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public void addFirst(int value) {
		Node nn=new Node(value);
		if(isEmpty())
			head=tail=nn;
		else {
			nn.next=head;
			nn.prev=nn;
			head=nn;
		}
	}
	
	public void delFirst() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			head.next.prev=null;
			head=head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty())
			return;
		else {
			tail.prev.next=null;
			tail=tail.prev;
		}
	}
	
	public void display(){
		Node trav=head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println(" ");
	}
	public int getHeadData() {
		return head.data;
	}
	
	public int getTailData() {
		return tail.data;
	}
}
