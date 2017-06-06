/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Snake.java
 */ 

package sheet13OwnerPet;

import sheet10Shapes.Colour;

public class Snake extends Pet {
	
	public Snake(String name, String breed, int age, Colour colour,
			boolean isFemale) {
		
		super(name, breed, age, colour, isFemale);
	}

	/* getTypeOfAnimal() in the Pet class is abstract, if it were to
	 * return an Object data type, the correct implementation could
	 * return the same or subtype. Therefore I could return an Object,
	 * or String, or Integer, or Double. */
	//public abstract Object getTypeOfAnimal();
	
	/* 
	 * If I override getTypeOfAnimal() and return an Integer, I can
	 * return 123.  123 is a primitive and will be wrapped in an object
	 * and an Integer instance will be returned. 
	 * 
	 * return 123 is the same as return new Integer(123);
	 */
//	@Override
//	public Integer getTypeOfAnimal() {
//		return 123;    // 
//		//return new Integer(123);
//	}
	
	@Override
	public String getTypeOfAnimal() {
		return "snake";
	}

}