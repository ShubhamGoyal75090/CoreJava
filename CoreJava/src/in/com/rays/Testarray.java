package in.com.rays;

public class Testarray {
	public static void main(String[] args) {
		 int[] arr =   {2,3,13,11,6,4};
		 int a= arr[0];
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i]> a)
			 
				 a=arr[i];
		 }
			System.out.println("largest="+a);
		}
		 
	
	}
