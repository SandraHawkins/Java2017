/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/Boss.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;

public class Boss extends Employee {
	
	private double weeklySalary;

	public Boss(String firstname, String lastname, LocalDate dateOfBirth, double weeklySalary) {
		super(firstname, lastname, dateOfBirth);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	/**
	 * Overriding rules:
	 * The visibility modifier: same or more visible, can't be less visible.
	 * Return type: 		    MUST be the same.
	 * Name: 					MUST be the same.
	 * Parameter list: 			MUST be the same.
	 */
	public double getEarnings() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "\nBoss " + super.toString();
	}
}