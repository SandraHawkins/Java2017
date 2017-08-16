/** 
 * Author: Sandra Hawkins
 * Date:   11 Aug 2017
 * OCA_Revision/chapter2SamplesFromBook/Q9.java
 */ 

package chapter2SamplesFromBook;

public class Q9 {

	public static void main(String[] args) {
		/*
		 * Infinite loop as i is always assigned 0 and the ++ has no
		 * effect.
		 */
		for(int i=0; i<10 ; ) {
			i = i++; //The ++ operator is processed after the assignment
			
			// i is assigned the value of "i++", which is the value 
			// of i before the increment - that is, 0.
			
			System.out.println("Hello World");
		}
	}
}
