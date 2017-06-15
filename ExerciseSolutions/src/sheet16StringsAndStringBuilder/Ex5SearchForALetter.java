/** 
 * Author: Sandra Hawkins
 * Date:   15 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex5SearchForALetter.java
 */ 

package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	public static void main(String[] args) {

		/* Not on the OCA exam. Is on the OCP exam.
		 * This is a try-with-resources block, if you are using a 
		 * resource that must be closed, e.g. a Scanner, a FileReader,
		 * a BufferedReader or a Connection object. You should close it
		 * when you are finished BUT if you use a try-with-resources block
		 * the resource you opened in the round brackets will automatically
		 * get closed at the end of the block. The resource must implement
		 * the interface called Closeable.   */
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a word: ");
			String word = scanner.nextLine();
			System.out.print("Enter a letter to search for: ");
			// .charAt(0) will return the first character in the string
			char letter = scanner.nextLine().charAt(0);
			
			// PART A: find one occurrence
//			int position = word.indexOf(letter);
//			if (position == -1) {
//				System.out.println(letter + " was not found");
//			} else {
//				System.out.println(letter + " found at " + position);
//			}
			
			// PART B: find multiple occurrences:
			char [] letters = word.toCharArray();
//			boolean isFound = false;
			int counter = 0;
			for (int i = 0; i < letters.length; i++) {
				if (letters[i] == letter) {
					System.out.println(letter + " found at " + (i + 1));
					//isFound = true;
					counter++;
				} 
			}
			if (counter == 0) {
				System.out.println(letter + " not found");
			}
//			if (!isFound) {
//				System.out.println(letter + " not found");
//			}
			
			//scanner.close(); // closed automatically with try-with-resource block
		}
	}
}
/** SAMPLE OUPUT (two separate executions)
Enter a word: hello
Enter a letter to search for: l
l found at 3
l found at 4


Enter a word: hello
Enter a letter to search for: x
x not found
*/