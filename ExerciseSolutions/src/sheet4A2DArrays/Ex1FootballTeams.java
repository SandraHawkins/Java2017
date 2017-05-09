/** 
 * Author: Sandra Hawkins
 * Date:   9 May 2017
 * ExerciseSolutions/sheet4A2DArrays/FootballTeams.java
 */ 
package sheet4A2DArrays;

import java.util.Scanner;

public class Ex1FootballTeams {

	public static void main(String[] args) {

		String [][] teams = { 								 // i
			// j =   0         1           2
				{"team 1", "player 1", "player 2"},			 // 0
			// j =   0         1           2        3	
				{"team 2", "player 1", "player 2", "player 3"},// 1 
    		// j =   0         1           2
				{"team 3", "player 1", "player 2"} 			 // 2
		};
		
		/* Print the contents of the two D array. */
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.print(teams[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************************");

		/* Get the user to enter a team name, seach in the first
		 * element of each array, if the name match, then print 
		 * the rest */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a team to print its players: ");
		String teamName = scanner.nextLine();
		scanner.close();
		
		for (int i = 0; i < teams.length; i++) {
			/* When j starts at one, the first element in the array
			 * will be skipped, i.e. the team name won't be printed.*/
			for (int j = 1; j < teams[i].length; j++) {
				
				/* You cannot use == to compare String.
				 * == is used to compare primitives (int, float,...)
				 * To compare String, you use:
				 * 	if (aString.equals(anotherString)) {
				 * 		// equals() returns true when there's a match
				 * 	}
				 *
				 * If the first element in the array matches what
				 * the user entered, then print the players
				 **/
				if (teams[i][0].equals(teamName))
					System.out.print(teams[i][j] + " ");
			}
		}
		
		System.out.println("\n\nThe enhanced/ foreach loop for a 2D array: ");
		/* The enhanced for loop for a 2D array:
		 * The RHS is the name of the 2D array.
		 * The LHS is a declaration to access each single array
		 * in that 2D array, i.e. declare a 1D array. */
		for (String [] team : teams) {
			
			/* The inner loop will loop through each 1D array, 
			 * therefore:
			 * The RHS, is the name of the 1D array declared on 
			 * the previous line.
			 * The LHS is a declaration of a single String which 
			 * will get a copy of each element in the team as it
			 * loops. And that 'name' is what you print inside 
			 * the loop. */
			for (String name : team) {
				System.out.print(name + " ");
			}
			System.out.println(); // A newline after each team
		}
	}
}
/** OUTPUT
team 1 player 1 player 2 
team 2 player 1 player 2 player 3 
team 3 player 1 player 2 
******************************
Enter a team to print its players: team 2
player 1 player 2 player 3 a

The enhanced/ foreach loop for a 2D array: 
team 1 player 1 player 2 
team 2 player 1 player 2 player 3 
team 3 player 1 player 2 
*/