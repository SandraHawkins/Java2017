/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * ExerciseSolutions/sheet13OwnerPet/Owner.java
 */ 

package sheet13OwnerPet;

public class Owner {

	// member variables
	private String name;
	private String address;
	private String phoneNumber;
	private Pet [] pets;

	// Constructors
	public Owner() {
	}

	public Owner(String newName, String address, String phoneNumber, 
			Pet [] pets) {
		setName(newName);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setPets(pets);
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Pet[] getPets() {
		return pets;
	}

	public void setPets(Pet[] pets) {
		this.pets = pets;
	}

	// toString
	public String toString() {

		String s = "\nName is : " + getName() +
				"\nAddress is : " + getAddress() +
				"\nPhone Number : " + getPhoneNumber();

		s += "\nThe owners pets: \n";

		/* Loops through the array of pets (the member variable) and
		 * calls the toString() on each, appending to the 's' String. */
		for(Pet p: pets){
			s += p.toString() + "\n";
		}
		return s;
	}
}
