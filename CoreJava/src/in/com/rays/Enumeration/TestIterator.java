package in.com.rays.Enumeration;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestIterator {

	public static void main(String[] args) {

		ArrayBlockingQueue list = new ArrayBlockingQueue(10);
		list.add(100);
		list.add(200);
		list.add("one");
		list.add('a');
		
		Iterator it= list.iterator();
		
		list.add(200);
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	}

}
