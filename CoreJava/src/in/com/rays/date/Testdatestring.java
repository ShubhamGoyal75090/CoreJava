package in.com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdatestring {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String s = sdf.format(d);
		
		System.out.println(s);
		
		
		
	}

}
