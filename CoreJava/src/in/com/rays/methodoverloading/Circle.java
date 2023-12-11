package in.com.rays.methodoverloading;

public class Circle extends Shape{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area( ) {
		double cArea = 3.14 * getRadius() * getRadius();
		
		System.out.println("Circle Area = " + cArea);
		
				
	}

}
