/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/CreatingAndUsingStrings.java
 */ 

package chapter3CoreJavaAPIs;

public class CreatingAndUsingStrings {

	public static void main(String[] args) {
		
		String day = "Wednesday";
		/*day = */day.concat(" 16th August");
		System.out.println(day);  	// Wednesday
		
		day += " 16th";
		System.out.println(day);	// Wednesday 16th
		
		String name1 = "Fluffy";				// goes into the SCP
		String name2 = new String("Fluffy");    // goes into new memory
		
		/*
		 * == compares memory addresses of two objects.
		 */
		System.out.println(name1 == name2);  	// false

		/*
		 * When the intern method is invoked, if the SCP already 
		 * contains a string equal to this String, then the string 
		 * from the pool is returned.
		 * 
		 * 		name1 --> Fluffy  <-- name3
		 *  
		 *  	name2 --> Fluffy
		 */
		String name3 = new String("Fluffy").intern();
		System.out.println(name1 == name3);  	// true
		
		//             012345
		String text = "Phone";
		System.out.println("text.length() : " + text.length()); // 5
		System.out.println("text.charAt(2) : " + text.charAt(2)); // o 
		// .charAt(2) returns a character
		int letter = text.charAt(2); // returns a character
		System.out.println("letter : " + letter);	// 111
		int position = text.indexOf('n');
		System.out.println("position : " + position);  // 3
		
		//                012345678901234567
		String message = "Hello Good Morning";
		/* 
		 * substring() takes two indices, inclusive of the 1st and
		 * exclusive of the second. 
		 */
		System.out.println(message.substring(6, 10)); // Good
		message.toUpperCase();
		System.out.println(message); // Hello Good Morning
		message = message.toUpperCase();
		System.out.println(message); // HELLO GOOD MORNING
		
		String text1 = "Hello";
		String text2 = text1.toUpperCase();					// HELLO
		/* .equals() compares two strings and returns two strings 
		 * if they are the same (their contents are identical) */
		System.out.println(text1.equals(text2)); 			// false
		System.out.println(text1.equalsIgnoreCase(text2));  // true
		// Remember strings are case sensitive
		/* There is also and endsWith() method */ 
		System.out.println(text1.startsWith("he")); 		// false
		System.out.println(text1.toLowerCase().startsWith("he")); // true
		
		// .substring(3) starts at position 3 and returns that string 
		// from that position to the end.
		//               HELLO                    HELLO        LO
		String newText = text1.toUpperCase().replace("l", "x").substring(3);
		System.out.println(newText);  // LO
		char space = '\u0000';		 // space
		System.out.println("--" + space + "--");	// -- -- 
	
		System.out.println("Wednesday".contains("nes"));  // true
		System.out.println("Wednesday".contains("nos"));  // false
		
		String msg = " A       pen! ";
		/* Removes leading and trailing spaces. */
		/* Removes any spaces at the beginning and end but not in 
		 * the middle of the string. */
		msg = msg.trim();
		System.out.println(msg); // A       pen!
		msg = msg.replace(" ", ""); // removes all spaces
		System.out.println(msg);	// Apen!
		//                 0123
		// Insert a space: Apen!
		StringBuilder sb = new StringBuilder(msg);
		sb.insert(1, " ");
		System.out.println(sb.toString());  // A pen!
		/* This wont' work: 
		 * msg = sb;
		 * As you are assigning a StringBuilder object to a String
		 * reference. To convert the StringBuilder into a String, you 
		 * must do this:  msg = sb.toString(); 
		 */
		msg = sb.toString();		
	}
}