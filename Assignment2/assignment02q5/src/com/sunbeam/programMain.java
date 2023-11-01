package com.sunbeam;

public class programMain {
	public static void  sortBYSalary(Employee arr[], int size) {
		Employee temp=null;
		for(int i=0 ;i < size-1;i++) {
			for(int j=i+1 ;j < size;j++) {
				if(arr[i].getSalary()>arr[j].getSalary()) {
					temp= new Employee();
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
	}
	
//
//	public static void sortBYSalary(Employee arr[], int size) {
//		Employee temp;
//
//		for (int i = 0; i < size - 1; i++) {
//
//			for (int j = 0; j < size - 1 - i; j++) {
//
//				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
//					// temp= new Employee();
//					temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//				}
//			}
//		}
//	}

	public static void main(String args[]) {

		Employee arr[] = new Employee[3];
		arr[1] = new Employee(2, "ram", 2000);
		arr[0] = new Employee(3, "pranav", 1000);
		arr[2] = new Employee(5, "karam", 4000);

		System.out.println("employee array before sorting");
		for (Employee e : arr) {
			System.out.println(e);
		}

		sortBYSalary(arr, arr.length);

		System.out.println("employee array after sorting");
		for (Employee e : arr) {
			System.out.println(e);
		}

	}
}
