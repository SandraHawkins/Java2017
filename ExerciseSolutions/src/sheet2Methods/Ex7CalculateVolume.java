package sheet2Methods;

import java.util.Scanner;

public class Ex7CalculateVolume {

	public static void main(String [] args) {
		/* Declares an instance of this class, so that I can call
		getVolume(). */
		Ex7CalculateVolume ex7 = new Ex7CalculateVolume();
		/* Declares an instance of the Scanner class, so that I can
		use the methods getDouble() and getInt() to read in numbers
		from the command window. */
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to input a number
		System.out.print("Enter the first number: " );		
		/* input.nextDouble(); reads in a double from the command 
	    window and assigns that number to the variable num1. */
		double num1 = input.nextDouble();
		
		System.out.print("Enter the second number: " );
		double num2 = input.nextDouble();
		
		System.out.print("Enter the third number: " );
		double num3 = input.nextDouble();
		
		/* I need three different variable to get the three values
		from the user because I am sending all three numbers into
		the getVolume method on the same line. If I used the same
		variable and overwrite it twice, it will only store the 
		last number entered. */
		double volume = ex7.getVolume(num1, num2, num3);
		System.out.println("The volume is " + volume);
	}
	
	public double getVolume(double depth, double width, double breadth) {
		
		return depth * width * breadth;
	}

}