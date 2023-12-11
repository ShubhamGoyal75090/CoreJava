package in.com.rays.collection;

public class TestEmployee {

	public static void main(String[] args) {
		 
		Employee e1 = new Employee(1, "shubham", 2000);
		Employee e2 = new Employee(1, "shubham", 2000);
		
		System.out.println(e1.equals(e2));
         System.out.println("e1.hashCode =" +e1.hashCode());
		System.out.println("e2.hashCode =" +e2.hashCode());
		
		
	}

}
