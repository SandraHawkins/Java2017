/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet7EmployeeAndClock/Employee.java
 */ 
package sheet15Exceptions;

public class Employee {
	
	/* Member variables */
	private String name;
	private int age;
	private double salary;
	private int noOfSickDay;
	private int noOfHolidays;
	private int employeeNum;
	
	/* Keeps track of the current employee number */
	private static int employeeNumCounter = 200;
	
	/* Used to count the number of employee objects created. As this
	 * is a static variable, it can be accessed outside the class using:
	 * 
	 * System.out.println("Num of employee objects " + Employee.employeeCounter); */
	public static int employeeCounter; 
	
	public Employee() {
		// Sets up the current employee's number and increments
		// the counter for the next Employee object created.
		this.employeeNum = employeeNumCounter++;
		noOfSickDay = 4; 		// default value
		noOfHolidays = 20;		// default value
		employeeCounter++;		// increment the counter
	}
	
	public Employee(String name) {
		this();
		this.name = name;
	}

	public Employee(String name, int age, double salary, int noOfSickDay, 
			int noOfHolidays) throws InvalidAgeException {
		this();
		this.name = name;
		//this.age = age;
		setAge(age);		
		
		this.salary = salary;
		this.noOfSickDay = noOfSickDay;
		this.noOfHolidays = noOfHolidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	/*
	 * If a method might throw a checked exception, it must 
	 * declare it. 
	 */
	public void setAge(int age) throws InvalidAgeException {
		if (age >= 16 && age <= 70) {
			this.age = age;
		} else {
			throw new InvalidAgeException(age + " is not valid for age");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoOfSickDay() {
		return noOfSickDay;
	}

	public void setNoOfSickDay(int noOfSickDay) {
		this.noOfSickDay = noOfSickDay;
	}

	public int getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(int noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}
	
	/**
	 * When a percentage is passed in, e.g. 1.04, it will
	 * add 4% onto the salary.
	 **/
	public double increaseSalary(double percentage) {
		salary = salary * percentage;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + 
				String.format(", salary=€%.2f", salary) + 
				", \n\tnoOfSickDay=" + noOfSickDay
				+ ", noOfHolidays=" + noOfHolidays + 
				", employeeNum=" + employeeNum + "\n";
	}
}