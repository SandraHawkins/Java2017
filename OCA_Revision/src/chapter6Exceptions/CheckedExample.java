/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/CheckedExample.java
 */ 

package chapter6Exceptions;

import java.io.FileNotFoundException;

public class CheckedExample {

	/*
	 * If you throw an exception from main, it goes back to the JVM
	 * and the JVM will print the stack trace.
	 */
	public static void main(String[] args) {
		try {
			aMethod();
			/* When the exception is thrown in aMethod() below, execution
			 * will look for a matching catch and jump to there, any code
			 * below in the try block will be skipped. */
			System.out.println("This line won't print");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			//java.io.FileNotFoundException: File lost in space
			//at chapter6Exceptions.CheckedExample.aMethod(CheckedExample.java:52)
			//at chapter6Exceptions.CheckedExample.main(CheckedExample.java:19)
			
			System.out.println(e.getMessage()); 
			// File lost in space
			
			System.out.println(e); 
			// java.io.FileNotFoundException: File lost in space
		}
		/*
		 * After you catch an exception, your program will carry on.
		 * The purpose of catching exceptions is to inform the user
		 * of what went wrong, give them a chance to fix it and let
		 * the program carry on. 
		 */
		System.out.println("After the catch, program carries on....");
	}
	
	/*
	 * The declaration 'throws FileNotFoundException' says that 
	 * this method might throw a FileNotFoundException and the calling
	 * code of this method must deal with it. 
	 */
	static void aMethod() throws FileNotFoundException {
		throw new FileNotFoundException("File lost in space");
	}
/*
 * If a method might throw a checked exception, it must deal with it:
 * 
 *  --- Deal with it means :
 * 1) Either put a try catch around the code that generates the exception.
 *    You won't find a try catch around the code:
 *    			throw new XxxException();
 *    instead the method will declare the exception.
 *    
 * 2) The enclosing method should declare that it might 'throws' 
 *    the exception.
 *    
 */	
}
