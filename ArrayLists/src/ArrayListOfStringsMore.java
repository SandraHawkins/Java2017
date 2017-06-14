import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * ArrayLists//ArrayListOfStringsMore.java
 */

public class ArrayListOfStringsMore {

	public static void main(String[] args) {
		
		String s1 = "One";
		String s2 = "Two";
		String s3 = "Three";
		String s4 = "Four";
		String s5 = "Five";
		String s6 = "Six";
		String sOne = "One";  // Don't add to the list
		String sNew = new String("One");
		
		ArrayList<String> strList = new ArrayList<>();
		String [] strArray = {s1, s2, s3, s4, s5, s6};
		/* Arrays.asList() converts an array into a List
		 * A List can be passed into the addAll() method of an
		 * ArrayList. */
		strList.addAll(Arrays.asList(strArray));
		//strList.add(s1);
		//strList.add(s2);
		
		System.out.println(strList); // [One, Two, Three, Four, Five, Six]
		
		/* Search in a list: use the contains() method, it will compare
		 * each String in the list to the argument to see if they
		 * String are equivalent using the .equals() method. 
		 * .equals() compare the letters in two String and returns
		 * true if they are the same. 
		 * .contains() will return true or false. */
		System.out.println(strList.contains(s1));		// true
		// if ( eachElementInTheList.equals("One") )
		System.out.println(strList.contains("One"));	// true
		System.out.println(strList.contains(sOne));		// true
		System.out.println(strList.contains(sNew));	    // true
		
		/* Check if two Strings in the ArrayList are the same objects in
		 * memory. */
		strList.add(sOne); 		// adds "One" to the end of the list
		strList.add(sNew);      // adds new String("One");
		System.out.println(strList);
		//  0     1     2     3     4     5    6    7
		// [One, Two, Three, Four, Five, Six, One, One]
		//  == compares memory addresses to see if two Strings are at
		// the same area of memory.
		System.out.println(strList.get(0) == strList.get(6));  // true
		System.out.println(strList.get(0) == strList.get(7));  // false
		System.out.println(s1 == sOne);
		
		// Retrieve the last object in the list
		System.out.println(strList.get(strList.size() - 1));  // One
		
		// remove("Four") will return a boolean if the list contained "Four"
		//                and it was removed
		// remove(4) will remove the element and return that String
		System.out.println(strList.remove("Four")); // true 
		System.out.println(strList); // [One, Two, Three, Five, Six, One]
		
		String removedStr = strList.remove(4);  // Remove "Six"
		System.out.println("Removed from position 4: " + removedStr); // Six
		System.out.println(strList); // [One, Two, Three, Five, One, One]
		
		System.out.println("Size: " + strList.size());  // 6
		// Insert "Four" into the correct position
		strList.add(3, "Four"); // *** add(index first, element second) ***
		System.out.println(strList); // [One, Two, Three, Four, Five, One, One]
		// Change/ Swap/ replace the 2nd "One" to "Six"
		strList.set(5, "Six");  // Swap element 5 for "Six"
		System.out.println(strList); // [One, Two, Three, Four, Five, Six, One]
		
		System.out.println("Size: " + strList.size());  // 7
		/* When the size is 7, I add in from position 0 to 7, 7 will go at
		 * the end. If I add to position 8: IndexOutOfBoundsException */
		// strList.add(8, "Eight"); // java.lang.IndexOutOfBoundsException
		
		/* To sort a list in alphabetical order, use the sort() method
		 * from the Collections class. This sort() method used the 
		 * compareTo() from the String class, to see how Strings should
		 * be sorted, it sorted in alphabetical order. You can only 
		 * sort object that implement the Comparable interface and the
		 * String class does. */
		Collections.sort(strList);
		System.out.println(strList); // [Five, Four, One, One, Six, Three, Two]
		
		/* NOT ON THE EXAM! 
		 * If you want to sort String differently (i.e. not in 
		 * alphabetical order) you must create a class that implements
		 * the Comparator interface and you must implement the compare()
		 * method, here you program how the strings should be compared and
		 * this code is used by the sort() method. You must pass an
		 * instance of this class into the sort() method. 
		 * The ReverseComparator class is a class that implements 
		 * Comparator interface and includes a compare() method, the
		 * sort() method in the Collections class uses this compare()
		 * method to see how you want to sort the Strings. */
		Collections.sort(strList, new ReverseComparator());
		System.out.println("In reverse " + strList);
		
		// Clear/ empty the list
		strList.clear();
		System.out.println(strList); // []
		
		System.out.println(strList.size() == 0 ? "Empty" : "Not empty" ); // Empty
		
		System.out.println(strList.isEmpty() ? "Empty" : "Not empty"); // Empty
	}
}