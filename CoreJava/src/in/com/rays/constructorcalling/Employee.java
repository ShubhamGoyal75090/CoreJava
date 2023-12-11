package in.com.rays.constructorcalling;

public class Employee extends Person {
	
 private String designation;
 
 public Employee() {
	 System.out.println("Employee default constructor");
 }
 
 public Employee(String firstName, String lastName, String designation) {
	 
	 super(firstName , lastName);
	 this.designation = designation;
	 System.out.println("Employee param constructor");
 }
 
 public String getDesignation() {
	 return designation;
 }
 
 public void setDesignation(String designation) {
	 this.designation = designation;
	 
 }
	
	
	}


