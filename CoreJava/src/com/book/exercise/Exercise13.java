package com.book.exercise;

public class Exercise13 {

	public static void main(String[] args) {
		
		int num = 2;
		
		double result = 2;
		
		System.out.println("harmonic series");
		 
		for (int i = num; i > 0; i--) {
			
			result= result + (double)1 / i;
			
			System.out.print(result + " , ");
			
		}

	}
}
