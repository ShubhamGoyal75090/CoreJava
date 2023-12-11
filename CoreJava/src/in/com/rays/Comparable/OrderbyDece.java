package in.com.rays.Comparable;

import java.util.Comparator;

public class OrderbyDece implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		//return m2.name.compareTo(m1.name);
		return m2.id - m1.id;
	}
	
	

}
