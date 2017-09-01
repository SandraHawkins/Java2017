/** 
 * Author: Sandra Hawkins
 * Date:   1 Sep 2017
 * OCA_Revision/chapter5ClassDesign/MainForAbstractClasses.java
 */ 

package chapter5ClassDesign;

/* 
 * - An abstract class cannot be instantiated. The following code will
 *   not compile: 
 * 					Shape s = new Shape();
 * - An abstract class exists to provide common functionality to all
 *   child classes, e.g. getters and setters will be inherited by all
 *   child classes. 
 *   
 * - An abstract class doesn't have to contain an abstract method.
 * - But if you have an abstract method, the class must be declared
 *   abstract.
 * 
 * - An abstract method:
 * 		> Cannot have a body.
 * 		> Must be overridden in a child class.
 *  	> Must be in an abstract class.
 * 		> Cannot be private.
 * 		> Cannot be final (final is the opposite of abstract).
 * 		> Overriding rules apply (see OverridingAndOverloading.java)
 * 
 * - The first concrete subclass must implement all abstract methods. 
 * 	 A concrete class is non-abstract. 
 */
abstract class Shape {
	
	static int num;
	final int VALUE = 10;
	
	/* Can contain constructor that will be called by child classes, 
	 * cannot be called directly with new Shape(); */
	public Shape() {}
	
	public abstract void draw();
}

/* If a subclass is abstract, it doesn't have to implement the 
 * abstract methods, it will inherit the definition. */
abstract class Circle extends Shape {
	abstract double getRadius();	// default access
}

class Oval extends Circle {
	public void draw() {
		num = 10;	// initialising num that is inherited from Shape.
		System.out.println(VALUE);
	}
	
	/* Cannot be less visible, protected is more visible that default. */
	protected double getRadius() {
		return 1.0;
	}
}

public class MainForAbstractClasses {
	public static void main(String[] args) {
		/* Cannot instantiate an abstract class. */
		//Shape s = new Shape();
	}
}