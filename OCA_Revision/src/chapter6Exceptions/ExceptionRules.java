/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/ExceptionRules.java
 */ 

package chapter6Exceptions;

import java.io.IOException;

/*
 * - If you have a try block, there must be a catch or a finally block.
 * 
 * - try, catch and finally must use {}
 * 
 * - You can have many catch blocks but only one finally block and it
 *   must be last.
 *   
 * - If call you a method that might throw a checked exception, 
 *   you must deal with it:
 *   1. Surround the method call with a try/ catch
 *      OR
 *   2. Declare the exception, i.e. the enclosing method must declare
 *      the exception in its signature, e.g. 
 *      
 *      	void aMethod() throws IOException {}
 *       
 * - You cannot catch a checked exception, unless there is code 
 *   in the try block that might cause it. This won't compile:
 *   
 *    	try {
 *    			System.out.println("Hello");
 *      } catch (IOException e) { }
 *   
 * - If you are catching related exceptions (checked or unchecked), 
 *   the child must appear first. 
 *   
 *   	try {   
 *   		....
 *   	} catch (IOException e) {
 *   		....
 *   	} catch (FileNotFoundException e) { // NO! Must be first
 *      	....
 *      }
 * 
 * - You can catch unrelated (not in the same hierarchy) exceptions
 *   in the catch block in any order.  
 * 
 *   	try {   
 *   		....
 *   	} catch (IOException e) {
 *   		....
 *   	} catch (NullPointerException e) {
 *      	....
 *      } catch (RuntimeException e) { 
 *      	....
 *      } catch (Exception e) { }  // must be last, is a parent of IOException
 *   	
 * - The finally block will always execute (whether an exception 
 *   occurred or not) unless JVM shutdown, i.e. System.exit(1);
 *   
 * - Cannot insert random statements in between try / catch/ finally.
 * 
 * 		try {
 * 			...
 *      } 
 *      S.o.pln("NO!");
 *      catch (SomeException e) { }		
 *      
 * - If an exception is thrown, only ONE matching catch will execute.
 *   Two catches in the same block will not execute, only one.
 *   
 * - When you catch an exception, an attempt is made to alert the 
 *   user to fix the problem and the program carries on. 
 **/
 
public class ExceptionRules {

	public static void main(String[] args) {
		try {   
			//throw new IOException();
		
		} catch (NullPointerException e) {
			
		} catch (RuntimeException e) {
			
		//} catch (IOException e) { 
			
		} catch (Exception e) { } 
	}
}
