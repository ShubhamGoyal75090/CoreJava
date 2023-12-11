package in.com.rays;
 
 
public class Fibonacci {
	public static void main(String[] args) {

		int a=0,b=1,c;
		int sum=0 ;
		for (int x = 1; x <= 10; x++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			sum= sum+c;
			
			
		}
		
		System.out.println("sum = "+sum);
		}
	
}

