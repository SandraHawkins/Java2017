/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q19.java
 */ 

package chapter3Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q19 {

	public static void main(String[] args) {

		int [] num1 = {2, 4, 6, 8};
		int [] num2 = {2, 4, 6, 8};
		
		System.out.println(num1); 				        // [I@15db9742
		System.out.println(Arrays.toString(num1));      // [2, 4, 6, 8]
		
		/* .equals can be called on an array because an array is an
		 * object, but none of the methods are overridden which means
		 * it calls the .equals() in the Object class which uses == */
		System.out.println(num1.equals(num2));  	    // false
		/* The Arrays class in the API is a class containing static
		 * utility methods. */
		System.out.println(Arrays.equals(num1, num2));	// true
		
		ArrayList<Integer> numList1 = new ArrayList<>();
		numList1.add(1);
		numList1.add(2);
		ArrayList<Integer> numList2= new ArrayList<>();
		numList2.add(1);
		numList2.add(2);
		
		System.out.println(numList1.equals(numList2)); // true
		
		List<Object> objList1 = new ArrayList<>(Arrays.asList(num1));
		List<Object> objList2 = new ArrayList<>(Arrays.asList(num2));
		System.out.println(objList1.equals(objList2));  // false
		
		System.out.println("Remove " + objList1.remove("hello")); // false
		System.out.println("remove(20) " + objList1.remove(20));
		// IndexOutOfBoundsException
	}
}