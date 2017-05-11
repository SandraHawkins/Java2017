import java.util.Scanner;

/** 
 * Author: Sandra Hawkins
 * Date:   11 May 2017
 * Loops//TotalingTheUsersValuesUsingALoop.java
 */

public class TotalingTheUsersValuesUsingALoop {
public static void main(String[] args) {
		
		/* Create an instance of the Scanner class to read in
		 *  values from the console/ user.
		 */
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
		/* Loop five times to get five values from the user */
		for (int i = 0; i < 5; i++) {
		
			/* Prompt the user for a value */
			System.out.print("Please enter double " + (i + 1) + " : ");
			
			double num = scanner.nextDouble(); 
			
			/* Add that number to the total.
			 * This is the same as:  total += num; */
			total = total + num;
		}
		
		/* When the loop has finished, display the total */
		System.out.println("The total is " + total);
		scanner.close();
	}
}
/** SAMPLE OUPUT
Please enter double 1 : 2.5
Please enter double 2 : 1.9
Please enter double 3 : 20.4
Please enter double 4 : 12.7
Please enter double 5 : 6.8
The total is 44.3
*/