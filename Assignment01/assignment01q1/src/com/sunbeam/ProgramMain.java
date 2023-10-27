package com.sunbeam;

import java.util.Scanner;

public class ProgramMain {

	static int linearSearch(int arr[], int size, int key) {
		int counter = 0;
		for (int i = 0; i < size; i++) {
			counter++;
			if (arr[i] == key)
				return counter;
		}
		System.out.println("element not found");
		return counter;

	}

	static int binarySearch(int arr[], int size, int key) {
		int left = 0;
		int right = size - 1;
		int mid;
		int counter = 0;

		while (left <= right) {
			counter++;
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				System.out.println("element at " + mid + " index");
				return counter;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else if (key < arr[mid]) {
				right = mid - 1;
			}
		}
		System.out.println("element not found");
		return counter;
	}

	public static void main(String args[]) {
		int key;
		int cnt;
		int arr[] = { 10, 55, 66, 22, 88, 33 };

		 Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("enter the key to be searched:: "); key = sc.nextInt();
		 * 
		 * cnt=linearSearch(arr, arr.length, key);
		 * 
		 * System.out.println("counter:"+cnt);
		 */

		int arr1[]= {11,22,33,44,55,66};
		System.out.print("enter the key to be searched:: ");
		key = sc.nextInt();

		cnt = binarySearch(arr1,arr1.length, key);

		System.out.println("counter:" + cnt);

		sc.close();
	}

}
