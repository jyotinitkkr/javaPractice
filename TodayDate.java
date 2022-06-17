package predictOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TodayDate {
	
	public static void main(String args[]) {
		method1();
		method2();
		 
		/*Method 3:
		
		// Time date = (Time)Calendar.getInstance().getTime();
		/*even after using type cast it is giving error and not the correct date format */
		
		/* Method 4:
		date = (String)new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		/*even after using type cast it is giving error and not the correct date format */
		
	}
	
	public static void method1() {

		/*
		 It gives the date and time but date has to be Date type */
		 Date date;
		 date = new Date(System.currentTimeMillis());
		 System.out.println(date);
	}
	
	/*Method 2(works):
	  * It gives the date but date has to be LocalDate type*/
	public static void method2() {
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}

}
