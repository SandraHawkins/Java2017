import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/** 
 * Author: Sandra Hawkins
 * Date:   26 May 2017
 * Inheritance//MyFrame.java
 */
				  //  "IS-A"
public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setLayout(null);
		JButton myButton = new JButton("Click me");
		myButton.setBounds(10, 10, 100, 30);
		this.add(myButton);
		
		JTextField txt = new JTextField();
		txt.setBounds(10, 50, 100, 30);
		this.add(txt);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
