/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Cat.java
 */ 

package sheet13OwnerPet;

import sheet10Shapes.Colour;

public class Cat extends Pet implements Mammal {

	private boolean isNeutered;
	private int numOfLives = 9;
	private String microchipNumber;
	
	public Cat() {}
	
	public Cat(String name, String breed, int age, 
			   Colour colour, boolean isFemale,
			   String microchipNumber, boolean isNeutered) {
		super(name, breed, age, colour, isFemale);
		this.isNeutered = isNeutered;
		this.microchipNumber = microchipNumber;
	}

	public String getMicrochipNumber() {
		return microchipNumber;
	}

	public void setMicrochipNumber(String microchipNumber) {
		this.microchipNumber = microchipNumber;
	}

	public void justLostALife() {
		numOfLives--;
	}
	
	public int getNumOfLives() {
		return numOfLives;
	}

	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}

	public boolean isNeutered() {
		return isNeutered;
	}

	public void setNeutered(boolean isNeutered) {
		this.isNeutered = isNeutered;
	} 
	
	public String toString() {
		return super.toString() +
				"\nMicrochip number " + microchipNumber +
				"\nNumber of lives " + numOfLives + 
				String.format("\nThe cat %s neutered",
						(isNeutered) ? "is" : "is not");
	}

	@Override
	public String getTypeOfAnimal() {
		return "cat";   
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
