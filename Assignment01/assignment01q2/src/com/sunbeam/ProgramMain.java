package com.sunbeam;

import java.util.Scanner;

public class ProgramMain {

	static int searchById(Person arr[], int size, int id) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getEmpid() == id) {
				return i;
			}
		}
		return -1;
	}

	static int searchByName(Person arr[], int size, String name) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	static int searchBySalary(Person arr[], int size, int salary) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getSalary() == salary) {
				return i;
			}
		}
		return -1;
	}


	public static void main(String args[]) {
		int cnt = 0;
		int choice;

		Scanner sc = new Scanner(System.in);
		Person arr[] = new Person[3];
		arr[0] = new Person(4, "krishna", 2000);
		arr[1] = new Person(7, "pranav", 4000);
		arr[2] = new Person(1, "tanay", 1000);

		do {

			System.out.println("**************************");
			System.out.println("0.exit");
			System.out.println("1.searchById");
			System.out.println("2.searchBYName");
			System.out.println("2.searchBYSalary");
			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			System.out.println("**************************");

			switch (choice) {
			case 1: {
				System.out.print("enter the empid to be searched: ");
				int id = sc.nextInt();

				cnt = searchById(arr, arr.length, id);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");
			}
				break;
			case 2:
			{
				System.out.print("enter the emp name to be searched: ");
				String name = sc.next();

				cnt = searchByName(arr, arr.length, name);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");	
			}
				break;
			case 3:{
				System.out.print("enter the emp salary to be searched: ");
				String name = sc.next();

				int salary = searchByName(arr, arr.length, name);

				if (cnt < 0)
					System.out.println("employee is not found");
				else
					System.out.println("Employee is found at " + cnt + " index");	
				
			}
				break;
				
			case 0:
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}

		} while (choice != 0);
	}
}
