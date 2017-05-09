public class EnhancedForLoop1DArray {

	public static void main(String[] args) {
		int [] nums = {1, 5, 3, 7, 9};
		
		/**
		 * The enhanced for loop can be used for accessing the 
		 * elements in ONE array. You can access the array for
		 * printing, totalling, getting the average, etc.
		 * You CANNOT use this enhanced for loop for populating
		 * or changing the contents of any array, you must use
		 * the old for loop for that. 
		 * 
		 * This loop is called the enhanced for loop or the foreach
		 * loop. It contains a :
		 * On the RHS of the : the name of the array to loop through,
		 * on the LHS of the : declare one variable which MUST be
		 * the same data type as the elements in the array:
		 * 
		 *   	for (OneOfWhatsInTheArray : nameOfTheArray) 
		 *   
		 * E.g. below I have declared int a, as this loop executes
		 * 'a' will hold a copy of each element in the array. 
		 * The 1st time through, a will be 1.
		 * The 2nd time through, a will be 5.
		 * The 3rd time through, a will be 3. 
		 * .....
		 * 
		 * You have a copy of each element as it loops, you can 
		 * do whatever you want with that value, i.e. display, add
		 * it, multiply it, etc.
		 */
		for (int a : nums) {
			System.out.println(a); // do whatever with a
		}
	}
}
/** OUTPUT:
1
5
3
7
9
*/