/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q25.java
 */ 

package chapter3Questions;

import java.util.*;

public class Q25 {

	public static void main(String[] args) {
		/*
		 * Strings when sorted, what comes first:
		 * Numbers 0 -> 9.			0 -> 9
		 * Letters A -> Z.			65 -> 91
		 * Letters a -> z.			97 -> 123	
		 */
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		System.out.println(hex);		// [30, 3A, 8, FF]
		
		int x = Collections.binarySearch(hex, "8");		// 2
		int y = Collections.binarySearch(hex, "3A");    // 1
		int z = Collections.binarySearch(hex, "4F");    // -3
		
		/* In the list [30, 3A, 8, FF]:
		 * if you were inserting 4F, it would go into position 2. 
		 * As it's not found, the algorithm for not found is
		 * - (position it would go) - 1
		 * - 2 - 1  =  -3 
		 **/
		System.out.println(x + " " + y + " " + z);

	}

}
