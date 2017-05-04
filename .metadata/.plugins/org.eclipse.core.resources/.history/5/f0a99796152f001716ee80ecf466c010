package sheet3ControlFlow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int total = 0;
		int counter = 0;
		
		do {
			System.out.print("Please type an integer (-1 to exit) : ");
			
			num = scanner.nextInt();
			
			/* If the user didn't type -1, add num to the total 
			 * and increment the counter. */
			if (num != -1) {
				total = total + num;
				counter++;
			}
			
		} while (num != -1);
		
		System.out.println("The total is " + total);
		/* I have casted total to a double, so that the average 
		 * will give the correct result and not be an int
		 * divided by an int (as this gives an incorrect int
		 * result) */
		System.out.println("The average is " + 
						   (double)total / counter);
		
		/* Close the scanner when you have finished with it
		 * and make sure this code is after the loop. */
		scanner.close();
	}
}
/***** OUTPUT
Please type an integer (-1 to exit) : 4
Please type an integer (-1 to exit) : 3
Please type an integer (-1 to exit) : 2
Please type an integer (-1 to exit) : 1
Please type an integer (-1 to exit) : -1
The total is 10
The average is 2.5
*/