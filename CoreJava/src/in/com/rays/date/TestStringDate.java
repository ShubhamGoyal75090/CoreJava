package in.com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringDate {
	
	public static void main(String[] args) throws ParseException {
		
		String s = "24/11/1996";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(s);
		
		System.out.println(d);
				
	}

}
