/** 
 * Author: Sandra Hawkins
 * Date:   10 May 2017
 * ExerciseSolutions/sheet4A2DArrays/Ex2NamesAndAddresses.java
 */ 
package sheet4A2DArrays;

import java.util.Scanner;

public class Ex2NamesAndAddresses {

	public static void main(String[] args) {

		/* The following is just for show */
		String [][] address = new String [2][];
		address[0] = new String [] {"Joe", "Blackrock", "Co. Dublin"};
		address[1] = new String [3];
		address[1][0] = "Ted";
		//address[1][1] = "Glasnevin";   // null
		address[1][2] = "Dublin 11";

		/* Declare a 2D array to store the names and addresses */
		String [][] names = {  
				{"Joe Murphy", "12 Main Street", "Finglas", "Dublin 11"},
				{"Mary Jones", "36 Amiens Street", "Dublin 1"},
				{"Pat O'Connor", "26 South Main Street", "Wexford", "Co. Wexford"}
		};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a name to search for : ");
		String name = scanner.nextLine();
		scanner.close();
		
		/* This boolean is set up to print after the loop if 
		 * no match was found. It is set to true inside the 
		 * if that searches for a matching name. */
		boolean isFound = false; // not yet found

		/* Loops through the three names and address arrays */
		for (int i = 0; i < names.length; i++) {
			//if (names[i][0].equals(name)) {
			/* equalsIgnoreCase() will compare to string and will
			 * not be case sensitive. */
			if (names[i][0].equalsIgnoreCase(name)) {
				
				isFound = true; // We found a match
				
				System.out.println("Address for : " + names[i][0]);
				
				/* If a match is found, print out the rest of the 
				 * address, i.e. the rest of the array */
				//System.out.println(names[i][1]);
				//System.out.println(names[i][2]);
				//System.out.println(names[i][3]); 
				// won't work if there are only 3 address parts
				
				/* j = 1 will skip the first element when printing,
				 * i.e. it will not print the name again */
				for (int j = 1; j < names[i].length; j++) {
					System.out.println(names[i][j]);
				}
				
				/* After I find a match, exit the loop and don't
				 * search any more. 
				 * break;    breaks out of a loop or a switch.
				 * This break here will exit of the the 'i' loop
				 * i.e. the loop that iterates through my 3 sets
				 * of names and addresses. */
				break;
				
				/* If you want to skip a person, continue; will
				 * go to the next iteration the loop, i.e. it 
				 * would go to the increment section which is i++; */
				//if (Do you want to skip this person?)
				//	continue;
			} 
		}
		/* if (isFound == false)
		 * if (isFound != true)
		 * After the loop, if there wasn't a match, then print
		 * not found. */
		if (!isFound) {
			System.out.println(name + " not found");
		}
	}
}
/** Possible output:
Please enter a name to search for : mary jones
Address for : Mary Jones
36 Amiens Street
Dublin 1

------------
Please enter a name to search for : mr. brown
mr. brown not found
*/