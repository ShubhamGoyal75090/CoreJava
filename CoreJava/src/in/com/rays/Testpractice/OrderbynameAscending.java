package in.com.rays.Testpractice;

import java.util.Comparator;

public class OrderbynameAscending implements Comparator<Marksheeted> {

	@Override
	public int compare(Marksheeted m1, Marksheeted m2) {

		return m1.name.compareTo(m2.name);
	}

}
