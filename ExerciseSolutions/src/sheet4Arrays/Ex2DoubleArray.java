package sheet4Arrays;

import java.util.Scanner;

public class Ex2DoubleArray {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double [] nums  = new double [10];
		/* A local variable is one declared inside a method.
		All local variables MUST be given a value (initialised)
		before they are accessed (added to or printed) */
		double total = 0;
		/* i is declared before the loop, so that it can be
		accessed after the loop to calculate the average */
		int i = 0;
		
		/* This loop loops through the nums array */
		for ( ; i < nums.length; i++) {
			/* Prompt the user to input a double */
			System.out.printf("Enter double %d : ", i + 1);
			/* RHS reads a double from the keyboard and 
			LHS assigns it to the current element in the array */
			nums[i] = input.nextDouble();
			total = total + nums[i]; // total += nums[i];
		}
		
		for (i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.printf("The total is %.2f\n", total);
		System.out.printf("The average is %.2f", total / i);
	}
}
/** OUTPUT
Enter double 1 : 12.5
Enter double 2 : 23.5
Enter double 3 : 2.2
Enter double 4 : 3.3
Enter double 5 : 4.4
Enter double 6 : 1.1
Enter double 7 : 1.95
Enter double 8 : 4.95
Enter double 9 : 2.6
Enter double 10 : 1.3
12.5
23.5
2.2
3.3
4.4
1.1
1.95
4.95
2.6
1.3
The total is 57.80
The average is 5.78
*/