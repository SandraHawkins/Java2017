/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex7ComparingWords.java
 */ 

package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex7ComparingWords {

	public static void main(String[] args) {

		/* try-with-resources. Declare a resource inside the round
		 * brackets and it will automatically get closed just before
		 * the closing } */
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first word: ");
			String firstWord = scanner.nextLine();
			System.out.print("Enter second word: ");
			String secondWord = scanner.nextLine();
			
			/* firstWord.compareTo(secondWord) will return:
			 * - 0 if the firstWord is equal to secondWord; 
			 * - a value less than 0 if firstWord is lexicographically 
			 *   less than the secondWord; .
			 * - and a value greater than 0 if firstWord is 
			 *   lexicographically greater than the secondWord.
			 */
			int result = firstWord.compareTo(secondWord);
			System.out.println("Result from compareTo: " + result);
			
			if (result == 0) {
				System.out.printf("%s and %s are equal\n", 
								  firstWord, secondWord);
			} else if (result < 0) {
				System.out.printf("%s precedes %s", 
						          firstWord, secondWord);
			} else { // result > 0
				System.out.printf("%s follows %s", 
				          firstWord, secondWord);
			}
		}
	}
}
/** SAMPLE OUTPUT
Enter first word: carrot
Enter second word: apple
Result from compareTo: 2
carrot follows apple

Enter first word: apple
Enter second word: banana
Result from compareTo: -1
apple precedes banana

Enter first word: grape
Enter second word: great big apple
Result from compareTo: -4
grape precedes great big apple
*/