/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/Chair.java
 */ 

package sheet9Furniture;

public class Chair extends Furniture {
	
	private GasLift gasLift;
	private TypeOfChair typeOfChair;
	
	public Chair(Colour colour, MaterialType materialType,
			     GasLift gasLift, TypeOfChair typeOfChair) {
		super(colour, materialType);
		this.gasLift = gasLift;
		this.typeOfChair = typeOfChair;
	}
	
	/**
	 * @return the gasLift
	 */
	public GasLift getGasLift() {
		return gasLift;
	}
	/**
	 * @param gasLift the gasLift to set
	 */
	public void setGasLift(GasLift gasLift) {
		this.gasLift = gasLift;
	}
	/**
	 * @return the typeOfChair
	 */
	public TypeOfChair getTypeOfChair() {
		return typeOfChair;
	}
	/**
	 * @param typeOfChair the typeOfChair to set
	 */
	public void setTypeOfChair(TypeOfChair typeOfChair) {
		this.typeOfChair = typeOfChair;
	}
	
	@Override
	public String toString() {
		return "\n----- Chair ----- " + super.toString() +
				"\nGasLift = " + gasLift.toString().toLowerCase() +
				"\nTypeOfChair = " + 
				typeOfChair.toString().toLowerCase().replace('_', ' ');
	}
}