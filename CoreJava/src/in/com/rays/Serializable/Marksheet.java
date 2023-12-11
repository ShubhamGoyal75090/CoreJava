package in.com.rays.Serializable;

import java.io.Serializable;

public class Marksheet implements Serializable {
	
	public String name = "Null";
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	public transient int total = 0;
	
	
	

}
