package com.sunbeam;

public class LinearList {
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;

	public LinearList() {
		this.head = null;
		this.tail = null;
	}

	public boolean IsEmpty() {
		return this.head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (IsEmpty())
			this.head = newnode;
			this.tail = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (IsEmpty()) {
			this.head = newnode;
			this.tail = newnode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
			this.tail = newnode;

		}

	}

	public void display() {
		Node trav = head;
		System.out.println("List:");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
}
