/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/Weekday.java
 */ 

package sheet15Exceptions;

public class Weekday {
	
	private String weekday;
	
	public static final String MONDAY = "monday";
	public static final String TUESDAY = "tuesday";
	public static final String WEDNESDAY = "wednesday";
	public static final String THURSDAY = "thursday";
	public static final String FRIDAY = "friday";
	
	public Weekday() {}
	
	public Weekday(String weekday) throws InvalidWeekdayException {
		setWeekday(weekday);
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) 
						throws InvalidWeekdayException {
		
		/* Using an if/ else to validate the member variable 
		 * instead of the switch statement below. */
//		if (weekday.equalsIgnoreCase("Monday") || 
//				weekday.equalsIgnoreCase("Tuesday") ||
//				weekday.equalsIgnoreCase(WEDNESDAY) || 
//				weekday.equalsIgnoreCase(THURSDAY) ||
//				weekday.equalsIgnoreCase(FRIDAY) ) {
//			this.weekday = weekday;
//		} else {
//			throw new InvalidWeekdayException(weekday + 
//					" is not a valid weekday"); 
//		}
		
		/*
		 * Validating the weekday member variable against the constants.
		 */
		switch (weekday.toLowerCase()) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			this.weekday = weekday;
			break;
		default:
			throw new InvalidWeekdayException(weekday + 
					" is not a valid weekday"); 
			// break;  // unreachable code
		}
	}

	/** 
	 * This toString() converts the weekday member variable to lower case 
	 * and then converts the first character into upper case. 
	 */
	public String toString() {
		weekday = weekday.toLowerCase();
		// Get the first character
		char firstLetter = weekday.charAt(0);
		// Converts the first character to upper case
		char upperCase = Character.toUpperCase(firstLetter);
		// Add the upper case character onto the rest of the weekday
		// string starting at position 2.
		weekday = upperCase + weekday.substring(1);
		
		// .concat() is the same as +
		return "Weekday: ".concat(weekday);
	}
}