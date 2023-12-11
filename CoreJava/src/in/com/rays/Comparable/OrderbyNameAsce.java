package in.com.rays.Comparable;

import java.util.Comparator;

public class OrderbyNameAsce implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m1.name.compareTo(m2.name);
		//if(m1.id - m2.id == 0) {
			
			
		}
	}


