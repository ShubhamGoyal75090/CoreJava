package in.com.rays.Testpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.com.rays.Comparator.Marksheet;

public class TestMarksheeted {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Marksheeted(5, "shubham", 55));
		list.add(new Marksheeted(9, "satyam", 65));
		list.add(new Marksheeted(7, "satyam", 79));
		list.add(new Marksheeted(5, "gourav", 55));

		// System.out.println(list);
		Collections.sort(list, new OrderbynameAscending());

		for (Object object : list) {

			System.out.println(object);

		}

	}

}
