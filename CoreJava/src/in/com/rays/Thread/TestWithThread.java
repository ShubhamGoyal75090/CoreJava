package in.com.rays.Thread;

public class TestWithThread {
	
	public static void main(String[] args) {
		 
		WithThread t1 = new WithThread("shubham");
		WithThread t2 = new WithThread("goyal");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		t1.start();
		t2.start();
	}

}
