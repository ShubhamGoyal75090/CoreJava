package in.com.rays.Comparator;

import java.util.Comparator;

public class Marksheet implements Comparator<Marksheet> {

	public int id;
	public String name;
	public int marks;

	public Marksheet(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		if (m1.name.compareTo(m2.name) == 0) {
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
