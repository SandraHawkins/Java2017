/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex8CharacterAndWordCount.java
 */ 

package sheet16StringsAndStringBuilder;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex8CharacterAndWordCount {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a sentence: ");
			String sentence = scanner.nextLine();
			
			/* - Output the number of characters with spaces 
			 * - the number of characters without spaces 
			 * - the number of words in the sentence.
			 */
			System.out.println("Number of characters with spaces: " 
					+ sentence.length());
			
			char [] letters = sentence.toCharArray();
			System.out.println("Number of characters with spaces: " 
					+ letters.length);
			
			// No of chars without spaces, using replace
			String newSentence = sentence.replace(" ", "");
			System.out.println("Num of chars, no space: " + 
					newSentence.length());
			
			// No of chars without spaces, using a loop to count them
			int spaceCounter = 0;
			for(char c : letters) {
				if (c == ' ') {
					spaceCounter++;
				}
			}
			System.out.println("Num of chars, no space: " + 
					(letters.length - spaceCounter));
			
			// The number of words in the sentence.
			// [Hello] [there] [how] [are] [you]
			/* \\s is a regular expression for a whitespace (space, 
			 * newline, tab, formfeed
			 * + is a regular expression for one or more.  */
			String [] words = sentence.split("\\s+");
			System.out.println(Arrays.toString(words));
			System.out.println("Number of words: " + words.length);
		}
	}
}
/** OUTPUT
Enter a sentence: Hello, today is Tuesday!
Number of characters with spaces: 24
Number of characters with spaces: 24
Num of chars, no space: 21
Num of chars, no space: 21
[Hello,, today, is, Tuesday!]
Number of words: 4
*/