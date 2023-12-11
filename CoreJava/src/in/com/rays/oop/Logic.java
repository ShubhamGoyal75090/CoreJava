package in.com.rays.oop;

public class Logic {

//	public void sum(int a, int b) {
//		int c = a + b;
//
//		System.out.println("sum =" + c);
//	}

//	public String name() {
//
//		return "abc";
//	}

	public void isArmstrong(int number) {

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

		}
	}

	public void secondlargest(int[] arr) {
		int min = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				min = max;
				max = arr[i];

			}
			if (min < arr[i] && max > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("second largest =" + min);
	}

}