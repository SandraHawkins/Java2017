/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/AllAboutArrayLists.java
 */ 

package chapter3CoreJavaAPIs;

import java.util.ArrayList;

public class AllAboutArrayLists {

	public static void main(String[] args) {
		
		/* <String> - Generics
		 * Only Strings can be added to the list. The compiler will 
		 * make sure that no other type can be added to the list. 
		 * When I use a method that retrieves an element from the list,
		 * e.g. stringList.get(2); you will be guaranteed that a 
		 * String will be returned.  
		 * Without generics, any Object can be added to the list
		 * and get would return an Object type.
		 */
		ArrayList<String> listOfStrings = new ArrayList<>();
		//stringList.add(new Dog());
		listOfStrings.add("One");
		listOfStrings.add("Two");
		listOfStrings.add("Three");
		listOfStrings.add("Four");
		System.out.println(listOfStrings.size()); // 4
		System.out.println(listOfStrings);  // [One, Two, Three, Four]
		/* When you concat to a String it won't change it unless
		 * you reassign it. */
		listOfStrings.get(1).concat("XXX");
		System.out.println(listOfStrings);  // [One, Two, Three, Four]
		
		/* set() will swap/ replace an element in the list. */
		listOfStrings.set(1, listOfStrings.get(1).concat("XXX"));
		System.out.println(listOfStrings); // [One, TwoXXX, Three, Four]
		
		// An ArrayList reference = String;  // won't work
		//listOfStrings = listOfStrings.get(1).concat("XXX");
		
		/* When the list's size is 4, I can add at position 0, 1, 2, 3 or 4.  
		 * Adding at position 5 gives an IndexOutOfBoundsException.  */
		listOfStrings.add(4, "Five"); // [One, TwoXXX, Three, Four, Five]
		System.out.println(listOfStrings);
		
		listOfStrings.add("Six"); // [One, TwoXXX, Three, Four, Five, Six]
		System.out.println(listOfStrings);
		
		// Remove TwoXXX
		listOfStrings.remove(1);			// true
		listOfStrings.remove("TwoXXX");		// false
		System.out.println(listOfStrings);  // [One, Three, Four, Five, Six]

		/* remove(index) or remove(object) will remove the element from
		 * the list and return the object removed, i.e. the String
		 * that was removed. 
		 */
		System.out.println(listOfStrings.remove(1)); // Three	
		
		/* Search in the list for TwoXXX */
		System.out.println(listOfStrings.contains("TwoXXX")); // false
		
		/* If the list is not empty, then clear the contents. */
		if (!listOfStrings.isEmpty())
			listOfStrings.clear();
		
		System.out.println("Size of empty list: " + 
						   listOfStrings.size()); // 0
		
		listOfStrings.clear(); // Ok to clear an empty list. 		
	}
}
