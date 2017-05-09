/** 
 * Author: Sandra Hawkins
 * Date:   9 May 2017
 * Arrays//EnhancedForLoop2DArray.java
 */

public class EnhancedForLoop2DArray {

	public static void main(String[] args) {
		
		/* The following 2D array includes the meals consumed
		 * by four people this morning, */
		String [][] food = {
				{ "porridge", "toast", "peanut butter" }, // array 1
				{ "bacon", "egg" },						  // array 2
				{ "yogurt", "fruit" },					  // array 3
				{ "cheese", "crackers", "rice cakes" }	  // array 4
		};
		
		/* The enhanced for loop for a 2D array:
		 * The RHS is the name of the 2D array, i.e. food.
		 * The LHS is a declaration to access each single array
		 * in that 2D array, i.e. declare a 1D array to access
		 * each person's breakfast. */
		for (String [] oneBreakfast : food) {
			
			/* The inner loop will loop through each 1D array, 
			 * therefore:
			 * The RHS, is the name of the 1D array declared on 
			 * the previous line, i.e. oneBreakfast.
			 * The LHS is a declaration of a single String which 
			 * will get a copy of each food item as it loops. 
			 * And that 'item' is what you print inside the loop. */
			for (String item : oneBreakfast) {
				System.out.print(item + " ");
			}
			System.out.println(); // A newline after each team
		}
	}
}
/** OUTPUT
porridge toast peanut butter 
bacon egg 
yogurt fruit 
cheese crackers rice cakes 
*/