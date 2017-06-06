/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/Shape.java
 * 
 * Shape is the superclass for Rectangle, Circle and Triangle. It
 * is abstract. An abstract class cannot be instantiated. Its purpose
 * is to provide common functionality to all subclasses, i.e. setters
 * and getters will be inherited, constructors can be called from 
 * subclass constructors and its toString() can be called from subclass
 * toString(). 
 * An abstract class doesn't have to contain an abstract method but an
 * abstract method must be inside an abstract class. 
 * An abstract method CANNOT have a body, instead of {} it will end with
 * a ;
 * An abstract method MUST be implemented by all subclasses. 
 * When it makes no sense to implement a method in the superclass, e.g. 
 * the draw method will *draw* each shape and if it weren't abstract,
 * all child class would inherit it. 
 * 
 * It is not possible to implement the method here and let all child 
 * classes inherit it. So...... when it's abstract, there is no 
 * implementation here and all child classes MUST provide their own.
 * 
 * The first concrete class (non-abstract) must implement the draw()
 * method. So, an abstract subclass must insert an abstract draw() method
 * with a body. 
 */ 

abstract public class Shape {
	
	private Colour colour;
	
	/*
	 * I don't have no-args constructor, all child classes, if they don't
	 * contain any constructors, their default constructor will call 
	 * the parent's no-args and because it doesn't exist, they will not
	 * compile. 
	 * To fix this: type a constructor into each child class and explicitly
	 * call the constructor here that takes a colour, e.g.:
	 * 
	 * 		public Rectangle(Colour colour, int height, int width) {
	 * 			super(colour);
	 * 		}
	 */	
	
	public Shape(Colour colour) {
		this.colour = colour;
	}

	/* The keywords public and abstract can be interchangeable.
	 * This abstract method MUST be implemented by all non-abstract
	 * subclasses.  */
	public abstract void draw();

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public String toString() {
		return "Colour = " + colour;
	}
}
