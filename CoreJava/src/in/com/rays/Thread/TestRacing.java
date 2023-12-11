package in.com.rays.Thread;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing t1 = new Racing("shubham");
		Racing t2 = new Racing("rahul");
		
		t1.start();
		t2.start();
		
		
	}

}
