/** 
 * Author: Sandra Hawkins
 * Date:   8 Jun 2017
 * Exceptions//SleepingMain.java
 */

public class SleepingMain {

	public static void main(String[] args) /*throws InterruptedException*/ {
		
		System.out.println("Start of main");
		
		/* The Thread.sleep() method is a way of pausing your program for
		 * a number of milliseconds.  It might throw a checked exception and
		 * therefore any call to Thread.sleep() needs to be surrounded in a 
		 * try/ catch. The exception won't actually happen and therefore the
		 * code after the catch will execute */
		try {
			Thread.sleep(3000); // main to sleep for one second
			System.out.println("In the try block");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} finally {
			System.out.println("Finally block, always executes");
		}
		
		System.out.println("End of main");
	}
}

/** OUTPUT
Start of main

*** three second pause ***

In the try block
Finally block, always executes
End of main
*/