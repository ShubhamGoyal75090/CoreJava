package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(100);
		list.add(200);
		list.add("one");
		list.add('a');

//	for (int i = 0; i < list.size(); i++) {
//		
//		System.out.println(list.get(i));

		/*
		 * for (Object object : list) { System.out.println(object);
		 */

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			// it.remove();
		}

		System.out.println(list);
	}
}
