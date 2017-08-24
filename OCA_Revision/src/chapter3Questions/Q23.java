/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q23.java
 */ 

package chapter3Questions;

import java.util.*;

public class Q23 {

	public static void main(String[] args) {
		
		/* Arrays.asList(); take in a VarArgs, a variable length
		 * array, you can pass in nothing, one element, two elements,
		 * three elements, etc. or an array.
		 * The elements will be converted into a list.
		 */
		Arrays.asList();
		Arrays.asList(2);
		Arrays.asList(2, 5, 7, 8);
		Arrays.asList(new int [] {1,2,3,4,5,6});
		
		
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		// list - 10, 4, -1, 5
		Collections.sort(list);  // -1, 4, 5, 10 
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
	}
}
