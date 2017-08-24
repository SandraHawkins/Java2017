/** 
 * Author: Sandra Hawkins
 * Date:   17 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/FormattingDatesAndTimes.java
 */ 

package chapter3CoreJavaAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {

	public static void main(String[] args) {
		
		/***********************************************************
		 * 
		 *  Formatting a LocalDate using a DateTimeFormatter using
		 *  the styles (short, medium, long and full) :
		 *  
		 *  To create a DateTimeFormatter to format a date you use the
		 *  following code:
		 *  
		 *  DateTimeFormatter dtfShort = 
		 *  	DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		 *  
		 *   - short		17/08/17
		 *   - medium		17-Aug-2017
		 *   - long 		17 August 2017
		 *   - full 		17 August 2017
		 **/
		LocalDate dateNow = LocalDate.now();
		DateTimeFormatter dtfShortDate = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); 
		
		/* There are two ways to use a DateTimeFormatter:
		 * 1. Use the DateTimeFormatter's format method and pass in 
		 *    a LocalDate/ LocalTime/ LocalDateTime
		 * 2. Call the format method on your LocalDate/ LocalTime/
		 *    LocalDateTime and pass in the DateTimeFormatter object. 
		 **/
		// 1. 
		System.out.println(dtfShortDate.format(dateNow));	// 17/08/17
		// 2. 
		System.out.println(dateNow.format(dtfShortDate));	// 17/08/17
		
		DateTimeFormatter dtfLongDate = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dateNow.format(dtfLongDate)); // 17 August 2017
		
		
		/********************************************************
		 * 
		 *  Formatting a LocalTime using a DateTimeFormatter using
		 *  the styles (short, medium, long and full) :
		 *  
		 *  To create a DateTimeFormatter to format a date you use the
		 *  following code:
		 *  
		 *  DateTimeFormatter dtfShort = 
		 *  	DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		 *  
		 *   - short		11:13
		 *   - medium		11:13:35
		 *   - long 		**** exception ****
		 *   - full 		**** exception ****	
		 */
		LocalTime timeNow = LocalTime.now();
		
		DateTimeFormatter dtfShortTime = 
				DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(timeNow.format(dtfShortTime)); // 13:45
		
		DateTimeFormatter dtfLongTime =
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
		
		// The following line throws a java.time.DateTimeException at
		// runtime, as you cannot format a time with LONG or FULL.
		
		//System.out.println(timeNow.format(dtfLongTime));

		/***************************************************************
		 * 
		 *  You can format a LocalDateTime with a DateTimeFormatter using
		 *  the styles short, medium, long and full (for the date) and
		 *  only short and medium for the time :
		 *  
		 *  To create a DateTimeFormatter to format a LocalDateTime you 
		 *  use either of the following code:
		 *  
		 *  1. DateTimeFormatter dtfShort = 
		 *  	DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		 *     Note: both the date and time will be output in the short
		 *     format.
		 *     
		 *  2. DateTimeFormatter dtfMedDateShortTime = 
		 *		DateTimeFormatter.ofLocalizedDateTime(
		 *				FormatStyle.MEDIUM, FormatStyle.SHORT);
		 *     Note: the date will be in a medium format and the
		 *     time in a short format.
		 **/
		LocalDateTime myParty = 
				LocalDateTime.of(2017, Month.NOVEMBER, 18, 20, 30);
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofLocalizedDateTime(
						// long medium      short time
						FormatStyle.MEDIUM, FormatStyle.SHORT);
		System.out.println(myParty.format(dtf)); // 18-Nov-2017 20:30
		
		/**  
		 * Making up your own formats/ patterns for dates and times: 
		 * You create a DateTimeFormatter by using the static
		 * ofPattern() method. The most common patterns are:
		 * 
		 * - d		one digit for the day if it's under 10
		 * - dd		two digits for the day, e.g. 02/12/2016
		 * 
		 * - MM		two digits for the month
		 * - MMM	three characters for the month, e.g. 02/DEC/2016
		 * - MMMM	the full month, e.g. 02/December/2016
		 * 
		 * - uu or yy 		the year as two digits, e.g. 16
		 * - uuuu or yyyy 	the year as four digits, e.g. 2016
		 * 
		 * - e		Number of the day of the week, e.g. 1
		 * - ee		Number of the day of the week, e.g. 01
		 * - eee	Short name of the day of the week, e.g. Tue		
		 * - EEEE	Full name of the day of the week, e.g. Tuesday	
		 * 
		 * - hh		the hour in 12 hour format e.g. 01:15
		 * - HH     the hour in 24 hour format e.g. 13:15
		 * - a		will output AM or PM, e.g. "hh:mm a" will output 12:32 PM
		 *	
		 * - mm		the minutes of the hour
		 * - ss		the seconds of the hour
		 * - n		the nanoseconds of the hour
		 */
		
		DateTimeFormatter dtfMyPattern = 
				DateTimeFormatter.ofPattern("HH:mm:ss:n  dd/MM/yyyy");
		System.out.println(myParty.format(dtfMyPattern));
		// 20:30:00:0  18/11/201
		
		/* Exercise: output the current date and time in the 
		 * following format:
		 * 
		 * Thursday August 17. 2:05 PM */
		dtfMyPattern = DateTimeFormatter.ofPattern(
				"EEEE MMMM d. h:mm a");
		System.out.println(LocalDateTime.now().format(dtfMyPattern));
				// Thursday August 17. 2:11 PM
		
		
		/**
		 * Parsing Dates and Times. Turning a String into a LocalDate
		 * or LocalTime. 
		 *
		 *	String				Formatter needed?
		 *  --------------------------------------------
		 *	2017-08-17			no - it's the default
		 *	12/01/17			FormatStyle.SHORT
		 *	01-Feb-2016			FormatStyle.MEDIUM
		 *	01 February 2016	FormatStyle.LONG or FULL
		 *
		 *	11:50				FormatStyle.SHORT
		 *	11:50:22			FormatStyle.MEDIUM
		 */
		// Date is in default format, so just pass it into parse()
		LocalDate date1 = LocalDate.parse("2017-08-17");
		System.out.println(date1);
		
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate date2 = LocalDate.parse("12/01/17", formatter);
	
		LocalDate date3 = LocalDate.parse("01-Feb-2016", 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

		LocalDate date4 = LocalDate.parse("01 February 2016", 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

	
		/* No need to specify a FormatStyle when parsing the time. */
		String strTime = "16:04:22.123";
		LocalTime time1 = LocalTime.parse(strTime);
	
		String strDateTime = "10/11/17 22:59";
		LocalDateTime dt1 = LocalDateTime.parse(strDateTime, 
				DateTimeFormatter.ofLocalizedDateTime(
						FormatStyle.SHORT));
		System.out.println(dt1);	// 2017-11-10T22:59
		
		String strDateTime2 = "10 November 2017 22:59:22";
		LocalDateTime dt2 = LocalDateTime.parse(strDateTime2, 
				DateTimeFormatter.ofLocalizedDateTime(
						FormatStyle.LONG, FormatStyle.MEDIUM));
		System.out.println(dt2);	// 2017-11-10T22:59:22
	}
}
