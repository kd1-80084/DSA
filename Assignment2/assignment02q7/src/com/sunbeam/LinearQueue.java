package com.sunbeam;

import java.util.Scanner;

public class LinearQueue {
	
	

	public static void main(String[] args) {
		int choice;
		Queue q = new Queue(3);
		Scanner sc=new Scanner(System.in);
		
		do {
				System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:{
					if(q.isFull())
						System.out.println("queue is full");
					else {
						System.out.print("Enter data : ");
						int data = sc.nextInt();
						q.push(data);
					}		
				}
					break;
				case 2:{
					if(q.isEmpty())
						System.out.println("queue is empty");
					else
						q.pop();
				}
					break;
				case 3:{
					if(q.isEmpty())
						System.out.println("queue is empty");
					else
						System.out.println("peeked data: "+q.peek());	
				}
					break;
				case 4:{

				}
				default:
					break;
		}

	}while(choice!=0);
		
}

}
