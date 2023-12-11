package in.com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Testcalender {
	
	public static void main(String[] args) throws ParseException {
		
		String s = "01/11/2023";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(s);

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);

		for (int i = 1; i <= 12; i++) {

			cal.add(Calendar.DATE, 5);

			System.out.println(sdf.format(cal.getTime()));

		 } 
	}

}
