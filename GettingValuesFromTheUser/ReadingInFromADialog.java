import javax.swing.JOptionPane;
public class ReadingInFromADialog {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(
								"Please type a double or an integer");
		/*
		 * Convert the string into a number. Double.parseDouble() 
		 * takes a String and returns a double primitive.
		 * Integer.parseInt() will take a String and convert it
		 * to an int.
		 */
		double num = Double.parseDouble(input);
		
		//int intNum = Integer.parseInt(JOptionPane.showInputDialog(
		//		                      "Please enter an int"));
		

		JOptionPane.showMessageDialog(null, "You typed " + num);
	}
}