/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * StringsAndStringBuilder//AllAboutStringBuilders.java
 */

public class AllAboutStringBuilders {
	public static void main(String[] args) {
			
		StringBuilder sizeSb = new StringBuilder();
		System.out.println("capacity of an empty StringBuilder: " + 
						   sizeSb.capacity());  // 16
		
		StringBuilder largeSb = new StringBuilder("This is a long StringBuilder");
		System.out.println("length of the largeSb " +  largeSb.length());
		System.out.println("capacity = length + 16 : " + largeSb.capacity());
		
		StringBuilder size8 = new StringBuilder(0);
		System.out.println("capacity of size8: " + size8.capacity());
		size8.append("1234567890");
		System.out.println("capacity of size8 : " + size8.capacity()); // 10
		
		StringBuilder sb1 = new StringBuilder("Hello there");
		StringBuilder sb2 = new StringBuilder("Hello there");
		StringBuilder sb3 = sb1; // sb3 and sb1 will refer to the same object
		System.out.println("sb1 == sb2 : " + (sb1 == sb2));  // false
		System.out.println("sb1 == sb3 : " + (sb1 == sb3));  // true
		
		/*
		 * The StringBuilder class does not override the equals() method
		 * from the Object class. And therefore the inherited equals()
		 * method executes. The Object's equals() method works by using
		 * ==, which will return true only if both references refer
		 * to the same object. In the examples above, only sb1 and sb3
		 * refer to the same objects. 
		 * 
		 * So, if you want to compare the contents of two StringBuilder
		 * object, you must convert both to a String and compare 
		 * Strings using the equals() method in the String class.
		 */
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2)); // false
		
		System.out.println("Sb1 equal sb2: " + 
					sb1.toString().equals(sb2)); // true
		
		StringBuilder text = new StringBuilder("Java");
		text.append(true);
		text.append(123L);
		text.append(12.3);
		text.append((short)10);
		text.append('j');
		System.out.println(text); // Javatrue12312.310j
		
		StringBuilder moreText = new StringBuilder("0123456789");
		/* Deletes from position 4 up to, but not including position 7 */
		moreText.delete(4, 7);
		System.out.println(moreText); // 0123789
		/* Insert: at position 4, insert the String "456".
		 * Insert at position 0 would insert at the beginning */
		moreText.insert(4, "456");
		System.out.println(moreText);

		moreText.reverse();
		System.out.println(moreText);  // 9876543210
		
		System.out.println(moreText.charAt(3));    //  6
		System.out.println(moreText.indexOf("8")); //  1
		
		//                                       0123456
		StringBuilder today = new StringBuilder("Tuesday");
		today.replace(0, 2, "Wedn"); // 012345678
		System.out.println(today);   // Wednesday
		
		today.replace(3, 6, "X");
		System.out.println(today);  // WedXday
		
		StringBuilder tomorrow = new StringBuilder("Wednesday");
		// Convert to a string and use the String's replace method:
		// To convert a String into a StringBuilder, you pass it into
		// the constructor of the StringBuilder.
		tomorrow = new StringBuilder(tomorrow.toString().replace("nes", "X"));
		System.out.println(tomorrow); // WedXday
		
		/* substring() does not change the original StringBuilder,
		 * it returns a new String with those characters. You must
		 * assign it to a variable or print it. */
		String newString = tomorrow.substring(4);  // day
		System.out.println(newString);  
	} 
}