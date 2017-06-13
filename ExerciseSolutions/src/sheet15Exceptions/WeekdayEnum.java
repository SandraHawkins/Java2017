/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/WeekdayEnum.java
 * 
 * 
 * If the weekday class were to use an enum instead of a String for the
 * weekday, this is what it might look like.  No error checking is 
 * perfored in the setWeekday() method because enums are validated
 * by the compiler: it is not possible to pass anything other than
 * a Weekday enum value into the setWeekday() method.
 */ 

package sheet15Exceptions;
 
public class WeekdayEnum {

	private Weekday weekday;

	public enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }

	public WeekdayEnum() {}

	public WeekdayEnum(Weekday weekday) {
		setWeekday(weekday);
	}

	public Weekday getWeekday() {
		return weekday;
	}

	public void setWeekday(Weekday weekday) {		
		this.weekday = weekday;
	}

	public String toString() {
		String s = weekday.toString().toLowerCase();
		char first = s.charAt(0);
		char upper = Character.toUpperCase(first);
		return "Weekday: " + upper + s.substring(1);
	}
	
	public static void main(String[] args) {
		WeekdayEnum w1 = new WeekdayEnum(Weekday.TUESDAY);
		System.out.println(w1);
	}
}
