/** 
 * Author: Sandra Hawkins
 * Date:   26 May 2017
 * Inheritance//Parent.java
 */

/**
 * - A parent / superclass exists to provide common functionality to all
 * 	 child/ subclasses. 
 * - All non-private (public, protected and (default)) methods will be 
 *   inherited by all child classes.
 * - The parent object must exist before any child object, therefore
 *   a constructor in Object and Parent will execute before the 
 *   constructor in a Child class. 
 * - A subclass class can only have one superclass. I.e. a child class
 *   can only extend one class. Multiple inheritance does not exist 
 *   in Java. 
 * - Constructors are NOT inherited but can be called by a subclasses'
 *   constructor using the keyword super() or super(name), which must 
 *   be the first line of the constructor.      
 **/
public class Parent /* extends Object */ {

	/* Member variables */
	private String name;
	
	/* Static/ class variable */
	public static int personCounter;  // 2
	
	/* Constructors are not inherited but can be called by the subclasses'
	 * constructors. 
	 */
	public Parent() {
		// super();
		personCounter++;
	}
	
	public Parent(String name) {
		this();
		setName(name);   // this.name = name;
	}
	
	/* Getters and Setters */
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* toString() */
	public String toString() {
		return "Parent's toString() - Name : " + name;
	}
}