import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * ArrayLists//ArrayListOfStrings.java
 */

public class ArrayListOfStringsIntro {
	
	public static void main(String[] args) {
		
		/* 
		 * An ArrayList is a resizable array, you add and remove
		 * elements to/ from it. You can search in it, change an
		 * element to something else. You can sort an ArrayList.
		 * 
		 * An Arraylist without using Generics, means that any
		 * Object can be added into the list. See the example below.
		 * Without using <> Generics, you can add any object/ any
		 * datatype at all into the list. 
		 * 
		 * If you use <> Generics, e.g. 
		 * 	
		 * 		ArrayList<String> strList = new ArrayList<>();
		 * 	 
		 * you are telling the compiler to only let you add 
		 * String objects into the list, if you attempt to add in
		 * any other datatype, it won't compile.
		 * No angle brackets is the same as <Object>
		 **/
		ArrayList randomList = new ArrayList();
		randomList.add(true);  // new Boolean(true)
		randomList.add("Hello");
		randomList.add(10);    // new Integer(10);
		randomList.add(12.5);  // new Double(12.5);
		System.out.println(randomList); // [true, Hello, 10, 12.5]
		
		//Collections.sort(randomList); // won't work unless the list
		// is all the one type and that type must implement the 
		// Comparable interface. 
		
		
		/* Without Generics, the get() method will return an 
		 * Object datatype and I must have an Object reference to 
		 * assign it to, and then I can only call the Object's 
		 * method on it, i.e. I can't do much with it. The get() 
		 * method here returns an Object, I must assign it to the
		 * same or a parent. */
		Object o = randomList.get(1); // get returns an Object
		System.out.println("o: " + o);
		
		String s1 = "One";
		String s2 = "Two";
		String s3 = "Three";
		String s4 = "Four";
		String s5 = "Five";
		String s6 = "Six";
		String s7 = "One";  // Don't add to the list
		
		/* With Generics, I am telling the compiler that I only
		 * want to store Strings in this list, the compiler will
		 * make sure that only String objects can be added and
		 * won't compile if any other datatype is added. 
		 * When I call get() on a Generic list, it will return 
		 * a String datatype and I can perform any String method
		 * on it. */
		ArrayList<String> strList = new ArrayList<>();
		strList.add(s1);
		strList.add(s2);
		strList.add(s3);
		strList.add(s4);
		strList.add(s5);
		strList.add(s6);
		/* On the LHS, I can declare a String or an Object. The
		 * get() method returns a String, I must assign it to the
		 * same type or a parent.  */
		String two = strList.get(1);
		System.out.println("two : " + two);
		
		System.out.println(strList); // [One, Two, Three, Four, Five, Six]
		printMyList(strList);  // One, Two, Three, Four, Five, Six 
		
		String [] all = {s1, s2, s3, s4, s5, s6};
		/* Arrays.asList(all): this is a static method in the 
		 * Arrays class in the util package in the API, it takes
		 * in an array and returns a List. */
		
//		strList.addAll( Arrays.asList( 
//					new String[] {s1, s2, s3, s4, s5, s6}  ) ); 
		//        or 
		strList.addAll(Arrays.asList(all));
		
		printMyList(strList);
		// One, Two, Three, Four, Five, Six, One, Two, Three, Four, Five, Six
	}
	
	private static void printMyList(ArrayList<String> myStringList) {
		/* Loop through the list. */
		for (int i = 0; i < myStringList.size(); i++) {
			// Don't print the comma if it's the last element
			if (i == myStringList.size() - 1)
				/* myStringList.get(i) retrieves the String from
				 * the current position in the list (i.e. whatever
				 * i is currently at) */
				System.out.print(myStringList.get(i) + " ");
			else
				System.out.print(myStringList.get(i) + ", ");	
		}
		System.out.println();
	}
}
/** OUTPUT
[true, Hello, 10, 12.5]
o: Hello
two : Two
[One, Two, Three, Four, Five, Six]
One, Two, Three, Four, Five, Six 
One, Two, Three, Four, Five, Six, One, Two, Three, Four, Five, Six 
*/
