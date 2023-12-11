package in.com.rays;

import java.util.Scanner;

public class Testcalculater {
	
	public static void main(String[] args) {
		
		char operator;
		
		Double number1, number2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("user input");
		
		operator = input.next().charAt(0);
		
		System.out.println("first number");
		
		number1 = input.nextDouble();
		
		System.out.println("second number");
		
		number2 = input.nextDouble();
		
		switch(operator) {
		
		case '+':
			
			result = number1+number2;
			
			System.out.println(number1 + " + " + number2 + " = " + result);
			
			break;
			
		case '-':
			
			result = number1 - number2;
			
			System.out.println(number1 + " - " + number2 + " = " + result);
			
			break;
			
		case '*':
			
			result = number1 * number2;
			
			System.out.println(number1 + " * " + number2 + " = " + result);
			
			break;
			
		case '/':
			
			result = number1 / number2;
			
			System.out.println(number1 + " / " + number2 + " = " + result);
			
			break;
			
			default:
				
				System.out.println(" invalid !!!!");
				
				break;
			
			
		}
		
		input.close();

	}

}
