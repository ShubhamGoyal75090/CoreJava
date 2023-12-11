package in.com.rays.Streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<>();

		list.add(new Contestent("shubham", "1"));
		list.add(new Contestent("satyam", "2"));
		list.add(new Contestent("rahul", "5"));
		list.add(new Contestent("gouarav", "10"));
		list.add(new Contestent("riya", "3"));
		list.add(new Contestent("umesh", "12"));
		list.add(new Contestent("himanshu", "9"));
		list.add(new Contestent("amit", "7"));
		list.add(new Contestent("nirmal", "0"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 1).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e);
				});
	}

}
