/** 
 * Author: Sandra Hawkins
 * Date:   10 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/Casting.java
 */ 

package chapter2SamplesFromBook;

public class Casting {

	int a = 5;
	
	public static void main(String[] args) {
		int num = 30;
		System.out.println(  (int)(double)num );  // 30 
		/* 30 will print because casting happens from right to left 
		 * num will converted to a double and then back into an int. */
		
		/* Assignment is done right to left. 
		 * Multiply and divide on the same line is left to right */
		int result = 4 * 3 / 6; 
		System.out.println(result);  // 2
		
		byte b = 2; 
		System.out.println(b * 'c'); // 198 // both converted to ints
		
		long x = 10;
		int y = 5;
		y = (int)(y * x);
		
		// same as: 
		
		// y *= x;
		System.out.println(y);
		
		/* The compound operator *= will insert a cast if the value
		 * on the RHS is bigger that the data type it is being 
		 * assigned to. */

		boolean y1 = false;
		boolean x1 = y1 = true;
		System.out.println(y1);
		System.out.println(x1);		
	}
}