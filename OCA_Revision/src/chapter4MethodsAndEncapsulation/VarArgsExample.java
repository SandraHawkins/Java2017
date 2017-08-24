/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/VarArgsExample.java
 */ 

package chapter4MethodsAndEncapsulation;
/*
 * ... means a variable length array. 
 * You can pass in:
 * - no parameters 
 * - one parameter
 * - two parameters
 * - three parameters 
 * - An array
 */
// java VarArgsExample Hello
public class VarArgsExample {

	public static void main(String... a) {
			
		printArray();  	// no parameters
		printArray(65);
		printArray(12, 24);
		printArray(1, 2, 3);
		printArray( new int [] {2, 4, 6} );
		
		print("Fred");
		print("Fred", 2);
		print("Fred", 2, 4);
		print("Fred", new int [] {2, 4});
	}
	
	
	static void printArray(int... nums) {
		// System.out.println(nums[0]);  // Might cause an 
		// ArrayIndexOutOfBoundsException if nothing is passed in
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	/* Only one parameter can be varArgs and it must be last */
	static void print(String name, int... nums) {
		
	}
}
