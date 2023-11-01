package com.sunbeam;

import java.util.Arrays;

public class ProgramMain {

	public static int insertionSort(int arr[], int size) {
		int j, i;
		int comparision = 0;
		for (i = 1; i < size; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0 && temp > arr[j]; j--) { // desending
				comparision++;
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		return comparision;

	}

	public static void main(String[] args) {
		
		int arr[] = { 7, 1, 15, 6, 34, 12, 23 };

		System.out.println("before Sort state of an array is" + Arrays.toString(arr));

		int cnt = insertionSort(arr, arr.length);

		System.out.println("After Sort state of an array is" + Arrays.toString(arr));
		System.out.println("total comparision: " + cnt);


	}

}
