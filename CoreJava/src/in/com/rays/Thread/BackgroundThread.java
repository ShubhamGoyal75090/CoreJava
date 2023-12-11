package in.com.rays.Thread;

public class BackgroundThread extends Thread {
	
	String name = null;
	
	public BackgroundThread(String name) {
		this.name= name;
		
		
	}
	
	public void run() {
		while (true) {
			
			
			try {Thread.sleep(200);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}

}