/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/MainForEmployee.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class MainForEmployee {

	public static void main(String[] args) {
		// The next line won't compile because Employee is abstract
		//Employee e = new Employee("Mary", "Murphy", 
		//			   LocalDate.of(1970, Month.JUNE, 22));

		Boss b = new Boss("Tony", "Soprano", 
				LocalDate.of(1958, Month.JUNE, 5), 135000);
		CommissionWorker c = new CommissionWorker("Tony", "Montana", 
				LocalDate.of(1949, Month.APRIL, 9), 200, 50, 32);
		PieceWorker p = new PieceWorker("Al", "Capone", 
				LocalDate.of(1922, Month.DECEMBER, 25), 125, 15);
		
		HourlyWorker h = new HourlyWorker("Bugsy", "Malone", 
				LocalDate.of(1902, Month.MAY, 25), 10, 50);
		System.out.println(h.getDateOfBirth());


		/* 
		 * When I have an array of child objects. The reference will be 
		 * of the parent type. When I want to call a child's method
		 * when looping through the array, I need to downcast the 
		 * Employee (parent) reference into a Boss (child) reference
		 * so I can access the getWeeklySalary() method as it is only
		 * in the Boss class.
		 * If I don't do a check (if (one instanceof Boss)), if one
		 * refers to a CommissionWorker object for example and I downcast
		 * from Employee to Boss, it will give a ClassCastException, if 
		 * the Parent Reference is downcast to the wrong type, e.g. one
		 * refer to a CommissionWorker then it cannot be cast to a Boss
		 * type.
		 */
		Employee [] workers = {b, c, p, h};
		
		for (Employee one : workers) {
			System.out.println(one.toString());

			if (one instanceof Boss) {
				// Print the Boss' weekly wage
				System.out.printf("Boss' salary €%,.2f",  
						((Boss)one).getWeeklySalary());
			}
		}	
	}
}