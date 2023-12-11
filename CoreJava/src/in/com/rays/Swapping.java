package in.com.rays;

public class Swapping {
	public static void main(String[] args) {
		int a = 10, b = 20;

//		
//		c = a ;
//		a = b;
//		b = c;
		/*
		 * a=b+a; b=a+b;
		 */
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a= " + a + " b =" + b);
	}
}