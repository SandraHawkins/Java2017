/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//CannotBeOverdrawn.java
 */

/* If you extend from RuntimeException, it is an unchecked exception,
 * you don't have to write try/ catch code to deal with it, you can 
 * just wait until it happens. E.g. ArithmeticException and
 * ArrayIndexOutOfBounds, then you fix your code.
 *  
 * If you extend from Exception, it is known as a checked Exception,
 * you must provide extra code (i.e. throws clause or try/ catch)
 * or your code won't compile.
 **/
public class CannotBeOverdrawnException extends Exception {
	
	public CannotBeOverdrawnException() {}
	
	public CannotBeOverdrawnException(String message) {
		super(message);
	}
}
