package in.com.rays;

public class Palidromnumber {
public static void main(String[] args) {
	int number =135;
	int r= 0, sum=0, n= number;
	while (n> 0) {
		r= n%10;
		sum= (sum*10)+r;
		n= n/10;
	
		
	}
	if (number== sum) {
		System.out.println("Palidrom="+sum);
		
		
	}
	else {
		System.out.println("not Palidrom="+sum);
	}
}
}
