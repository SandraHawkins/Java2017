/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/ConditionalAndBitwise.java
 */ 

package chapter2OperatorsAndStatements;

public class ConditionalAndBitwise {

	static String name; // null
	
	public static void main(String[] args) {
		/*
		 * Only execute the RHS of the && when the name is not null.
		 * This is a real use of the logical AND operator (short
		 * circuit AND).
		 */
		if (name != null && name.length() > 10) {
			System.out.println("Name is too long");
		} else {
			System.out.println("Name is null or under 10 characters");
		}
			
		
		/*
		 * Conditional operators &&, || 
		 * Bitwise operators &, |, ^
		 * 
		 * && - will equate to true when both sides are true
		 * T && T = T
		 * T && F = F
		 * F && T = F		Won't look at RHS if the LHS is false
		 * F && F = F		Won't look at RHS if the LHS is false
		 * 
		 * || - will equate to true when either side is true
		 * T || T = T		Won't check the RHS if the LHS is true
		 * T || F = T		Won't check the RHS if the LHS is true
		 * F || T = T
		 * F || F = F
		 * 
		 * ! - Boolean invert - NOT
		 * !T = false
		 * !F = true
		 * 
		 * & - will equate to true when both sides are true
		 * T & T = T		Always executes the RHS
		 * T & F = F		Always executes the RHS
		 * F & T = F		Always executes the RHS
		 * F & F = F		Always executes the RHS
		 * 
		 * | - will equate to true when either side is true
		 * T | T = T		Always executes the RHS
		 * T | F = T		Always executes the RHS
		 * F | T = T		Always executes the RHS
		 * F | F = F		Always executes the RHS
		 * 
		 * ^ - XOR - Needs 'exactly' one true to be true
		 * T ^ T = F
		 * T ^ F = T
		 * F ^ T = T
		 * F ^ F = F
		 */
		
		int num = 1;
		if (num == 1 || num == 2) {
			System.out.println("Number is 1 or 2");
		}
		
		/*
		 * Relational operators >, <, >=, <=, instanceof 
		 */
		if (num > 0 && num < 10) {
			System.out.println("Number between 0 and 10 ");
		}
		
		boolean isSummer = false;
		boolean b = !isSummer;
		System.out.println(b); 	// true
		
		/* ! changes isSummer to true and therefore the following
		 * condition reads if (true) */
		if (!isSummer) {
			System.out.println("isSummer will be false");
		}
		System.out.println("!isSummer: " + !isSummer);
		
		int z = 5; // 6
		
		if (++z > 5 || ++z > 6)  // RHS won't execute as true found on left
			z++;  // 7 
		System.out.println("z : " + z);
		
		int b1 = 5; // 6 7 
		
		if (++b1 > 5 && ++b1 > 6)  // Checks the RHS looking for 2 trues
			b1++;  //  8
		System.out.println("b1 : " + b1); // 8
		
		z = 5;  // 6 7 
		if (++z > 5 | ++z > 6)  // | always checks both sides
			z++;  // 8 
		System.out.println("z : " + z);  // 8
		
		z = 5;  // 6 7 
		if (++z < 5 & ++z > 6)  // false
			z++;  //  won't execute as the condition is false
		System.out.println("z : " + z);  // 7 
		
		int x = 2; // 3
		int y = 3; // 4
		
		// y == 2 = false  3 < 4 = true
		if ( (y == x++) | (x < ++y) ) {
			System.out.printf("x = %d, y = %d", x, y);
		}
	}
}