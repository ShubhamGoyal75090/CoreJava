package in.com.rays.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("one");
		v.add("two");
		v.add("three");
		
		
		Enumeration e = v.elements();
		v.add("hello");
		while (e.hasMoreElements()) {
			
		System.out.println(e.nextElement());
	}

	}
}
