/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/Employee.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * An abstract class provided common functionality to all child classes.
 * An abstract class cannot be instantiated. 
 * An abstract class doesn't have to have an abstract method BUT if
 * if there is an abstract method, the class must be abstract too.  
 */
public abstract class Employee {
	
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	
	public Employee(String firstname, String lastname, 
			        LocalDate dateOfBirth) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * An abstract method must be implemented in all subclass. The 
	 * implementation for this method will be different for each subclass,
	 * therefore it cannot be implemented here and inherited so, it is
	 * made abstract for each child to provide their own implementation.
	 * 
	 * An abstract method must be in an abstract class.
	 */
	public abstract double getEarnings();

	@Override
	public String toString() {
		// An instance of DateTimeFormatter is used to format a LocalDate/
		// LocalTime or LocalDateTime. The constructor is not visible, so 
		// to create an instance you must use one of the ofLocalizedDate()
		// or ofPattern() methods. To use this instance, you pass it to
		// the format() method of your localDate instance. See below: 
		DateTimeFormatter formatter =
				DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
				//DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Name = " + firstname + " " + lastname + 
			   "\nDate of birth = " + dateOfBirth.format(formatter) +
			   // , on the next line makes any number 1,000 or over
			   // include a ,
			   "\nEarnings " + String.format("€%,.2f", getEarnings());
	}
}
