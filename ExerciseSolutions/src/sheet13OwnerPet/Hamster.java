/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Hamster.java
 */ 

package sheet13OwnerPet;

import sheet10Shapes.Colour;

public class Hamster extends Pet implements Mammal {
	
	Hamster() {}

	Hamster(String name, String breed, int age, Colour colour, 
			boolean isFemale) {
		super(name, breed, age, colour, isFemale);
	}

	@Override
	public String getTypeOfAnimal() {
		
		return "hamster";
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
