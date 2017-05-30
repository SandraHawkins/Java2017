import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * RandomStuff//HowToFormatLocalDate.java
 */

public class HowToFormatLocalDate {

	public static void main(String[] args) {
		
		/* To create a LocalDate use the static now() method or of() where
		 * you specify the year, month and day. You can use the Month
		 * enum instead of an int for the month. */
		LocalDate specialDay = LocalDate.of(2005, Month.JULY, 16);
		System.out.println(specialDay);  	// 2005-07-16

		/* To create your own date format, you can use the DateTimeFormatter 
		 * class. The constructor isn't visible so therefore you must use 
		 * one of the static ofXxx() methods to create an instance. The 
		 * ofPattern() method takes a String containing the pattern, see the 
		 * API for a full description of the pattern. P.S. MM is for month
		 * and mm is for minute.  E.g.:
		 */
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(specialDay.format(formatter1));	// 16/07/2005
		
		/*
		 * Another static ofXxx() method in the DateTimeFormatter class 
		 * is ofLocalizedate(), it takes one of the FormatStyle enum values.
		 * There are four Enum constants: FULL, LONG, MEDIUS AND SHORT. E.g.:
		 */
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(
											FormatStyle.LONG);
		System.out.println(specialDay.format(formatter2)); 	// 16 July 2005
	}
}