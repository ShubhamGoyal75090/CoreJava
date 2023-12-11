package in.com.rays.Comparator;

import java.util.Comparator;

public class OrderbynameAsce implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.name.compareTo(m2.name);
		
	}

}
