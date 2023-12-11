package in.com.rays.Thread;

public class TestWithoutThread {

	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("shubham");
		WithoutThread t2 = new WithoutThread("satyam");
		
	

		t1.run();
		t2.run();

	}

}
