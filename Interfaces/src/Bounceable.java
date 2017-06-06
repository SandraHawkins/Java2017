/** 
 * Author: Sandra Hawkins
 * Date:   6 Jun 2017
 * Interfaces//Bounceable.java
 */

/* An interface is like a contract, if a class wants to be Bounceable,
 * it must implement all methods from this contract/ interface. 
 * Any class that implements this interface, e.g. the Circle class, 
 * all Circle objects, can then be treated as another type, e.g. a 
 * Cirle IS-A Shape and IS-A Bounceable object. So, I can put Circles 
 * into a Bounceable array, I can test objects to see if they are 
 * Bounceable, e.g. if (s instanceof Bounceable). 
 * 
 * Interfaces cannot have constructors. They can only have constants and
 * abstract methods.
 */
public interface Bounceable {
	
	/* Constants.
	 * All variables declared in an interface are :
	 * 
	 * public:		They are accessible to all child classes, and all 
	 * 				classes that are visible to this interface. These
	 * 				constants are inherited by all implementing classes.
	 * static:		Means just one exists in memory. To access a static 
	 *  			variable, either use Bounceable.SMALL_BOUNCE or
	 *  			Circle.SMALL_BOUNCE.
	 * final:		Once assigned a value, they cannot be changed. These
	 * 				constants must be assigned their value on the same 
	 * 				line. 
	 */
	int SMALL_BOUNCE = 1;
	int MEDIUM_BOUNCE = 5;
	int LARGE_BOUNCE = 10;

	
	/* Abstract methods. All methods in an interface are implicitly:
	 * 
	 * public:		When a child class implements this interface, it must
	 * 				implement ALL methods, the methods here are public,
	 * 				therefore they must be public in the implementing
	 * 				class.
	 * abstract: 	An abstract method must be implemented by all subclasses
	 *         		or implementing classes. An abstract method cannot
	 *         		have a body, must end in a ;
	 */
	void bounce();
	
	void setBounceFactor(int bounceFactor);
	
	int getBounceFactor();
}
