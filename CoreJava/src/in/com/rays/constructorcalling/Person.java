package in.com.rays.constructorcalling;

public class Person {
	
	private String firstName;
	private String lastName;
	private String Address;
	
	public Person() {
		
		System.out.println("Person default constructor");
		
	}
	
	public Person(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Person 1 param constructor");
		
	}
	
	public Person(String firstName, String lastName, String Address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Address = Address ;
		System.out.println("Person 2 param constructor");
	}
	 public String getFirstName() {
		return firstName; 
	 }
	 
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 
	 public String getLastName() {
		 return lastName;
	 }
	 
	 public void setlastName(String lastName) {
		 this.lastName = lastName; 
	 }
	 
	 public String getAddress() {
		 return Address;
		 
	 }
	 
	 public void setAddress(String Address) {
		 this.Address = Address;
	 }
		
	

}
