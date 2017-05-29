/** 
 * Author: Sandra Hawkins
 * Date:   26 May 2017
 * Inheritance//Child.java
 */

public class Child extends Parent {

	/* Member variables */
	private String schoolAddress;

	/* Constructors */
	public Child() {
		 // super();
	}
	
	/**
	 * This constructor takes all values for creating a child object. 
	 * When a child object is created in memory, it will get a copy of
	 * the member variables from its parents class and this child class,
	 * i.e. name and schoolAddress, therefore you should have a constructor
	 * that takes in values for both.
	 */
	public Child(String name, String schoolAddress) {
		/* The first line of EVERY constructor is a call to another, if
		 * you don't explicitly type a call, the compiler will insert
		 * a call to the parent's no-args constructor. If there isn't a
		 * no-arg constructor in the superclass, it won't compile but
		 * you can insert a call to another constructor in the parent
		 * class. */
		// super(); 
		
		// this.name won't compile because name is private in Parent
		//this.name = name;
		
		// setName(String name) is inherited from the superclass
		//super.setName(name);
		super(name);
			// or
		//setName(name);
		this.schoolAddress = schoolAddress;
	}

	/* Getters and Setters */
	/**
	 * @return the schoolAddress
	 */
	public String getSchoolAddress() {
		return schoolAddress;
	}

	/**
	 * @param schoolAddress the schoolAddress to set
	 */
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	/* toString() */
	public String toString() {
		/* Call super.toString() if there are loads of member variables
		 * in the parent class. */
		
//		return super.toString() + 
//				"\nSchool Address is : " + schoolAddress;
		
		return "In Child toString(), name is : " + getName() +
				"\nSchool Address is : " + schoolAddress;
	}
}