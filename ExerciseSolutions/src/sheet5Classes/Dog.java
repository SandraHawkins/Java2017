/** 
 * Author: Sandra Hawkins
 * Date:   16 May 2017
 * ExerciseSolutions/sheet5Classes/Dog.java
 */ 
package sheet5Classes;

public class Dog {

	/* Member variables. Keep private with public accessor methods */
	/* breed is an int to make use of the constants below. Constants are
	 * used lots in the API, and this is to demonstate how they would
	 * be used. */
	private int breed;
	private String colour;
	private String ownersName;

	/* Static/ class variables */
	public static int dogCounter;

	/* Constants that should be used to set the breed.
	 * public - accessible from outside this class
	 * static - only one copy in memory, you can access a static variable
	 *          in this class by using its name directly, from outside
	 *          the class use: e.g. Dog.HUSKY
	 * final - once assigned a value, it cannot be changed. It is a 
	 * 		   CONSTANT. Should be written in CAPS.
	 **/
	public static final int LABRADOR = 1;
	public static final int POINTER = 2;
	public static final int COLLIE = 3;
	public static final int HUSKY = 4;
	public static final int ALSATION = 5;
	public static final int BOXER = 6;
	public static final int BULL_TERRIER = 7;
	public static final int GERMAN_SHEPHARD = 8;
	public static final int XOLOITZCUINTLI = 9;
	
	/* Constructors */
	public Dog() {
		dogCounter++;
	}

	public Dog(int breed, String colour, String name) {
		this(); // call the no-args constructor
		// this.breed = breed; // use set method as it is validating
		setBreed(breed);
		this.colour = colour;
		this.ownersName = name; // 'this.' is not needed here because the 
		// parameter has a different name to the member variable.
	}

	/*
	 * Please choose a breed (1 to 9):
	 * 1: Labrador
	 * 2: Pointer
	 * .
	 * .
	 * .
	 */

	/* Getters and Setter */
	public void setBreed(int breed) {
		if (breed >= 1 && breed <= 9)
			this.breed = breed;
		else { // Not a valid breed
			System.out.println("Invalid breed");
		}
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setOwnersName(String name) {
		ownersName = name;
	}

	public int getBreed() {
		return breed;
	}

	public String getColour() {
		return colour;
	}

	public String getOwnersName() {
		return ownersName;
	}

	/* This method looks at the value in breed which is an int, and
	 * returns a meaningful String for that int. */
	public String getBreedAsString() {
		
		switch (breed) {
		case ALSATION:
			return "Alsation";
		case BOXER:
			return "Boxer";
		case BULL_TERRIER:
			return "Bull terrier";
		case COLLIE:
			return "Collie";
		case GERMAN_SHEPHARD:
			return "German shephard";
		case HUSKY:
			return "Husky";
		case LABRADOR:
			return "Labrador";
		case POINTER: 
			return "Pointer";
		case XOLOITZCUINTLI:
			return "Xoloitzcuintli";
		default:
			return "Breed not set";
		}
	}

	/* toString */
	public String toString() {
		return "\nBreed: " + getBreedAsString() +
				"\nColour: " + colour +
				"\nOwner's name: " + ownersName;
	}
}