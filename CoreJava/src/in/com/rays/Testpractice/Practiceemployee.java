package in.com.rays.Testpractice;

import com.book.exercise.Exercise1;

import in.com.rays.collection.Employee;

public class Practiceemployee {

	private int id;
	private String name;
	private int salary;

	public Practiceemployee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public int hashCode() {
	String str = id + name + salary;
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Practiceemployee e =  (Practiceemployee) obj;
		boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;
		
		return b;
	}
	
	
		@Override
		public String toString() {

			return id + " "+ name +" " + salary ;
		}

}
