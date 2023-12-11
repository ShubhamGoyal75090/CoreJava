package in.com.rays.Testpractice;

import java.util.Comparator;

public class Marksheeted implements Comparator<Marksheeted> {

	public int id;
	public String name;
	public int marks;

	public Marksheeted(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	
	}

	@Override
	public int compare(Marksheeted m1, Marksheeted m2) {
		if (m1.name.compareTo(m2.name)==0) {
			if (m1.marks - m2.marks == 0) {
				return id;
				
			}
		}
		return id;
		
	}


@Override
public String toString() {

	return id + " " + name + " " + marks;
	}
}