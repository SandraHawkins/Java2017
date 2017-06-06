/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Pet.java
 */ 

package sheet13OwnerPet;

/* Using the Colour enum from the Shapes exercise */
import sheet10Shapes.Colour;

public abstract class Pet {
	
	/* Could write/ use an enum for this: enum Gender { MALE, FEMALE } */
	public static final boolean MALE = false;
	public static final boolean FEMALE = true;	
	
	private String name;
	private String breed;
	private int age;
	private Colour colour;
	private boolean isFemale;
	
	public Pet() {}
	
	public Pet(String name, String breed, int age, 
			   Colour colour, boolean isFemale) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	
	//public abstract Object getTypeOfAnimal();
	public abstract String getTypeOfAnimal();

	@Override
	public String toString() {
		
		String text = "\n" + getName() + " is a " + 
                 ((isFemale()) ? "female ": "male ") + 
                 //this.getClass().getSimpleName();
                 getTypeOfAnimal();
		text += "\nBreed is " + breed;
		text += "\nAge is " + age;
		text += "\nColour is " + colour.toString().toLowerCase();
		return text;
	}	
}
