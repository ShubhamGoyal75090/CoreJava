package in.com.rays.oop;

public class Person {
	private int id;
	private String firstName;
	private String LastName;
	public static final int AVG_AGE = 20;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getLastName() {
		return LastName;
		
	}
	
}
