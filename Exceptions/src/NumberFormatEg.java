import javax.swing.JOptionPane;

/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//NumberFormatEg.java
 */

/**
 * Calling Integer.parseInt("2") or Double.parseDouble("number") might
 * throw a NumberFormatException.  It is an unchecked exception, i.e. 
 * it extends directly from RuntimeException and therefore you DON'T 
 * need try/ catch code surrounding the calls to parseXxx(), you can
 * of course add try/ catch code and here is what it would look like:
 */
public class NumberFormatEg {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Please enter a number");
		try {
			int num = Integer.parseInt(s);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("You didn't enter a number");
			e.printStackTrace();
		}
		System.out.println("After the catch");
	}
}
