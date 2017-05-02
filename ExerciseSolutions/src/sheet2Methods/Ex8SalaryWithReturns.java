package sheet2Methods;

public class Ex8SalaryWithReturns {

	public static void main(String [] arg) { 
		/* This line creates an instance of Ex8SalaryWithReturns 
		and calls it ex8.  I can then call all methods in this class 
		using ex8. */
		Ex8SalaryWithReturns ex8 = new Ex8SalaryWithReturns();
		
		double salary = 30_000;
		double monthly = ex8.printMonthlySalary(salary);
		System.out.printf("Monthly salary %.2f\n", monthly);
		//double weekly = ex8.printWeeklySalary(salary);
		
		/* You can call a method within the println or printf, the 
		method must return a value, i.e. you cannot call a void method
		from println or printf*/
		System.out.printf("Weekly salary %.2f\n", 
						  ex8.printWeeklySalary(salary));
						  
		double newSalary = ex8.salaryAfterPayRise(salary, 4);
		System.out.printf("New salary after 4%% pay rise %.2f\n", 
						   newSalary);
		newSalary = ex8.salaryAfterPayRise(salary, 6);
		System.out.printf("New salary after 6%% pay rise %.2f\n", 
						   newSalary);
				
		/* The following line of code will not compile, you cannot
		call a void method (i.e. a method that returns nothing) from
		within a call to println() or printf() */		
		//System.out.println("Calling printHello() " + ex8.printHello());
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	/*
		salary is the yearly salary.
		payRise is the percentage pay rise, e.g. 4%.
	*/					
	public double salaryAfterPayRise(double salary, double payRise) {
		double result = salary + (salary * (payRise / 100));
		//System.out.printf("Salary after pay rise %.2f\n", result);	
		return result;
	}
								
	public double printMonthlySalary(double yearlySalary) {
		double salary = yearlySalary / 12;   
		// System.out.printf("Monthly salary is : %.2f\n", salary);
		return salary;
	}
	
	public double printWeeklySalary(double yearlySalary) {
		double salary = yearlySalary / 52;   
		// System.out.printf("Weekly salary is : %.2f\n", salary);
		return salary;
	}
}
/*** OUTPUT
Monthly salary 2500.00
Weekly salary 576.92
New salary after 4% pay rise 31200.00
New salary after 6% pay rise 31800.00
*/