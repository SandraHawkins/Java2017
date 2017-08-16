/** 
 * Author: Sandra Hawkins
 * Date:   11 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/InstanceofOperator.java
 */ 

package chapter2OperatorsAndStatements;

import java.io.Serializable;

/*
 * instanceof is not supposed to be on the exam. 
 * 
 * if (referenceVar instanceof ClassOrInterface)
 * 
 * instanceof checks if the reference variable on the left refers 
 * to an object that "IS-A" (instance of) the class or interface 
 * on the right.
 * 
 * The RHS must be a class or interface to compile.
 */
public class InstanceofOperator {

	public static void main(String[] args) {	
		
		String name = "Fred";
		if (name instanceof String)
			System.out.println("name is a String");
		if (name instanceof Object) 
			System.out.println("name is an Object");
		
		/* When using instanceof, you must check for a class or
		 * interface in the same hierarchy. The following won't 
		 * compile because a String is not in the hierarchy (or 
		 * related to a Animal) */
		//if (name instanceof Animal)   // Won't compile.
		
		/* The following is legal/ will compile but will always be false*/
		if (null instanceof Object) 
			System.out.println("Won't be true");
		
		/*
		 * instanceof can be used to test/ check against a class in
		 * the same hierarchy.
		 * 
		 * 		Object     Serializable  CharSequence Comparable<String>
		 * 		  ^              ^            ^             ^
		 * 		  |              /            /             /
		 *      String
		 *        |
		 *      NO subclasses as it's final
		 *      
		 * The classes and interfaces in the String's hierarchy are
		 * Object, Serializable, CharSequence, Comparable and therefore
		 * you can only use instanceof to check if a string reference 
		 * is one of those types, anything else will not compile.
		 */
		// The following 5 lines will all be true.
		if (name instanceof String) {}
		if (name instanceof Object) {}
		if (name instanceof Serializable) {}
		if (name instanceof CharSequence) {}
		if (name instanceof Comparable) {} 
		/* You can use instanceof to check against any Interface
		 * BUT not when checking a String reference because String
		 * is final and therefore a String class cannot have any
		 * subclasses/ children.
		 */
		
		//if (name instanceof Barkable) {}
		//if (name instanceof Runnable) {}
		//if (name instanceof Animal) {}
		
		/* The reference type on the LHS can be same or higher (a
		 * parent) or an interface if that class implements that 
		 * interface.
		 * The reference type must be the same or a parent (interface). */
		Animal a = new Animal();
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Object o1 = new Dog();
		Barkable b1 = new Dog(); // ok as Dog implements Barkable
		//Barkable b2 = new Cat(); // no, Cat doesn't implement Barkable
		// Cat c = new Animal(); // no, Cat not a parent of Animal
		
		/* The compiler looks at reference type only, so what can
		 * an Animal reference be tested against with instanceof */
		if (a instanceof Object) {}  		// true
		if (a instanceof Animal) {}			// true
		/* An Animal reference can be tested against any interface
		 * in the API because a child of Animal might implement 
		 * that interface. 
		 * At runtime, instanceof will return true if the object
		 * referred to by a (new Animal()) implements that interface
		 * or extends that class. 
		 * The Animal object does not implement any of the following 
		 * and therefore they will all be false. */
		if (a instanceof Barkable) {}   	// false
		if (a instanceof Runnable) {}   	// false
		if (a instanceof Comparable) {}   	// false
		if (a instanceof CharSequence) {}   // false
		
		Dog d = new Dog();
		if (d instanceof Dog) {}		// true 
		if (d instanceof Object) {}		// true
		if (d instanceof Animal) {}		// true
		if (d instanceof Barkable) {}	// true
		if (d instanceof Runnable) {}	// false
		
		//if (Animal instanceof d) {}  // won't compile. Ref on the LHS
		// Class or interface on the RHS
		
		/* Animal a = new Dog();
		 * if (a instanceof Dog) {}  // true
		 * At compile time, the compiler checks the reference type:
		 * 'Animal' is in the same hierarchy as 'Dog', if
		 * yes, then it will compile. You can check against any 
		 * interface and it will compile.
		 * At runtime, the JVM checks if the object type 'Dog'
		 * extends or implements 'Dog'? Yes.
		 */
	}
}
/*
 * 			Object    
 *            ^
 *            |
 *          Animal		Barkable
 * 			  ^           ^
 *           /  \        /
 *         Cat  Dog    </
 */
class Animal { }
class Cat extends Animal {}
class Dog extends Animal implements Barkable {}
interface Barkable {}
