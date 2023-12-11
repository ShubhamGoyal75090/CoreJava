package in.com.rays.Comparable;

public class Marksheet implements Comparable<Marksheet> {

	public int id;
	public String name;
	public int marks;

	public Marksheet(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	@Override
	public String toString() {

		return id + " " + name + " " + marks;
	}

	@Override
	public int compareTo(Marksheet m) {
		
			if(this.marks - m.marks == 0) {
			if(this.name.compareTo(m.name)== 0) {
			return id;

		}
		return this.id - m.id;
		// return this.name.compareTo(m.name);
		// return this.marks - m.marks;

	}
			return id;

}
}