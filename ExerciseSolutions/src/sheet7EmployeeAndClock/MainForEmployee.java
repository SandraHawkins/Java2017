/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet7EmployeeAndClock/MainForEmployee.java
 */ 
package sheet7EmployeeAndClock;

public class MainForEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ted Murphy");
		e1.setAge(18);
		e1.setNoOfHolidays(20);
		e1.setNoOfSickDay(4);
		e1.setSalary(25_000);

		Employee e2 = new Employee("John Smith", 40, 50_500, 2, 30);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("Number of Employee objects created " + 
						Employee.employeeCounter);
		
		e1.increaseSalary(1.04);
		e2.increaseSalary(1.04);
		System.out.println("New salary for e1 " + e1.getSalary());
		System.out.println("New salary for e2 " + e2.getSalary());
	}
}
/** OUTPUT
Employee name=Ted Murphy, age=18, salary=€25000.00, 
	noOfSickDay=4, noOfHolidays=20, employeeNum=200

Employee name=John Smith, age=40, salary=€50500.00, 
	noOfSickDay=2, noOfHolidays=30, employeeNum=201

Number of Employee objects created 2
New salary for e1 26000.0
New salary for e2 52520.0
*/