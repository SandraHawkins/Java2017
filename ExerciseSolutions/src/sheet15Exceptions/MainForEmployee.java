/** 
 * Author: Sandra Hawkins
 * Date:   9 Jun 2017
 * ExerciseSolutions/sheet15Exceptions/MainForEmployee.java
 */ 

package sheet15Exceptions;

import javax.swing.JOptionPane;

public class MainForEmployee {

	public static void main(String[] args) {

		try {
			Employee e1 = new Employee();
			e1.setName("Fred");
			// The following line will throw an exception and execution 
			// will jump to the catch underneath
			e1.setAge(80);
			System.out.println(e1);
		} catch (InvalidAgeException e) { // child first
			
			JOptionPane.showMessageDialog(null, "Age wrong: " + 
					e.getMessage());
			e.printStackTrace();
			
		} catch (Exception e) { // parent last
			e.printStackTrace();
		}

		try {
			Employee [] all = {new Employee(), new Employee("Mary"),
					// The following line will throw an exception because 
					// age is 102 and execution will jump to the catch block
					new Employee("Jane", 102, 1_000_000, 20, 50),
					new Employee("Grant", 23, 50, 4, 20)};
			for (Employee e : all) {
				System.out.println(e);
			}
		} catch (InvalidAgeException e) {
			System.out.println("Error creating array");
			e.printStackTrace();
		} 

		try {
			// The following line will throw an excpetion and jump to
			// the catch block.
			Employee e2 = new Employee("Bob", 99, 200, 30, 30);
			System.out.println(e2);
		} catch (InvalidAgeException e) {
			System.out.println("Wrong argument " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main will carry on if an exception is caught or not");
		
		/* Valid for the exam, a try must have a catch or a finally.
		 * If you exit the application, the finally block will not execute */
		try {
			System.out.println("In the try block");
			/* If you exit from the try or catch, the finally block will 
			 * NOT execute. */
			System.exit(1);
		} finally {
			// Won't execute because of the System.exit() in the try.
			System.out.println("In the finally block");
		}
	}
}
/** POSSIBLE OUTPUT: (the stack traces are not guaranteed to print in
    the order you expect).   
   
sheet15Exceptions.InvalidAgeException: 80 is not valid for age
	at sheet15Exceptions.Employee.setAge(Employee.java:73)
	at sheet15Exceptions.MainForEmployee.main(MainForEmployee.java:20)
sheet15Exceptions.InvalidAgeException: 102 is not valid for age
Error creating array
Wrong argument 99 is not valid for age
	at sheet15Exceptions.Employee.setAge(Employee.java:73)
	at sheet15Exceptions.Employee.<init>(Employee.java:46)
	at sheet15Exceptions.MainForEmployee.main(MainForEmployee.java:36)
sheet15Exceptions.InvalidAgeException: 99 is not valid for age
	at sheet15Exceptions.Employee.setAge(Employee.java:73)
	at sheet15Exceptions.Employee.<init>(Employee.java:46)
	at sheet15Exceptions.MainForEmployee.main(MainForEmployee.java:49)
Main will carry on if an exception is caught or not
In the try block
*/
