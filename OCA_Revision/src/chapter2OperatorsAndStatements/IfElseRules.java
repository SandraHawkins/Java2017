/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/IfElseRules.java
 */ 

package chapter2OperatorsAndStatements;
/*
 * - The condition in an if must be a boolean.
 * - The else part is optional. An else must directly follow an 
 *   if. 
 * - Without {}, only one statement is part of the if or the else.
 * - {} are optional. If you omit {}, only one statement is permitted.
 * - Many else ifs can follow an if.
 * - You can have zero or one else statements after an if or else if.
 * - If you have an 'else' statement it must be last.
 * - Once a condition is true, then the if else blocks exit.
 * - The else belongs to the closest preceding if, unless the if is
 *   in a block.
 * - Watch out for an assignment to a boolean, e.g. 
 * 			boolean boo = false;
 * 			if (boo = true) // makes boo true
 * 			    // This will execute  
 */

public class IfElseRules {

	public static void main(String[] args) {
		
		int x = 9;

		if (x == 3) 
			System.out.println("x is 3");		// Won't print
		    System.out.println("Hello");		// Not part of the if
		/* Watch out for lack of { }	*/
			
		/* An else must directly follow an if  */
		// else 
		//	System.out.println("else part");	
		    
	    if (x < 5)
			System.out.println("x less than 5");
		else if (x < 10) // many else ifs
			System.out.println("x between 6 and 10");
		else if (x < 20)
			System.out.println("x between 10 and 20");
		else 			// zero or one else at the end
			System.out.println("x is something else");
	    
	    
	    if (x == 1) 
			System.out.println("x is 1");
	    if (x == 2) 
			System.out.println("x is 2");
		else // This else belongs to if (x == 2)
			System.out.println("x is something else");

		// The above is not the same as:
		
		if (x == 1) {
			System.out.println("x is 1");
			if (x == 2) {
				System.out.println("x is 2");
			}
		} else {
			System.out.println("x is something else");
		}
		
		int num = 0;
		if (num > 10) {
			if (num > 20) {
				if (num > 30) {
					System.out.println("num > 30");
				} else {
					System.out.println("Belongs to num < 30");
				}
			} else {
				System.out.println("Belongs to num > 20");
			}
		} else { 
			System.out.println("Belongs to num > 10");
		}
		
		// This is the same as: 
		num = 0;
		if (num > 10) 
			if (num > 20) 
				if (num > 30) 
					System.out.println();
				else System.out.println();
			else System.out.println();
		else System.out.println();
		
		
		boolean boo = false;
		/* 'boo = true' assigns true to boo, this changes boo from 
		 * false to true and evaluates if (true) */
		if (boo = true) {  // if (true)
			/* I cannot have a second local variable called boo */
			//boolean boo = true;
			System.out.println("Boo!");
		}
		System.out.println(boo); 	// true
		
		int a = 1;
		/* The following won't compile as it assigns 2 to a and 
		 * evaluates as if (2) which isn't legal, you must evaluate
		 * a boolean in an if condition. */
		// if (a = 2) {}  // if (2) 
	}
}

