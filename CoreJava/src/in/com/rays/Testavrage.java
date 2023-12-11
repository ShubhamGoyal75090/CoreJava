package in.com.rays;

public class Testavrage {
	public static void main(String[] args) {
		
		int n=10;
		int count=0;
		int avg;
		int sum=0;
		
		
		for (int i = 1; i <=20; i++) {
			
			if (i%2!=0) {
				
				sum=sum+i;
				count++;
				
				
			}
			
			
		}
		
		avg=sum/count;
		
		System.out.println(avg);
		
		
	}

}
