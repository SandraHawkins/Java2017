import javax.swing.JOptionPane;

public class SwitchOnAString {
	
	public static void main(String[] args) {

		//for ( ; ; ) {  	// infinite loop 
		while ( true ) { 	// infinite loop 

			/* JOptionPane.showInputDialog() returns a String */
			String strChoice = JOptionPane.showInputDialog(
					"************ Menu ************\n"
							+ "- Breakfast\n"
							+ "- Lunch\n"
							+ "- Dinner\n"
							+ "- Exit\n"
							+ "Please choose one of the above");

			switch (strChoice.toLowerCase()) {
			case "breakfast":
				JOptionPane.showMessageDialog(null, 
						"The choices for Breakfast are: \n"
								+ "Bacon\nSausages\nToast\nHash Brown\nEgg");
				break;
			case "lunch":
				JOptionPane.showMessageDialog(null, 
						"The choices for Lunch are: \n"
								+ "Salad\nSoup\nSandwich\nToastie");
				break;
			case "dinner":
				JOptionPane.showMessageDialog(null, 
						"The choices for Dinner are: \n"
								+ "Sweet and Sour chicken with rice\n"
								+ "Chicken wrap and chips\n"
								+ "Fish and Chips, with mushy peas");
				break;
			case "exit":	
				JOptionPane.showMessageDialog(null, "Exiting....");
				System.exit(0); 	// Exit the application
				 					// 0 stands for success
				break;
			default:
				JOptionPane.showMessageDialog(null, 
						"Invalid choice, please reenter");
				break;
			}
		}
	}
}