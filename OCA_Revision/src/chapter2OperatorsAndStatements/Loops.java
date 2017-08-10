/** 
 * Author: Sandra Hawkins
 * Date:   10 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/Loops.java
 */ 

package chapter2OperatorsAndStatements;

public class Loops {

	public static void main(String[] args) {
		
		int j = 10; // 9 
		/* When the condition is false, the body of the loop will 
		 * not execute */
		while (j < 10) {
			System.out.println("In the loop");
			j--;
		}
		
		int i = 0;  // 1 2 3 4 
		
		/* Loops when the condition is true */
		while (i < 4) {
			System.out.println("i : " + i);  // 0 1 2 3 
			i++;  // ++i;  i = i + 1;  i += 1; 
		}
		System.out.println("i after the loop " + i);  // 4 
		
		/* A do while will always execute at least once because
		 * the condition is physically at the bottom. */
		i = 0; // 1 2 3 4
		
		do {
			System.out.println("i : " + i);	// 0 1 2 3 
			i++;
		} while (i < 4);  // fails when 4 < 4
		
		/* How many times will the loop execute: ONCE */
		int num = 11; // 12
		do {
			System.out.println("num : " + num);  // 11
			num++;
		} while (num < 11);
		
		/*		 ONCE per loop    checked before entering
		 * for ( initialisation ; condition ; increment) {} 
		 * 
		 * The increment happens after the body of the loop and
		 * before the condition is checked.
		 */
		//A forever loop
		//for ( ; ; ) {
		//	System.out.println("Inside for");
		//}
		
		//       k = 0 1 2 3 4 
		for (int k = 0; k < 4; k++) {
			System.out.println("k is " + k); // 0 1 2 3 
		}
		
		/* The 3rd/ increment section can have any statement or 
		 * a method call (which can return a value or not). 
		 * You cannot declare variables there.
		 * 
		 *  static int aMethod() {
		 *  		return 22;
		 *  }
		 **/
		for (i = 0, j = 10; i < 4 && j < 11; 
							System.out.println(j++), aMethod()) {
			System.out.println("In the weird for loop.");
		}
		
		// In the weird for loop.
		// 10
		
		int y = 1;
		int  x = 10; // 20
		//					
		//              F        // RHS does not execute - RHS (y-- >2 | x == 20)
		for (x = 20; (x < 10) && ((y-- > 2) | x == 20); x++) { 
			/* Won't execute as the condition is false */
			System.out.println("Inside the dodgy for");
		}
				
		//     d = 10 9 8 7 6 5 4    e = 0 1 2 3 4 5 6
		for ( int d = 10, e = 0; d > 0; d--, e++ ) {
			
			/* if (5 < 5) this is false */
			if (d < e) 
				break;  // breaks out of the loop when 4 < 6
				// and continues with main()
			System.out.println("d : " + d + " e : " + e);
		}
		// System.out.println("d : " + d + " e : " + e);
		// d and e cannot be seen after the loop
		
		/* 
		 * d : 10 e : 0
		 * d : 9 e : 1
		 * d : 8 e : 2
		 * d : 7 e : 3
		 * d : 6 e : 4
		 * d : 5 e : 5
		 */
		
		/* A break statement:    will exit the loop and go to the
		 * code after the } of the loop. 
		 * 
		 * A continue statement: will go to the next iteration
		 * of the loop, when it's a for loop, continue will go
		 * to the 3rd/ increment section. */
		 //  d = 10 9 8 7 6 5 4 3 2 1 0    e = 0 1 2 3 4 5 6 7 8 9 10
		for ( int d = 10, e = 0; d > 0; d--, e++ ) {
			
			if (d < e) 
				continue;  // goes to e++
			
			System.out.println("d : " + d + " e : " + e);
		}	
		/* 
		 * 10 	0 
		 * 9    1 
		 * 8    2 
		 * 7    3
		 * 6    4 
		 * 5    5 
		 */
		
		
		/* WARNING: this is an infinite loop. 
		 * When you reach a continue statement in a do while loop
		 * it jumps straight down to the condition, to see if 
		 * the loop executes again. */
		j = 0; // 0 1 2 3 4 
		do {
			System.out.println("j is " + j);  // 0 1 2 3 4 4 4 4 4 4 4 
			
			if (j == 4)
				continue;   // goes to the condition while (j < 7)
			j++;  // this line is skipped when j is 4
			
		} while (j < 7);
		
		System.out.println("End of main");
	}
	
	static int aMethod() {
		return 22;
	}
}