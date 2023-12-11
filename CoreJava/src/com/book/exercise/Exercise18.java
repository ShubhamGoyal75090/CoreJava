package com.book.exercise;

public class Exercise18 {
	public static void main(String[] args) {
		
		int[] arr = { 5, 6, 4, 9, 8 };

		int temp = 0;

		int i, j;

//		System.out.println("elements of original array");
//		
//		//int length = sizeof(arr) / sizeof(arr[0]);
//		
//		for ( i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]+" ");
//		}
		for (i = 0; i < arr.length; i++) {

			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("descending order");

		for (i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

				}
			}
		
		

	}

