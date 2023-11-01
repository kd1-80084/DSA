package com.sunbeam;

import java.util.Scanner;

public class StackMain {
	 public static void main(String[] args) {
		 
		 int choice=0;
		 Stack s1=new Stack();
		 
		 do {
			 System.out.println("*************");
			 System.out.println("0.exit\n1.push\n2.pop\n3.peek\n4.display");
			 System.out.print("enter your choice: ");
			 choice=new Scanner(System.in).nextInt();
			 System.out.println("*************");

			 switch (choice) {
			 case 0:
				 break;
			case 1:{
				System.out.print("enter the data: ");
				int value=new Scanner(System.in).nextInt();
				s1.push(value);
			}
				break;
			case 2:
				s1.pop();
				break;
			case 3:
				System.out.println("top element: "+ s1.peek()); 
				break;
			case 4:
				s1.DisplayStack();
				break;
			default:
				System.out.println("enter valid choice......");
				break;
			}
			 
		 }while(choice!=0);
		 
	 }

}
