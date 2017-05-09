/** 
 * Author: Sandra Hawkins
 * Date:   9 May 2017
 * ExerciseSolutions/sheet4Arrays/Ex8OrderingSystem.java
 */ 
package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex8OrderingSystem {

	public static void main(String[] args) {

		int [] refNums = {1000, 1001, 1002, 1003, 1004};
		String [] productNames = {"Keyboard", "Mouse", "Monitor", 
				"Mouse Mat", "Speakers"};
		double [] prices = {49.99, 15.5, 124.99, 3.99, 23.50};

		/* printf 	The printf method takes a String argument
		 * followed by any number of 'value' arguments. Each 
		 * value will be used in place of the %s in the String
		 * printf("String with %s", arg1, arg2, arg3, arg4, ...);
		 * 
		 *  % 	just means special characters follow
		 *  1$	use the 1st argument
		 *  2$	use the 2nd argument
		 *  -	left align
		 *  15	column width of 15 characters
		 *  s	String
		 *  d 	int
		 *  f 	floating point (double float)
		 *  b 	boolean 
		 *  c 	character
		 **/
		System.out.printf("%-15s%-15s%s\n", "Ref Number", 
				"Product Name", "Price");
		System.out.printf("%1$-15s%1$-15s%2$s\n", 
				"--------------", "--------");
		/* A loop to print out the ref nums, product names and
		 * prices */
		for (int i = 0; i < refNums.length; i++) {

			System.out.printf("%-15d%-15s€%7.2f\n", 
					refNums[i], productNames[i], prices[i]);
		}

		/* Asks the user for a reference number. A dialog always
		 * returns a String */
		String strRefNum = JOptionPane.showInputDialog(null, // parent frame/ gui
				"Please enter a reference number", // message
				"Ref num please", 				   // title
				JOptionPane.QUESTION_MESSAGE);	   // icon

		/* Converts the String into an int. */
		int intRefNum = Integer.parseInt(strRefNum);
		
		/* This boolean is used to see if there was a matching
		 * product number. If there was a match, isFound is
		 * changed to true, if there wasn't a match, then
		 * ifFound will remain false. It is checked after the
		 * loop and if it is still false, then a message is 
		 * displayed to the user that no matching reference 
		 * number was found. */ 
		boolean isFound = false;

		/* Loop through the reference number array and see which
		 * number matches what the user typed in. */
		for (int i = 0; i < refNums.length; i++) {
			/* if the array element matched what was typed in */
			if (refNums[i] == intRefNum) {
				/* A match was found */
				/* Set the isFound boolean to true */
				isFound = true;
				
				/* String.format("string to format", arg1, arg2) 
				 * can be used to format a String similar to
				 * printf(). printf() sends the formatted String
				 * to the console window and String.format() returns
				 * a String so that you can display it where you 
				 * want, i.e. here it goes to the message dialog 
				 **/
				JOptionPane.showMessageDialog(null, 
						String.format("%s found, price €%.2f", 
								productNames[i], prices[i]));
				
				/* Ask the user for a quantity of items to order */
				String strQuanity = JOptionPane.showInputDialog(
						            "Please enter a quantity ");
				/* Convert the quantity string into an int */
				int quantity = Integer.parseInt(strQuanity);
				
				double total = quantity * prices[i];
				
				/* Display the total order price */
				JOptionPane.showMessageDialog(null, 
						String.format("The total cost of your "
								+ "order will be €%.2f", total));
				
				/* break exits a loop or a switch, when a match
				 * is found, exit the loop and don't check any
				 * more reference numbers */
				break;
			} // else { no match found } 
		} // End of the for loop
		
		/* When the loop has finished, if no matching reference 
		 * number was found, then tell the user 
		 * 
		 * if (!isFound)
		 * if (isFound != true)
		 * if (isFound == false)
		 * 
		 * */
		if (!isFound) {
			JOptionPane.showMessageDialog(null, 
					"Reference number not found");
		}
	}
}
/* OUTPUT in the console window
Ref Number     Product Name   Price
-------------- -------------- --------
1000           Keyboard       €  49.99
1001           Mouse          €  15.50
1002           Monitor        € 124.99
1003           Mouse Mat      €   3.99
1004           Speakers       €  23.50
 */