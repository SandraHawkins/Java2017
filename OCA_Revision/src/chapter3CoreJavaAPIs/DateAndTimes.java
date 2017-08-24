/** 
 * Author: Sandra Hawkins
 * Date:   17 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/DateAndTimes.java
 */ 

package chapter3CoreJavaAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * There are new classes in the API for dealing with dates and times:
 * 
 * - LocalDate: is just a date, e.g. 2016/01/28
 * - LocalTime: is just a time, e.g. 13:45:03.706 (right down to 
 *              milliseconds)
 * - LocalDateTime: contains a date and a time but without a timezone, 
 * 				e.g. 2016-01-28T13:46:11.351
 * 
 * Note: the constructors are private in all classes, you must use 
 * the static now() or of() methods to create an instance.
 */
public class DateAndTimes {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		System.out.println("The date now : " + date1); // 2017-08-17

		LocalTime time1 = LocalTime.now();
		System.out.println("The time now: " + time1);  // 11:02:33.694

		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println("Date and time : " + dateAndTime); 
		// 2017-08-17T11:04:01.174

		LocalDate myBirthday = LocalDate.of(1976, 11, 18);
		LocalDate myBirthday2 = LocalDate.of(1976, Month.NOVEMBER, 18);
		System.out.println(myBirthday2); 	// 1976-11-18

		LocalTime time2 = LocalTime.of(16, 59);
		System.out.println(time2); 			// 16:59
		
		LocalDateTime dateAndTime2 = LocalDateTime.of(myBirthday, time2);
		System.out.println(dateAndTime2); 	// 1976-11-18T16:59

		/* You can add to the fields using plusMonths(3), plusMinutes(55), 
		 * etc. and subtract from the fields using minusDays(6), 
		 * minusSeconds(40), etc.
		 *  
		 * But NOTE that these classes are immutable and therefore you must 
		 * remember to reassign back to the reference to make any changes.
		 */
		LocalDateTime midnightNYE = 
				LocalDateTime.of(2017, Month.DECEMBER, 31, 23, 59);
		midnightNYE.plusMinutes(1);
		System.out.println(midnightNYE); 	// 2017-12-31T23:59

		/* **** NOTE LocalDate and LocalTime are immutable, you 
		 *      must reassign any changes from plus() and minus() ****/
		midnightNYE = midnightNYE.plusMinutes(1);
		System.out.println(midnightNYE);	// 2018-01-01T00:00

		midnightNYE = midnightNYE.plusMonths(1).plusHours(3);
		System.out.println(midnightNYE);	// 2018-02-01T03:00

		/* There are many plus and minus methods, e.g. plusDays(),
		 * plusMinutes(), minusYears(), minusSeconds() and then 
		 * general plus() and minus() methods where you specify
		 * as the second parameter, the unit you want to add or 
		 * subtract from e.g. date2 = date2.plus(10, ChronoUnit.MONTHS); 
		 * 
		 * The second parameter to the plus(int, TemporalUnit) and 
		 * minus(int TemporalUnit) methods must be a TemporalUnit 
		 * which is an interface, ChronoUnit is an enum that implements 
		 * TemporalUnit. 
		 **/
		LocalDate today = LocalDate.now();
		today = today.plusMonths(3);
		today = today.plus(-3, ChronoUnit.MONTHS);
		System.out.println(today);	// 2017-08-17

		/* - Create a date for the 1st January 2018.
		 * - Create a time for 9 a.m. 
		 * - Create a DateTime object using the previous two. 
		 * - Chain together plus() and minus() methods:
		 *   add 1 year and 2 months and take off 1 hour. 
		 **/
		LocalDate dateJan = LocalDate.of(2018, Month.JANUARY, 1);
		LocalTime time9 = LocalTime.of(9, 0);
		LocalDateTime dtJan9am = LocalDateTime.of(dateJan, time9);
		dtJan9am = dtJan9am.plusYears(1).
				plus(2, ChronoUnit.MONTHS).minusHours(1);
		System.out.println(dtJan9am);  // 2019-03-01T08:00

		/* If you attempt to add day units onto a time, you will get
		 * an UnsupportedTemporalTypeException*/
		//time9 = time9.plus(1, ChronoUnit.MONTHS);

		/*
		 * There are two classes Period and Duration:
		 * - Period is a day or more, e.g. a day, week, month or year. 
		 * - Duration is multiple days or less, e.g. a day, hour,
		 *   minute, second or nano.
		 *   
		 * You only need to be able to use a Period object for your 
		 * exam.
		 * 
		 * A Period of time can be used in the plus() and minus() 
		 * methods.
		 */
		Period ofDays = Period.ofDays(6);
		Period ofWeeks = Period.ofWeeks(2);
		Period ofMonths = Period.ofMonths(11);
		Period ofYears = Period.ofYears(3);
		Period ofYearsMonthsDays = Period.of(1, 3, 4); // Years, months, days

		/* Create a Date for today. 
		 * Create a Period of time for 4 days and 18 weeks. 
		 * Add it onto today, what day do you get? */
		LocalDate today4 = LocalDate.now();
		Period days4 = Period.ofDays(4);
		Period weeks18 = Period.ofWeeks(18);
		today4 = today4.plus(days4).plus(weeks18);
		System.out.println(today4);  // 2017-12-25

		/* 
		 * There are also plus(TemporalAmount) and minus(TemporalAmount) 
		 * methods that take a TemporalAmount type which is also an 
		 * interface, Duration and Period are classes that implement 
		 * this interface. 
		 */
		LocalDate christmas = LocalDate.of(2017, 12, 25);
		System.out.println(christmas.until(LocalDate.now())); // P-4M-8D

		Period ofTime = Period.of(1, 2, 3);
		System.out.println(ofTime); 	// P1Y2M3D

		/* ofYears(), ofWeeks() and ofDays() are static methods, only 
		 * the ofDays(4) method will work here, 
		 * i.e. the 3rd of() will replace the 2nd and 1st calls. */
		Period wrong = Period.ofYears(2).ofWeeks(3).ofDays(4);
		System.out.println(wrong);	// P4D

		Period right = Period.ofYears(2);
		right = right.plus(Period.ofWeeks(3));
		right = right.plus(Period.ofDays(4));
		System.out.println(right);  // P2Y25D

		Period sameAs = Period.ofYears(2).
							plus(Period.ofWeeks(3)).
							plus(Period.ofDays(4));
		System.out.println(sameAs);	// P2Y25D		
	}
}