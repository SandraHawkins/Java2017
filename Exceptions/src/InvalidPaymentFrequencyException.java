/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//InvalidPaymentFrequency.java
 * 
 * 
 * This is a checked exception as it extends from Exception. It is
 * used in the Gym class in the setPaymentFrequency() method. 
 */

public class InvalidPaymentFrequencyException extends Exception {

	public InvalidPaymentFrequencyException() {}
	
	public InvalidPaymentFrequencyException(String message) {
		super(message);
	}
}
