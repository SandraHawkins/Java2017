/** 
 * Author: Sandra Hawkins
 * Date:   16 May 2017
 * ExerciseSolutions/sheet5Classes/MainForDog.java
 */ 
package sheet5Classes;

public class MainForDog {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.setBreed(Dog.LABRADOR);
		d1.setColour("Golden");
		d1.setOwnersName("Mr. Brown");
		System.out.println("Breed: " + d1.getBreed());
		System.out.println("Colour: " + d1.getColour());
		System.out.println("Owner: " + d1.getOwnersName());
		
		// print the counter, static variable in Dog
		System.out.println("count: " + Dog.dogCounter);
		
		Dog d2 = new Dog(Dog.POINTER, "Black", "Agnieszka");
		System.out.println(d2);
		// print the counter
		System.out.println("count: " + Dog.dogCounter);
		
		Dog d3 = new Dog(Dog.GERMAN_SHEPHARD, "white", "Bill Gates");
		System.out.println(d3);
		
		Dog d4 = new Dog(65, "Brown", "Mr. Smith");  // Invalid breed
		System.out.println("Breed is " + d4.getBreed());  // 0
		System.out.println(d4);
	}
}
/** OUTPUT
Breed: 1
Colour: Golden
Owner: Mr. Brown
count: 1

Breed: Pointer
Colour: Black
Owner's name: Agnieszka
count: 2

Breed: German shephard
Colour: white
Owner's name: Bill Gates
Invalid breed
Breed is 0

Breed: Breed not set
Colour: Brown
Owner's name: Mr. Smith
*/