package in.com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class Testsetcollection {
	public static void main(String[] args) {
		
	
	
	Set set = new HashSet(); 
	
	set.add(55);
	set.add("two");
	set.add('a');
	set.add(30);
	set.add(30);
	
	for (int i = 0; i < set.size(); i++) {
		System.out.println(set);
	}
	

}
}