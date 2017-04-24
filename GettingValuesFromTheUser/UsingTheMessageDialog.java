import javax.swing.JOptionPane;

public class UsingTheMessageDialog {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"Nearly there", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"Nearly there", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"Nearly there", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"Nearly there", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"Nearly there", JOptionPane.WARNING_MESSAGE);
		/*
		 * The fourth parameter in the method showMessageDialog()
		 * takes an int to represent the message type (icon), 
		 * all the code is correct. I have passed in 
		 * YES_NO_CANCEL_OPTION in the next line of code which is 
		 * a constant used in another dialog to represent three 
		 * buttons yes | no | cancel.
		 * This code runs and produces an INFORMATION_MESSAGE,
		 * why? because the INFORMATION_MESSAGE int obviously
		 * has the same int value as YES_NO_CANCEL_OPTION.
		 */
		JOptionPane.showMessageDialog(null, "Hello, it's Thursday", 
				"THREE", JOptionPane.YES_NO_CANCEL_OPTION);
	}
}