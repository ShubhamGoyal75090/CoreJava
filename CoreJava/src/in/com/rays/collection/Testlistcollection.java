package in.com.rays.collection;

import java.util.ArrayList;
import java.util.List;



public class Testlistcollection {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(55);
		list.add(30);
		list.add(500);
		list.add('b');
		list.add('d');
		
		
		List list1 = new ArrayList();
		
		list1.add(100);
		
		list1.add(25);
		
//	list1.addAll(list);
//		System.out.println(list1);
//		list.removeAll(list1);
		System.out.println(list);
//		list.retainAll(list1);
//		System.out.println(list);
		
		System.out.println(list.indexOf(30));
		//System.out.println(list1.lastIndexOf());
		System.out.println(list.subList(0, 5));
		
		
		
		
	
	}

}