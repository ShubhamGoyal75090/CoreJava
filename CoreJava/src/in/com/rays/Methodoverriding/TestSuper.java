package in.com.rays.Methodoverriding;

public class TestSuper {
	public static void main(String[] args) {

		Super s = new Super();
		s.area();

		Sub sb = new Sub();
		sb.area();

		Super su = new Sub();
		su.area();
	}

}
