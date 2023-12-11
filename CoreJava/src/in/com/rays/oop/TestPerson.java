package in.com.rays.oop;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setId(10);
		p.setFirstName("shubham");
		p.setLastName("goyal");
		
		System.out.println(p.getId());
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(Person.AVG_AGE);
		
		
	}

}
