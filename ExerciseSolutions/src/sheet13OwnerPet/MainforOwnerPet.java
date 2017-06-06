/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/MainforOwnerPet.java
 */ 

package sheet13OwnerPet;

import sheet10Shapes.Colour;

public class MainforOwnerPet {

	public static void main(String[] args) {
		
		
		Owner o = new Owner("John Jones", "Hollywood", "011234657", 
			 	  new Pet [] { new Dog("Spot", "Alsation", 5, 
			 			       Colour.INDIGO, false, "abc123"),
			 			  new Snake("Sid", "python", 2, Colour.BLACK, true),
			 			  new Hamster("Hammy", "dwarf", 3, Colour.YELLOW, true)} );
		System.out.println(o);

		/* o.getPets() will return an array of Pets - {dog, snake, hamster} */
		for (Pet p : o.getPets()) {
			
			/* 
			 * p instanceof Something
			 * p must be a reference to an object. 
			 * To compile: 'Something' must be a class in the same hierarchy, 
			 * i.e. 'Something' must be a parent or child of Pet 
			 * or ANY interface in the whole API (will compile).
			 */
			if (p instanceof Mammal){
				// Walk all the mammals
				// if the object referred to by p, implements the 
				// Mammal interface
				 ((Mammal)p).walk();
			}	
		}
	}
}
/** OUTPUT

Name is : John Jones
Address is : Hollywood
Phone Number : 011234657
The owners pets: 

Spot is a male dog
Breed is Alsation
Age is 5
Colour is indigo
The microchip number is abc123

Sid is a female snake
Breed is python
Age is 2
Colour is black

Hammy is a female hamster
Breed is dwarf
Age is 3
Colour is yellow

Spot is going for a walk.
Hammy is going for a walk.
*/