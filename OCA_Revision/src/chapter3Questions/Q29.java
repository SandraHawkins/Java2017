/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q29.java
 */ 

package chapter3Questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q29 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", 
				DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		//date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());
		// 2018 APRIL 30
	}
}