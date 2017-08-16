/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/SBsInAnArrayList.java
 */ 

package chapter3CoreJavaAPIs;

import java.util.ArrayList;

public class SBsInAnArrayList {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("One");
		StringBuilder sb2= new StringBuilder("Two");
		StringBuilder sb3 = new StringBuilder("Three");
		
		StringBuilder sbOther = new StringBuilder("Three");
		/* The StringBuilder class does not override the equals() 
		 * method and instead inherits the one from the Object class
		 * which uses == to compare memory address. */
		System.out.println(sb3.equals(sbOther)); // false
		
		ArrayList<StringBuilder> listOfSBs = new ArrayList<>();
		listOfSBs.add(sb1);
		listOfSBs.add(sb2);
		listOfSBs.add(sb3);
		System.out.println(listOfSBs);  // [One, Two, Three]
		
		/* The contains() method in the ArrayList list class, will
		 * use the equals() method in the StringBuilder class to
		 * see if a StringBuilder already in the Arraylist matches
		 * the one passed in as an argument (e.g. is sb3 in the list?)
		 * Because the StringBuilder class doesn't have an equals 
		 * method, it compare memory addresses, e.g. sb3 memory
		 * address is being compared against the element in the list,
		 * sb3 was added and therefore it will return true. 
		 */
		System.out.println(listOfSBs.contains(sb3));		// true
		System.out.println(listOfSBs.contains(sbOther));    // false
		System.out.println(
			listOfSBs.contains(new StringBuilder("Three"))); // false
	}
}