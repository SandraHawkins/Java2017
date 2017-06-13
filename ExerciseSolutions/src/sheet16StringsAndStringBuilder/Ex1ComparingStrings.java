/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex1ComparingStrings.java
 */ 

package sheet16StringsAndStringBuilder;

public class Ex1ComparingStrings {

	public static void main(String[] args) {
		
		String strA = "Monday";				// String constant pool
		String strB = new String("Monday"); // New String, not in the SCP.
		
		String strC = "Tuesday"; 			// SCP
		// The ref var strD refers to the same area of memory as strC
		// i.e. strD refers to "Tuesday" in the String Constant pool
		String strD = strC; 
				// or 
		//String strD = "Tuesday";
		String strE = new String("Tuesday");// New String, not in the SCP.	
		strC = strC.toUpperCase();		    // New String, not in the SCP.

		System.out.println("strA == strB : " + (strA == strB)); // false
		System.out.println("strC == strD : " + (strC == strD)); // true
		System.out.println("strC == strE : " + (strC == strE)); // false
		System.out.println("strA.equals(strB): " + strA.equals(strB)); // true
		System.out.println("strA.equals(strE): " + strA.equals(strE)); // false
		System.out.println("strC == strD : " + (strC == strD)); // false
				
		// Calls the method below:
		anotherMethod(strA);
	}
	
	public static void anotherMethod(String strA) {
		String strC = "Monday"; // Created in the SCP.
		System.out.println("strA == strC : " + (strA == strC)); // true		
	}
}