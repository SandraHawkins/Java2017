/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Dog.java
 */ 

package sheet13OwnerPet;

import sheet10Shapes.Colour;

public class Dog extends Pet implements Mammal {

	private String microChipNumber = "Not set yet";
	private boolean isMicroChipped;

	public static final boolean IS_MICRO_CHIPPED = true;
	public static final boolean IS_NOT_MICRO_CHIPPED = false;

	public Dog() {}

	public Dog(String name, String breed, int age, Colour colour, 
			boolean isFemale, String microChipNumber) {
		
		super(name, breed, age, colour, isFemale);
		setMicroChipNumber(microChipNumber);
	}

	public String getMicroChipNumber() {
		return microChipNumber;
	}

	public void setMicroChipNumber(String microChipNumber) {
		// If the user decides to set the MicrochipNumber then 
		// set the boolean isMicroChipped to true also.
		this.isMicroChipped = true;
		this.microChipNumber = microChipNumber;
	}

	public boolean isMicroChipped() {
		return isMicroChipped;
	}

	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	
	public String toString() {
		return super.toString() +
	          ((isMicroChipped) 
	        		  ? "\nThe microchip number is " + microChipNumber 
	        		  : "The dog is not microchipped");
	}

	@Override
	public String getTypeOfAnimal() {
		return "dog";
	}
	
	@Override
	public void walk() {
		System.out.println(getName() + " is going for a walk.");		
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " is sleeping.");		
	}
}
