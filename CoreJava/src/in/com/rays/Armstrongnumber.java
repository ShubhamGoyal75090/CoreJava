package in.com.rays;

public class Armstrongnumber {
	public static void main(String[] args) {

		int number = 154;
		int r = 0;
		int sum = 0;

		int n = number;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);

			n = n / 10;

		}
		if (sum == number)
			System.out.println("Armstrong number");
		else {
			System.out.println("Not Armstrong number");

//		int number = 7896569;
//		int t = 0,sum = 0,n= number;  
//		while (n > 0) {
//			t = n % 10;
//			sum = (sum * 10) + t;
//			n= n / 10;
//
//		}
//		System.out.println( "Reverse number=" + sum);

	}
}
}