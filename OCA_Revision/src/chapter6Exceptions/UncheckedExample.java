/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/UncheckedExample.java
 */ 

package chapter6Exceptions;
/*
 * aMethod() will throw an unchecked exception. Unchecked means you 
 * can call the method and you don't have to deal with the exception.
 * 
 * --- Deal with it means :
 * 1) Either put a try catch around your code that calls the method.
 * 2) The enclosing method (main) should declare that it might 'throws' 
 *    the exception.
 *    
 * When the exception occurs, there is no catch code, so the exception
 * is thrown out of main back to the JVM and the JVM will always print
 * the stack trace:
 * 
 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
 *	at chapter6Exceptions.UncheckedExample.aMethod(UncheckedExample.java:20)
 *	at chapter6Exceptions.UncheckedExample.main(UncheckedExample.java:13)
 *
 * The stack trace includes: what method called what method, it can be 
 * read from the bottom up, the exception that occurred and a message
 * to give more information about what went wrong.
 */
public class UncheckedExample {

	public static void main(String[] args) {
			
		aMethod();
		System.out.println("This line won't print");
	}
	
	static void aMethod() {
		/* ArithmeticException thrown by the JVM.  The JVM performs
		 * the calculation and it causes an exception
		 */
		System.out.println("Divide by 0: " + 10 / 0);		
	}
}
/* OUTPUT: the stack trace:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *	at chapter6Exceptions.UncheckedExample.aMethod(UncheckedExample.java:20)
 *	at chapter6Exceptions.UncheckedExample.main(UncheckedExample.java:13)
 */ 
