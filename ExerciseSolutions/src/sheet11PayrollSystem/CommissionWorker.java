/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/CommissionWorker.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;

public class CommissionWorker extends Employee {

	private double salary;
	private double commission;
	private int quantity;
	
	public CommissionWorker(String firstname, String lastname, 
			LocalDate dateOfBirth, double salary, double commission, 
			int quantity) {
		super(firstname, lastname, dateOfBirth);
		this.commission = commission;
		this.quantity = quantity;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Overriding rules:
	 * The visibility modifier: same or more visible, can't be less visible.
	 * Return type: 		    MUST be the same.
	 * Name: 					MUST be the same.
	 * Parameter list: 			MUST be the same.
	 */
	public double getEarnings() {
		return salary + (commission * quantity);
	}

	@Override
	public String toString() {
		return "\nCommissionWorker " + super.toString() + 
			   "\nSalary = " + String.format("€%.2f", salary) +
				String.format("\nCommission = €%.2f", commission) + 
				"\nQuantity = " + quantity;
	}
}