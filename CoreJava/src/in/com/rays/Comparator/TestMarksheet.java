package in.com.rays.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add(new Marksheet(5, "shubham", 55));
		list.add(new Marksheet(2, "shubham", 55));
		list.add(new Marksheet(4, "rahul", 64));
		list.add(new Marksheet(3, "riya", 77));
		list.add(new Marksheet(1, "gourav", 98));

		// System.out.println(list);
		Collections.sort(list, new OrderbynameAsce());

		for (Object object : list) {
			System.out.println(object);
		}
	}

}
