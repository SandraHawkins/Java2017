import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex10ReadInValuesAndGetTotal {

	public static void main(String [] args) {
	
		/* nextDouble() in the Scanner class is not static and 
		   therefore you need an instance of the class to call it. */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		
		/* If you are calling a static method, you do not need an
		   instance of the class, you call a static via the class name.*/
		String s = JOptionPane.showInputDialog("Enter a second number");
		double num2 = Double.parseDouble(s);
		
		System.out.print("Enter third number: ");
		double num3 = input.nextDouble();
		
		double total = getTotal(num1, num2, num3);
		System.out.println("The total is " + total);
	}
	
	/* This method is static, when you call a static method, you do
		not need an instance of the class, the method can be called
		directly. */
	public static double getTotal(double num1, double num2, double num3) {
		double result = num1 + num2 + num3;
		return result;
	}
} 