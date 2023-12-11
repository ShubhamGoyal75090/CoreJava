package in.com.rays.Testpractice;

public class Testpracticeemployee {

	public static void main(String[] args) {

		Practiceemployee e1 = new Practiceemployee(1, "rrrr", 100);
		Practiceemployee e2 = new Practiceemployee(1, "rrrr", 100);
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
