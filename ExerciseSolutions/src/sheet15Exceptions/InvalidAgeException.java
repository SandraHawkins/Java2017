/** 
 * Author: Sandra Hawkins
 * Date:   9 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/InvalidAgeException.java
 */ 

package sheet15Exceptions;

public class InvalidAgeException extends Exception {
	
	public InvalidAgeException() {}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}