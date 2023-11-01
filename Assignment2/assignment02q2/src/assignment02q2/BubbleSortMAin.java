package assignment02q2;

import java.util.Arrays;

public class BubbleSortMAin {
public static void BubbleSort(int arr[], int size) {
	int passes = 0, comparision = 0;
	for (int i = 1; i < size; i++) {
		passes++;
		for (int j = 0; j < size - i; j++) {
			comparision++;
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

			}

		}
	}
	System.out.println("no.of comparision: " + comparision);
	System.out.println("no.of passes: " + passes);
}

public static void improvedBubbleSort(int arr[], int size) {
	int passes = 0, comparision = 0,flag=0;
	for (int i = 1; i < size ; i++) {
		passes++;
		for (int j = 0; j < size - i; j++) {
			comparision++;
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				flag=1;
			}
			

		}
		if(flag==0) {
			break;
		}
	}
	System.out.println("no.of comparision: " + comparision);
	System.out.println("no.of passes: " + passes);
}

public static void main(String[] args) {

	int arr[] = { 33, 22, 66, 55, 44, 11 };
	System.out.println("Array before sort : " + Arrays.toString(arr));
	BubbleSort(arr, arr.length);
	System.out.println("Array after sort : " + Arrays.toString(arr));
	
	int arr1[] = {11, 22, 33, 44, 55, 66};
	System.out.println("Array before sort : " + Arrays.toString(arr));
	improvedBubbleSort(arr1, arr1.length);
	System.out.println("Array after sort : " + Arrays.toString(arr));

}

}

}
