package JAVA_API.Calander_api;

import java.util.Calendar;

public class Practice_on_calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* You can’t get an instance of Calendar,
		but you can get an instance of a
		concrete Calendar subclass. */
		
		
		Calendar calc = Calendar.getInstance();
		
		/* Printing the current date time */
		
		System.out.println(calc.getTime());
		
		/* Printing the current zone */
		
		System.out.println(calc.getTimeZone());
		
				
		

	}

}
