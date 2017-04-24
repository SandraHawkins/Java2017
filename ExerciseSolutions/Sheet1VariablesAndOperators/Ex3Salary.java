/* 
In every program you write, you will automatically get access (import)
to all class in the java.lang package. 

If you want to use a class outside of the lang package, you must
import that individual class (better) or the entire package.

import javax.swing.JOptionPane;		imports one class: JOptionPane
import javax.swing.*;	imports all classes in the javax.swing package.
*/
import java.lang.*;
import javax.swing.JOptionPane;

public class Ex3Salary {

	public static void main(String [] args) {
		
		double salary = 28_000;
		double weeklySalary = salary / 52;
		double total;
		double newSalary = salary * 1.08;
		
		total = salary * 5;
		
		System.out.println("Monthly salary " + salary / 12);
		System.out.printf("Weekly salary %.2f\n", weeklySalary);
		System.out.printf("Total in 5 years: %.2f\n", total);
		System.out.printf("New salary after 8%% pay rise: %.2f", 
						  newSalary);
		
		JOptionPane.showMessageDialog(null, 
						String.format("%.2f", salary));
	}
}