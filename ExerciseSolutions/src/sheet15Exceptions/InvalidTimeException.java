/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/InvalidTimeException.java
 */ 

package sheet15Exceptions;

public class InvalidTimeException extends Exception {

	public InvalidTimeException() { }
	
	public InvalidTimeException(String message) {
		super(message);
	}
}