/** 
 * Author: Sandra Hawkins
 * Date:   11 May 2017
 * ExerciseSolutions/sheet4A2DArrays/Ex4Calendar.java
 */ 
package sheet4A2DArrays;

import java.util.Scanner;

public class Ex4Calendar {

	public static void main(String[] args) {
				
		/* Month Headings */
		String [] months = {"January", "February", "March", "April", 
				"May", "June", "July", "August", "September", 
				"October", "November", "December"};

		/* Day of the week headings, print under each month name */
		String [] days = {"M", "T", "W", "T", "F", "S", "S"};

		/* A 2D array holding the dates for each month */
		int [][] calendar = 
			{ {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, 
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28}, 
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}
		    };
		
		/* 1st January 2017 was on Sunday (Monday = 0, Sunday = 6) 
		 * The method getStartingDayOfYear() is called, which will 
		 * prompt the user and return a value between 0 and 6 or
		 * exit the program if the user types in an invalid value.*/
		int startingDay = getStartingDayOfYearFromUser();
		
		/* Used to know which day was printed and put in a newline
		 * after every Sunday (printCounter will be 6)*/
		int printCounter = startingDay;
		
		/* A loop to iterate 12 times to print each month */
		for (int i = 0; i < months.length; i++) {
			/* The heading for each month, e.g. January*/
			System.out.println(months[i]);
			
			/* The headings for each day, e.g. M T W T F S S */
			for (int j = 0; j < days.length; j++) {
				System.out.printf("%-4s", days[j]);
			}
			System.out.println();  /* A new line after M T W T F S S */
			
			/* Print spaces until the correct start day each month */
			for (int s = 0; s < startingDay; s++) {
				System.out.print("    ");
			}
			
			/* A loop to get to the date in each month. The first time
			 * here, calendar[0] will refer to the array with all the 
			 * dates in January, i.e. {1, 2, ....., 31}, so this loop
			 * will execute 31 times for January  */
			for (int k = 0; k < calendar[i].length; k++) {
				/* Prints out the date left aligned in a column width of 4*/
				System.out.printf("%-4d", calendar[i][k]);

				/* If the printCounter is 6, i.e. a date under Sunday was
				 * printed, insert a newline and set reset the printCounter
				 * to 0 for the next line. */
				if (printCounter == 6) {
					System.out.println();
					printCounter = 0;
				} else { /* Otherwise increment the printCounter variable,
				this will happen from 0 to 5 (Monday to Saturday) */
					printCounter++;
				}
				
				/* Before printing the next month, set its starting day.
				 * E.g. if January finished on Tuesday, printCounter will
				 * have a value of 2, set the starting Day for February to
				 * 2 before the next iteration of the loop.
				 */
				startingDay = printCounter;
			}
			System.out.println("\n"); /* A newline between each month*/
		} // End of the loop going through the months
	} // End of main
	
	/**
	 * This method prompts the user to enter a day of the week. It will
	 * return 0 to 6 for Monday to Sunday and exit the application if
	 * an invalid day is entered.
	 */
	private static int getStartingDayOfYearFromUser() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the starting day of the year: ");
		String day = scanner.nextLine();
		scanner.close();
		
		/* This switch evaluates the String entered by the user converted
		 * to lower case.*/
		switch (day.toLowerCase()) {
		case "monday":
			return 0;
		case "tuesday":
			return 1;
		case "wednesday":
			return 2;
		case "thursday":
			return 3;
		case "friday":
			return 4;
		case "saturday":
			return 5;
		case "sunday":
			return 6;
		default:
			System.out.println("Not a day of the week, program exiting...");
			System.exit(0);
		}
		return 0;  // never gets here. return 0 to keep the compiler happy
	}
}
/** OUTPUT
	January
   M   T   W   T   F   S   S
           1   2   3   4   5
   6   7   8   9  10  11  12
  13  14  15  16  17  18  19
  20  21  22  23  24  25  26
  27  28  29  30  31

	February
   M   T   W   T   F   S   S
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28
*/
