/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/Equality.java
 */ 

package chapter2OperatorsAndStatements;

public class Equality {

	public static void main(String[] args) {
		
		int num = 10;
		double price = 10.0;
		
		/* When you compare two different number types, the smaller 
		 * will be converted into the larger type. e.g. compare
		 * an int to a double, the int will be converted to a double
		 * just for the comparison to take place. */
		System.out.println(num == price);  // true
		
		byte b = 10;
		System.out.println(price == b);		// true
		
		// System.out.println(num == true); // won't compile, different types
		
		// 'c' will be converted into an int for the comparison
		System.out.println(num == 'c'); 
		
		if ('c' > num) {  // 99 > 10
			System.out.println("'c' is bigger than 10");
		}
		
		/* "Hello" when not created with new goes into the String
		 * Constant Pool, when you create a String with the new 
		 * keyword, you get a new String in a new memory location. 
		 * 
		 * 		s1 --> "Hello" <-- s2
		 * */
		String s1 = "Hello";
		String s2 = "Hello" ;
		/* == compares memory address of objects */ 
		System.out.println(s1 == s2);  // true
		
		String s3 = new String("Hello");
		System.out.println(s1 == s3); 	// false
		/* s1.equals(s3) will compare the contents of each string, 
		 * i.e. the letter in each string. */
		System.out.println(s1.equals(s3)); 	// true
		
		String s4 = "Hel" + "lo";  // Literals added together at compile 
		// time and go into the String Constant Pool
		System.out.println(s1 == s4);  // true
		
		String s5 = "Hel";
		String s6 = "lo";
		/* Any other code to change either s5 or s6 */
		String s7 = s5 + s6;  // concatenated at runtime -> new memory
		System.out.println(s1 == s7);	// false
		
		/* A final variable cannot change, therefore their values
		 * can be determined at compile time and will go into the 
		 * String Constant Pool. */
		final String s8 = "Hel";
		final String s9 = "lo";
		String s10 = s8 + s9;
		System.out.println(s1 == s10);	// true
		
		
		String name = "Ted";
		Teddy t1 = new Teddy("Ted");
		/* You can use .equals() to compare ANY two objects, it will
		 * compile but will always be false.  */		
		System.out.println(name.equals(t1)); 		// false
		
		/* The following compares the contents of two strings */
		System.out.println(name.equals(t1.name));   // true
		
		/* Neither "Ted" is created with the new keyword and therefore
		 * both go into the SCP.
		 * Here "Ted" is created with new: 
		 * 			Teddy t1 = new Teddy(new String("Ted")) */
		System.out.println(name == t1.name); 		// true
		
		/* You CANNOT compare different objects with == */
		// System.out.println(name == t1);  // WON'T COMPILE
		
		Teddy t2 = new Teddy("Ted");
		/* .equals() is used to check the contents of two objects, i.e.
		 * check the member variables to see if they match. If you
		 * do not override the equals() method, the class will 
		 * inherit the equals() method from the Object class, which
		 * used == to compare the memory addresses. */
		System.out.println(t1.equals(t2));		// false
		       // identical
		System.out.println(t1 == t2);			// false
	}
}

class Teddy {
	String name;
	
	Teddy(String name) {
		this.name = name;
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teddy other = (Teddy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
}