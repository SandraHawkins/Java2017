/** 
 * Author: Sandra Hawkins
 * Date:   18 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/SmallArrayExample.java
 */ 

package chapter3CoreJavaAPIs;

public class SmallArrayExample {

	public static void main(String[] args) {
		
		int [] numbers1 = new int [] {42, 55, 49};
		int [] numbers2 = {42, 55, 49};
		
		int [] numbers3;
		/*
		 * The following line won't compile. On the RHS the compiler 
		 * sees an array of ints? shorts? chars? bytes? 
		 * You need to insert 'new int []' for it to compile.
		 */
		// numbers3 = {4, 5, 6};
		
		/* You cannot assign a byte array to an int array reference.
		 * You cannot assign a String array to a Cat array reference. */
		//numbers3 = new byte[] {1, 2, 3};
		
		
		int num1, num2, num3[]; // only num3 is an array
		
		//int [] array1, array2, array3; // all arrays.
		
		int [] array1, array2[], array3; 
		// array1 is 1D array
		// array2 is an 2D int array
		// array3 is 1D array
	} 
}
