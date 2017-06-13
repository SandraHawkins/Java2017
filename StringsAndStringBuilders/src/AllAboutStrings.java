/** 
 * Author: Sandra Hawkins
 * Date:   9 Jun 2017
 * StringsAndStringBuilder//AllAboutStrings.java
 */

public class AllAboutStrings {

	public static void main(String[] args) {
		
		/* If you ask for a new String, you get a new string each time.
		 * If you create a string and don't use the new keyword, those
		 * strings will be placed in the string constant pool (SCP) and two
		 * reference variables might refer to the same string.
		 * This line: String name4 = name2; 
		 * creates a ref. var. name4 and it refers to the same object as
		 * name2 refers to.
		 */
		String name1 = "Ted";
		String name2 = new String("Ted");
		String name3 = "Ted";
		String name4 = name2;
		String name5 = new String("Ted");
		String name6 = "Te" + "d";  // These string literals are added
		// together at compile time and therefore a new string is NOT
		// created. name6 will refer to "Ted" already in the SCP.
		
		String Te = "Te";
		String d = "d";
		String name7 = Te + d; // Not added together until runtime and
		// possibly the variable Te might have a different value by the
		// time it gets to this line. The new string te + d will not 
		// be added to the SCP.
		
		/* name1 --> "Ted"  <-- name3   (String contants pool)
		 * 		/
		 * name6				"Te"   "d"
		 * 
		 * name2 --> "Ted"  <-- name4
		 * 
		 * name5 --> "Ted"
		 * 
		 * name7 --> "Ted"
		 * 
		 * == compares the memory addresses of two reference variables.
		 * .equals() compares the characters in two Strings.
		 * When string are created at runtime, e.g. "Te" + "d", the 
		 * string constant pool is used.  ** research needed **
		 */
		System.out.println("name1 == name2: " + (name1 == name2)); // false
		System.out.println("name1 == name3: " + (name1 == name3)); // true
		System.out.println("name3 == name4: " + (name3 == name4)); // false
 		System.out.println("name2 == name4: " + (name2 == name4)); // true
		System.out.println("name2 == name5: " + (name2 == name5)); // false
		System.out.println("name1 == name6: " + (name1 == name6)); // true
		System.out.println("name1 == name7: " + (name1 == name7)); // false
		
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		
		/*
		 * ***** Strings are immutable, once created in memory 
		 *       they cannot be changed. ******
		 *  
		 * If you call a string method that appears to change the 
		 * original, it doesn't, it uses the original to produce 
		 * a new string. e.g. text.toUpperCase() will return a
		 * new string, you must reassign this new String to a 
		 * variable or print it or you will lose the new String. 
		 * 
		 * 
		 * Methods you can call on a String.
		 * - charAt(3), returns the character at position 3.
		 * - concat("another string"), same as "one" + "another".
		 * - indexOf("day"), returns the index of "day" in the 
		 * 		string its called on. 
		 * - length(), returns the length of a string.
		 * - replace('o', 'n'), returns a new with any occurrences 
		 * 		of 'o' replaced with 'n' (old with new).
		 * - replace("old", "new")
		 * - substring(3), returns a substring starting at 
		 * 		position 3.
		 * - substring(3, 6), returns a substring starting at 
		 * 		position 3 and up to but not including position 6.
		 * - toLowerCase(), returns a string in lower case.
		 * - toUpperCase(), returns a string in upper case.
		 * - trim(), returns a string with any leading or training
		 * 		spaces chopped off.
		 */
		            // 0123456789
		String text = "It's Friday";
		text.toUpperCase();
		System.out.println(text);	 // It's Friday
		String result = text.toUpperCase();
		System.out.println(result);  // IT'S FRIDAY
		
		System.out.println("text.charAt(5) : " + text.charAt(5)); //F 

		text = text.concat(", Yippee");
		System.out.println(text);
		
		// -1 if not found
		int position = text.indexOf("d");
		System.out.println("d is at position: " + position);
		
		System.out.println("Length : " + text.length());  // 19
		
		//                   old    new
		text = text.replace("Fri", "Satur");
		System.out.println(text);
		System.out.println(text.replace('a', 'x')); // It's Sxturdxy, Yippee
		
		// 01234567890123456789
		// It's Saturday, Yippee
		text = text.substring(15);  // start at position 15
		System.out.println(text);  // Yippee
		
		//                012345678901
		String message = "The weekend";
		// begin index is inclusive
		// end index is exclusive (one less than)
		message = message.substring(4, 8);
		System.out.println(message);  // week
		
		String s = "  Hello     there   !    ";
		System.out.println(s.trim()); // "Hello     there   !"
		
		String a = "apple";
		String b = "banana";
		// returns a negative number if a comes before b in the alphabet
		// returns a positive number if a comes after b in the alphabet
		System.out.println(a.compareTo(b));  // -1
		
		System.out.println("here".compareTo("help")); // +6
		// i.e. 'r' appears 6 places after 'l' in the alphabetic.
	}
}
/** OUPUT 
name1 == name2: false
name1 == name3: true
name3 == name4: false
name2 == name4: true
name2 == name5: false
name1 == name6: true
name1 == name7: false
name1.equals(name2): true
It's Friday
IT'S FRIDAY
text.charAt(5) : F
It's Friday, Yippee
d is at position: 8
Length : 19
It's Saturday, Yippee
It's Sxturdxy, Yippee
Yippee
week
Hello     there   !
-1
6
*/