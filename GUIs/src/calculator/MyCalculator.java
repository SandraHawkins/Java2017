/** 
 * Author: Sandra Hawkins
 * Date:   21 Jun 2017
 * GUIs/calculator/MyCalculator.java
 */ 

package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculator extends JFrame /*implements ActionListener*/ {

	public MyCalculator() {
		super("My Calculator");		// Title on the frame
		setSize(350, 250); 			// width, height
		//setLocation(450, 900);	// x, y, where the frame should open	
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Make the X button work
		setLayout(null);			// no layout, uses the coordinates
		// from the setBounds() of each component
		initComponents();			// Call the method below
	}

	/*   
	 * Here we will create all components, set their properties and 
	 * add them onto the frame.
	 */
	private void initComponents() {
		JLabel lblFirst = new JLabel("First");
		JLabel lblSecond = new JLabel("Second");
		JLabel lblResultHeading = new JLabel("Result");
		txtFirst = new JTextField();
		JLabel lblPlus = new JLabel("+");
		txtSecond = new JTextField();
		JLabel lblEquals = new JLabel("=");
		lblResult = new JLabel();
		JButton btnCalculate = new JButton("Calculate");

		lblFirst.setBounds(20, 10, 80, 40); // x, y, width height
		lblSecond.setBounds(120, 10, 80, 40);
		lblResultHeading.setBounds(220, 10, 80, 40);
		txtFirst.setBounds(20, 45, 50, 40);
		lblPlus.setBounds(90, 55, 20, 20);
		txtSecond.setBounds(120, 45, 50, 40);
		lblEquals.setBounds(190, 55, 20, 20);
		lblResult.setBounds(220, 45, 80, 40);
		lblResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
		btnCalculate.setBounds(190, 130, 120, 30);

		// Add each component onto the Frame
		add(lblFirst);  
		add(lblSecond);
		add(lblResultHeading);
		add(txtFirst);
		add(lblPlus);
		add(txtSecond);
		add(lblEquals);
		add(lblResult);
		add(btnCalculate);

		/* When an action (button click) occurs on this button, it
		 * is listening out and when the button is clicked to go the 
		 * class mentioned as the argument, i.e this class. 
		 * The argument must be a class that implements ActionListener
		 * and implements the   
		 * 
		 * addActionListener() takes in an ActionListener type. 
		 * ActionListener is an interface, therefore I must have a 
		 * class that implements the ActionListner interface and
		 * that class must implement the actionPerformed() method. 
		 * Therefore 'this' refers this class, i.e. MyCalculator class.
		 * When the Calculate button is pressed control will go to
		 * the actionPerformed() method below.
		 *  */
		//btnCalculate.addActionListener(this);

		/*
		 * When you see new followed by an interface (you cannot
		 * instantiate an interface) this code is creating a class
		 * (with no name) that implement the ActionListener interface
		 * and overrides/ implements the method(s) from that interface.
		 * 
		 * This is known as an Anonymous Inner Class. They exist to
		 * either implement an interface and implement its method(s) or
		 * subclass a class and override its method(s).
		 */
		btnCalculate.addActionListener(new ActionListener() {

			/* ActionEvent e gives more info about the Event that
			 * occurred, e.g. you can use it to test which button
			 * was pressed */
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateButtonPressed();
			}
		});
		
		/*
		 * This code listens out for a key being pressed on the
		 * calculate button. I.e. when the user pressed the Enter/
		 * Return key when the Calculate button has focus, then 
		 * click it. 
		 */
		btnCalculate.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {}
			
			/* When the Enter key is released, check that it was the
			 * Enter key that was pressed and click the button. */
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					btnCalculate.doClick(); // doClick() is the code
						// to click a button at runtime.
			}
			
			public void keyPressed(KeyEvent e) {}
		});
	}

	private void calculateButtonPressed() {
		
		/* txtFirst.getText() get the text from the TextField as 
		 * a String. 
		 * Integer.parseInt() will take that String and convert it
		 * into an int.
		 */
		try {
			int num1 = Integer.parseInt(txtFirst.getText());
			
			try { 
				int num2 = Integer.parseInt(txtSecond.getText());
				int result = num1 + num2;
				
				/* Integer.toString(result) will take an int and convert it
				 * into a String          */
				lblResult.setText(Integer.toString(result));
			} catch (NumberFormatException e) { 
				JOptionPane.showMessageDialog(this, 
						"Please type an int for the second number");
				txtSecond.requestFocus(); // Puts the cursor into a TextField
				txtSecond.selectAll();    // Select all the text
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(this, 
					"Please type an int for the first number");
			txtFirst.requestFocus(); // Puts the cursor into a TextField
			txtFirst.selectAll();    // Select all the text
		}
		
		/* "" + when you have a String on the LHS, + will act as 
		* String concatenation.					*/ 
		//lblResult.setText("" + result);
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Button was clicked");
	}*/

	public static void main(String[] args) {		
		new MyCalculator().setVisible(true);		
	}
	
	// Member/ Global variables
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JLabel lblResult;
	
} // End of class
