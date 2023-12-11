package in.com.rays;

public class Testbubblesort {
	public 
	static void main(String[] args) {
		int[] arr = { 1200, 700, 800, 100, 1000, 5, 15, 25, 45, 55 };
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j =i + 1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					
					temp =arr[i];
					
					arr[i] = arr[j];
				
				arr[j] = temp;
					
				}

			}
			System.out.println(arr[i]);
		}
		
	}
}

