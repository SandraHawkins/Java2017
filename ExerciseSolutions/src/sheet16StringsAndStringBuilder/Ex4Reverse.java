/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex4Reverse.java
 */ 

package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex4Reverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Please type a sentence : ");
		String text = s.nextLine();
		s.close(); // close the scanner when finished with it.
		
		//System.out.println(new StringBuilder(text).reverse());
		
		/* This will convert the String into a character array and you
		 * can use a loop to access each character in the array. */
		char [] letters = text.toCharArray();
		
		// i = 4 3 2 1 0
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
		
		System.out.println();
		
		/* charAt() is a String method that can be used to access each
		 * character in a String without have to convert it into a 
		 * char array. */
		for (int i = text.length() - 1; i >= 0; i--)
			System.out.print(text.charAt(i));
		
	}
}
/** OUTPUT
Please type a sentence : hello there!
!ereht olleh
!ereht olleh
*/