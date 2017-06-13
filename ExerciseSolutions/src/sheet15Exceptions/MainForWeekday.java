/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/MainForWeekday.java
 */ 

package sheet15Exceptions;

public class MainForWeekday {

	public static void main(String[] args) {
		
		//Weekday w1 = null;
		try {
			Weekday w1 = new Weekday("FundAY");
			System.out.println(w1);
			
		} catch (InvalidWeekdayException e) {
			System.out.println("Problem");
			e.printStackTrace();
		}
		//System.out.println(w1);  // Would print null if there 
		// was an exception thrown on line 15.
		
		try {
			Weekday w1 = new Weekday("friDAY");
			System.out.println(w1);
		} catch (InvalidWeekdayException e) {
			e.printStackTrace();
		}
	}
}
/** OUTPUT
Problem
sheet15Exceptions.InvalidWeekdayException: FundAY is not a valid weekday
	at sheet15Exceptions.Weekday.setWeekday(Weekday.java:51)
	at sheet15Exceptions.Weekday.<init>(Weekday.java:22)
	at sheet15Exceptions.MainForWeekday.main(MainForWeekday.java:15)
Weekday: Friday
*/