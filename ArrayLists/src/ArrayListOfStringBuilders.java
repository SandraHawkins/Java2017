import java.util.ArrayList;

/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * ArrayLists//ArrayListOfStringBuilders.java
 * 
 * StringBuilders do not override the equals() method.
 * The contains() method in an ArrayList used the equals() method to 
 * see if the list contains that element. Because the StringBuilder
 * class does not override the equals() method, it used the inherited
 * equals() method from the Object class. The code in the equals() 
 * method in the Object class uses == to compare memory addresses. 
 * 
 * So....... the contains method in the ArrayList class when checking 
 * for a StringBuilder will only return true if: 
 * 
 * 		the StringBuilder in the list is in the same area of memory as
 *      the StringBuilder you are passing into the contains() method. 
 */

public class ArrayListOfStringBuilders {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("One");
		StringBuilder sb2 = new StringBuilder("Two");
		StringBuilder sb3 = new StringBuilder("Three");
		StringBuilder sb4 = new StringBuilder("Four");

		ArrayList<StringBuilder> listOfSbs = new ArrayList<>();
		listOfSbs.add(sb1);
		listOfSbs.add(sb2);
		listOfSbs.add(sb3);
		listOfSbs.add(sb4);
	
		System.out.println(listOfSbs); // [One, Two, Three, Four]
		
		StringBuilder sbCopy = sb2;
		StringBuilder sbOther = new StringBuilder("Two");

		System.out.println(listOfSbs.contains(sb2));	 // true
		System.out.println(listOfSbs.contains(sbCopy));  // true
		System.out.println(listOfSbs.contains(sbOther)); // false
		// Is new StringBuilder("Two") in the same location in memory as
		// any element in the list? 
		System.out.println(listOfSbs.contains(
							new StringBuilder("Two")));  // false 
		
		// Retrieve the SB with "Two" in it, convert it to a String and see
		// if that matched "Two" which it will.
		System.out.println(listOfSbs.get(1).toString().equals("Two")); // true
		
		/*
		 *       sb1="One"	sb2="Two"  sb3="Three"   sb4="Four"
		 * 
		 *			   \      |        /         / 
		 * listOfSbs = []     []      []        []
		 * 
		 * 
		 * sbCopy="Two"            "Two"
		 * 
		 * 
		 * contains() check to see if the arrayList contains a pointer
		 * to the exact same area of memory **** for StringBuilders only ***
		 * as it uses the inherited equals() method from the Object class
		 * which compares memory address as the StringBuilder class
		 * does not override the equals() method.
		 */
	}
}