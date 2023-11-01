package com.sunbeam;

import java.util.Scanner;

public class LinearListMain {

	public static void main(String[] args) {
		LinearList l1=new LinearList();
		int choice=0;
		
		
		do {
				System.out.println("\n0.exit\n1.addfirst\n2.addlast\n3.addatposition\n4.delfirst\n5.dellast\n6.delatposition\n7.dispaly all");
				System.out.print("enter yoiur choice:: ");
				choice= new Scanner(System.in).nextInt();
			
				switch (choice) {
				case 1:{
					System.out.print("enter the value u want to add: ");
					int value= new Scanner(System.in).nextInt();
					l1.addFirst(value);
				}
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 7:
					l1.display();
					break;
	
				default:
					break;
			}
			
		}while(choice!=0);

	}

}
