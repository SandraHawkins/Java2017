/** 
 * Author: Sandra Hawkins
 * Date:   4 Sep 2017
 * OCA_Revision/chapter5ClassDesign/MainForShapes.java
 */ 

package chapter5ClassDesign;

class Shape1 { 	
	void draw() { 
		System.out.println("Shape: draw()"); 
	} 
}

interface Bounceable {	
	void bounce();  /*public abstract*/  
}

class Circle1 extends Shape1 implements Bounceable {
	public void bounce() {  
		System.out.println("Circle bouncing");
	}
}

class Oval1 extends Circle1 { }

class Rectangle1 extends Shape1 {}

public class MainForShapes {
	public static void main(String[] args) {
		
		/* RULES: Reference type = Object
		 * The reference type must be the same or higher/ parent. 
		 * Which can include a parent class or an implemented interface.
		 * A child reference cannot refer to a parent object.
		 */
		Bounceable b = new Circle1();
		Bounceable b1 = new Oval1();
		//Bounceable r1 = new Rectangle1();
		Circle1 c2 = new Circle1();
		
		/* What methods can you call on a reference? 
		 * On the reference 'b' which is a Bounceable reference, you
		 * can only call the bounce() method.
		 * The bounce() method in Circle will be called at runtime
		 * as the Circle class overrode the method. */
		b.bounce();
		//r.bounce();  // bounce() is not in Shape, won't compile
		
		/* Casting is changing the reference type!!!!!!
		 * The object type ALWAYS stays the same. 
		 * You downcast to change the reference from the parent type into
		 * the child so that you can access the methods in the child class.
		 * 
		 * RULES for Casting:
		 * 1. Upcasting is allowed but not required, e.g.:
		 * 		Shape s = new Circle();			// upcast not needed
		 * 		Shape s = (Shape)new Circle();  // upcast included
		 *  
		 * 		Circle c = new Circle();
		 * 		Shape s = (Shape)c;				// upcast not needed
		 * 
		 * 2. Downcasting is the most popular and the cast is needed.
		 * 		Shape s = new Circle();
		 *  	//s.bounce();   // won't compile: bounce() is not in Shape	
		 *  	((Circle)s).bounce();
		 *  
		 * 3. Cannot cast to unrelated classes, it won't compile.
		 * 		 Shape s = new Circle();
		 * 		 // ((Animal)s).walk();   // won't compile.
		 *   The class you are casting to must be in the same hierarchy. 
		 *   
		 *   You can cast to an unrelated interface, it will compile but 
		 *   cause a ClassCastException at runtime.
		 *   	 ((Comparable)s).compareTo(null);
		 *   
		 *   *** Cannot cast to 'sibling' types ***
		 *   	Circle c = new Circle();
		 *   	((Rectangle)c).draw();  // WON'T COMPILE
		 *  
		 * 4. You will get a ClassCastException when the object is being
		 *    referred to by a reference that doesn't match.  
		 * 
		 * 		Shape s = new Rectangle();
		 * 		((Circle)s).bounce();
		 * 
		 *    a) The compiler checks that Shape and Circle are in the
		 *       same hierarchy.
		 *    b) The JVM at runtime checks the object type, the object
		 *       is a Rectangle and cannot be referred to by a Circle
		 *       reference and therefore this will give a 
		 *       ClassCastException. It must be the same reference or 
		 *       a parent.
		 */
				
		// Bounceable b = new Circle1();

		((Circle1)b).draw();
		((Shape1)b).draw();
		
		Shape1 s = new Circle1();
		s.draw();
		//((Oval1)s).draw();  	// ClassCastException
		
		/* 1. This compiles because Shape is in the same hierarchy as
		 *    Oval.
		 * 2. It won't run because, after the cast the Circle object 
		 *    is being referred to by an Oval and a Circle can only
		 *    be referred to by these references: Circle, Shape,
		 *    Object or Bounceable.
		 */
		
		Shape1 s1 = new Rectangle1();
		((Circle1)s1).bounce();  // ClassCastException
	}
}
