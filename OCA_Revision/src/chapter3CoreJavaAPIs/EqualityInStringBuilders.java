/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/EqualityInStringBuilders.java
 */ 

package chapter3CoreJavaAPIs;

public class EqualityInStringBuilders {

	public static void main(String[] args) {
		
		/*
		 * 		s1 --> "Fred"
		 * 
		 * 		s2 --> "Fred"
		 */
		String s1 = new String("Fred");
		String s2 = new String("Fred");
		System.out.println(s1 == s2);			// false
		System.out.println(s1.equals(s2));		// true
		
		/*
		 * 		sb1 --> "Fred"
		 * 
		 * 		sb2 --> "Fred"
		 */
		StringBuilder sb1 = new StringBuilder("Fred");
		StringBuilder sb2 = new StringBuilder("Fred");
		System.out.println(sb1 == sb2);			// false
		/* NOTE: The StringBuilder class does NOT override the
		 * equals() method and instead inherits the one from the
		 * Object class, which uses == to compare memory addresses.
		 **/
		System.out.println(sb1.equals(sb2)); 	// false
		
		
		/*
		 * StringBuilder vs. StringBuffer
		 * 
		 * StringBuilder was added to Java in Java 5. If you come 
		 * across older code, you will see StringBuffer used for 
		 * this purpose. StringBuffer does the same thing but more 
		 * slowly because it is thread safe.
		 */
	}
}