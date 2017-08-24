package chapter3CoreJavaAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatesAndTimes {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println("The date now : " + date1);
		
		LocalTime time1 = LocalTime.now();
		System.out.println("The time now: " +time1);
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println("Date and Time:" + dateAndTime);
		
		LocalDate myBirthday = LocalDate.of(1982,9,4);
		LocalDate myBirthday2 = LocalDate.of(1982,Month.SEPTEMBER,4);
		System.out.println(myBirthday2);
		
		LocalTime time2 = LocalTime.of(16,59); //16:59
		System.out.println(time2);
		
		LocalDateTime dateAndTime2 = LocalDateTime.of(myBirthday,time1);
		System.out.println(dateAndTime2);
		
		LocalDateTime midnightNYE = LocalDateTime.of(2017,Month.DECEMBER,31,23,59);
		
		midnightNYE.plusMinutes(1);
		midnightNYE = midnightNYE.plusMinutes(1);
		System.out.println(midnightNYE);
		
		midnightNYE = midnightNYE.plusMonths(1).plusHours(3);
		System.out.println(midnightNYE);
		
		LocalDate today = LocalDate.now();
		today = today.plusMonths(3);
		today = today.plus(-2,ChronoUnit.MONTHS);
		System.out.println(today);
		
		LocalDate dateJan = LocalDate.of(2018,Month.JANUARY,1);
		LocalTime time9 = LocalTime.of(9,0);
		LocalDateTime dtJan9am = LocalDateTime.of(dateJan,time9);
		System.out.println(dtJan9am);
		dtJan9am = dtJan9am.plusYears(1).plus(2,ChronoUnit.MONTHS).minusHours(1);
		System.out.println(dtJan9am);
		
		Period ofDays = Period.ofDays(6);
		Period ofYears = Period.ofYears(3);
		
		LocalDate today4 = LocalDate.now();
		System.out.println(today4);
		Period days4 = Period.ofDays(4);
		Period weeks18 = Period.ofWeeks(18);
		today4 = today4.plus(days4).plus(weeks18);
		System.out.println(today4);
		
		LocalDate christmas = LocalDate.of(2017,12,25);
		System.out.println(christmas.until(LocalDate.now()));
		
		
	}

}
