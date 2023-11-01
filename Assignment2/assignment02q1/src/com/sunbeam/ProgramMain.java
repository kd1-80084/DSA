package com.sunbeam;

import java.util.Arrays;

public class ProgramMain {

	public static int selectionSort(int arr[], int size) {
			int count = 0;
			for (int i = 0; i < size - 1; i++) {
				for (int j = i + 1; j < size; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						count++;
					}
				}
			}
			return count;

		}

		public static void main(String[] args) {
			int cnt = 0;
			int arr[] = { 44, 11, 55, 22, 66, 33 };

			System.out.println("array before sort:: " + Arrays.toString(arr));
			cnt = selectionSort(arr, arr.length);
			System.out.println("array after sort:: " + Arrays.toString(arr));
			System.out.println("comparison: " + cnt);

		}

	}


