/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/MainForClock.java
 */ 

package sheet15Exceptions;

public class MainForClock {

	public static void main(String[] args) {
		
		Clock c = new Clock();
		try {
			c.setHours(12);
			c.setMinutes(87);  // exception
			c.setSeconds(33);  // not reached
			
		} catch (InvalidTimeException e) {
			System.out.println("An exception occurred: " 
						+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println(c);  // 12:00:00
		
		try {
			Clock c1 = new Clock(90, 100, 200);
			System.out.println(c1);  // not reached
			
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		// The next line will catch the IncrementProblemException
		// and any other that might occur
		} catch (Exception e) {  // Parent of InvalidTimeException
			System.out.println("Unlikely to execute");
		} finally { // finally must be last
			System.out.println("Finally block always executed");
		} 
		// When you catch an exception, your program carries on.
		System.out.println("End of main");
		
		try {
			Clock c2 = new Clock(9, 1, 15);
			System.out.println(c2);
			
			c2.incrementSeconds(300);
				
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		} catch (IncrementProblemException e) {
			e.printStackTrace();
		}
	}
}
/** OUTPUT
An exception occurred: 87 is invalid for minutes
sheet15Exceptions.InvalidTimeException: 87 is invalid for minutes
	at sheet15Exceptions.Clock.setMinutes(Clock.java:64)
	at sheet15Exceptions.MainForClock.main(MainForClock.java:16)
12:00:00
sheet15Exceptions.InvalidTimeException: 200 is invalid for seconds
	at sheet15Exceptions.Clock.setSeconds(Clock.java:84)
	at sheet15Exceptions.Clock.<init>(Clock.java:23)
	at sheet15Exceptions.MainForClock.main(MainForClock.java:27)
Finally block always executed
End of main
*/