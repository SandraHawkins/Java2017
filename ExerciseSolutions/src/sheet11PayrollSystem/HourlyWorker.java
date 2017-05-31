/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/HourlyWorker.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;

public class HourlyWorker extends Employee {

	private double wagePerHour;
	private int hoursWorked;
	
	public HourlyWorker(String firstname, String lastname, 
			LocalDate dateOfBirth, double wagePerHour, int hoursWorked) {
		super(firstname, lastname, dateOfBirth);
		this.wagePerHour = wagePerHour;
		this.hoursWorked = hoursWorked;
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	/**
	 * Overriding rules:
	 * The visibility modifier: same or more visible, can't be less visible.
	 * Return type: 		    MUST be the same.
	 * Name: 					MUST be the same.
	 * Parameter list: 			MUST be the same.
	 */
	public double getEarnings() {
//		if (hoursWorked > 40) {
//			return (40 * hoursWorked) + 
//					((hoursWorked - 40) * wagePerHour * 1.5);
//		} else {
//			return hoursWorked * wagePerHour;
//		}
				// condition 
		return hoursWorked > 40 ?   
				// condition true 
			(40 * wagePerHour) + ((hoursWorked - 40) * wagePerHour * 1.5) 
				// condition false
			: hoursWorked * wagePerHour;	
	}

	@Override
	public String toString() {
		return "\nHourlyWorker " + super.toString() + 
			   String.format("\nWage per hour = €%.2f", wagePerHour) + 
			   "\nHours worked = " + hoursWorked;
	}
}
