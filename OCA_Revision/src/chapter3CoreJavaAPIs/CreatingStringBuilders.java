/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/CreatingStringBuilders.java
 */ 

package chapter3CoreJavaAPIs;

public class CreatingStringBuilders {

	public static void main(String[] args) {
		/* You must call a StringBuilder constructor to create a 
		 * StringBuilder. */
		//StringBuilder sb1 = "One";
		StringBuilder sb2 = new StringBuilder();		// capacity=16
		/* The default StringBuilder's capacity is 16, so if you 
		 * create a StringBuilder with "Three", the capacity will
		 * be 16 + 5. */
		StringBuilder sb3 = new StringBuilder("Three"); // capacity=21
		StringBuilder sb4 = new StringBuilder(10);		// capacity=10
	
		                               //     012345678
		StringBuilder sb = new StringBuilder("Wednesday");
		/* The following methods are the ones that String and 
		 * StringBuilder have in common: */
		System.out.println(sb.indexOf("nes"));	// 3
		System.out.println(sb.charAt(5));		// s
		System.out.println(sb.length()); 		// 9
		// subString() for a StringBuilder returns a String, it will
		// not change the original StringBuilder
		// Just substring() toString() will not change the original
		// StringBuilder but will return a new String.
		String little = sb.substring(3, 6);
		System.out.println(little); 	// nes  
		
		sb.append(" 16th August");
		System.out.println(sb);		// Wednesday 16th August
		
		//sb.insert("Today is", 0);  // NOOOO, index goes first
		                             // 01234567890123456789
		sb.insert(0, "Today is ");   // Today is Wednesday 16th August
		sb.delete(9, 18);			 // Today is  16th August
		// Delete the space at position 8
		sb.deleteCharAt(8); 		 // Today is 16th August
		sb.reverse();
		System.out.println(sb);		 // tsuguA ht61 si yadoT
		
		String reveredString = sb.toString();
		
		//                                      01234567890123456789
		StringBuilder text = new StringBuilder("Today is Tuesday the 16th");
		// replace(startIndex, endIndex, String to replace
		text.replace(9, 16, "Wednesday"); // Today is Wednesday the 16th
		System.out.println(text);
	}
}