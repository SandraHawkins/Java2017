/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex6RandomWords.java
 */ 

package sheet16StringsAndStringBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6RandomWords {

	public static void main(String[] args) {
		
		String [] words = {"printer", "computer", "trousers", 
				           "buttercup", "paper"};
		/* Create an instance of the Random() class, call nextInt() on
		 * it, you will get a number between 0 and 4 (if you specify 5)*/ 
		int randomNumber = new Random().nextInt(5); // 0 to 4
		String word = words[randomNumber];
		
		System.out.printf("A %d letter word was chosen, "
				+ "please guess a letter: ", word.length());
		
		// Create an array of * * * * *, the same length as the word
		char [] stars = new char[word.length()];
		// Populate with stars
		for (int i = 0; i < stars.length; i++) {
			stars[i] = '*';
		}

		/* try-with-resources. Declare a resource inside the round
		 * brackets and it will automatically get closed just before
		 * the closing } 
		 * e.g. of a resource: Scanner, BufferedReader, Connection,
		 * FileReader, etc. */
		try (Scanner scanner = new Scanner(System.in)) {
			int guesses = 8;
			do {
				// scanner.nextLine() reads a String/ line of text from the
				// user, .charAt(0) will return the first character of that
				// String.
				char letter = scanner.nextLine().charAt(0);
				
				// Convert the work into a character array
				char [] letters = word.toCharArray();
				// A local variable must be initialised before being accessed
				boolean isFound = false;
				// Loops through the letters array and checks each letter
				// for a match.
				for (int i = 0; i < letters.length; i++) {
					if (letters[i] == letter) {
						
						// Change a * to the correct letter
						stars[i] = letter;
						isFound = true;
						System.out.printf("%c was found at position %d", 
								letter, (i + 1));
						System.out.println();
						System.out.println(stars);
						// Compare the letters array with the stars array,
						// when they match, "You won" & exit
						if (Arrays.equals(stars, letters)) {
							System.out.println(" **** YOU WON!!!!! ***** ");
							System.exit(0);
						}
					} 
				}
				// After the loop, check for a match
				if (!isFound) { // if (isFound != false)
					
					System.out.printf("%c was not found", letter);
					// Decrease the guesses when a letter was not found
					guesses--;
				}
				if (guesses > 0) {
					System.out.printf("\nEnter your next guess, "
							+ "%d guess(es) left: ", guesses);
				} else {
					System.out.println("\nOut of guesses. Goodbye.");
				}
				
			} while (guesses > 0);
		}
	}
}
/* if (isFound) 
 * if (isFound == true)
 * 
 * 
 * if (!isFound)
 * if (isFound == false)
 * if (isFound != true)
 */ 
/** SAMPLE OUTPUT
A 5 letter word was chosen, please guess a letter: p
p was found at position 1
p****
p was found at position 3
p*p**

Enter your next guess, 8 guess(es) left: x
x was not found
Enter your next guess, 7 guess(es) left: d
d was not found
Enter your next guess, 6 guess(es) left: e
e was found at position 4
p*pe*

Enter your next guess, 6 guess(es) left: r
r was found at position 5
p*per

Enter your next guess, 6 guess(es) left: a
a was found at position 2
paper
 **** YOU WON!!!!! ***** 

*/