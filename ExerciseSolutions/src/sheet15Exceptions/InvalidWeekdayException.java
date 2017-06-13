/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/InvalidWeekdayException.java
 */ 

package sheet15Exceptions;

/**
 * Thrown in the incrementSeconds() method in the Clock class.
 */
public class InvalidWeekdayException extends Exception {
	
	public InvalidWeekdayException() {}
	
	public InvalidWeekdayException(String message) {
		super(message);
	}
}