/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet11PayrollSystem/PieceWorker.java
 */ 

package sheet11PayrollSystem;

import java.time.LocalDate;

public class PieceWorker extends Employee {

	private double wagePerPiece;
	private int quantity;
	
	public PieceWorker(String firstname, String lastname, 
			LocalDate dateOfBirth, double wagePerPiece, int quantity) {
		super(firstname, lastname, dateOfBirth);
		this.wagePerPiece = wagePerPiece;
		this.quantity = quantity;
	}

	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
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
		return wagePerPiece * quantity;
	}

	@Override
	public String toString() {
		return "\nPieceWorker " + super.toString() + 
			   String.format("\nWage per piece = €%.2f", wagePerPiece) + 
			   "\nQuantity = " + quantity;
	}	
}
