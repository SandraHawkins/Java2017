import java.util.Scanner;
public class ReadingInFromTheConsole {
	public static void main(String[] args) {
		
		/* 
		 * This creates an instance of the Scanner class and 
		 * links it up to the console window, so that we can 
		 * read in values from the console that the user has 
		 * typed.
		 */
		Scanner input = new Scanner(System.in);
		
		// Prompt the user
		System.out.print("Please enter a number: ");
		int num = input.nextInt();   // double num = input.nextDouble();
		System.out.println("You typed: " + num);
		
		// Close the scanner object at the end of main
		input.close();
	}
}