package in.com.rays.Hashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap {
	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		Runnable task1 = () -> map.put("S", 5);
		Runnable task2 = () -> map.remove("D", 4);

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("final Map:" + map);

	}

}
