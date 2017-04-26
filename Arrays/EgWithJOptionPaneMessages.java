import javax.swing.*;

public class EgWithJOptionPaneMessages {

	public static void main(String [] args) { 
	
		/* This code will loop three times and show an input dialog with 
		   the following message:
				Please enter number 1
				Please enter number 2
				Please enter number 3
				
		*/
		for (int i = 0; i < 3; i++) {
			/* Use the loop counter i each time but add one so it starts 
			counting from 1 and not 0. */
			String input = JOptionPane.showInputDialog("Please enter number " + (i + 1));
		}
	}
}