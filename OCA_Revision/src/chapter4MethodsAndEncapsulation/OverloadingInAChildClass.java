/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/OverloadingInAChildClass.java
 */ 

package chapter4MethodsAndEncapsulation;

class Animal {
	/* If walk was private, it will not be inherited and therefore
	 * Cat will not have a walk() method with no parameters. */
	void walk() { System.out.println("Animal"); }
}

class Cat extends Animal {
	// walk() is inherited from Animal.
	// public void walk() { System.out.println("Animal"); }
	
	/* This walk() method overloads the walk() in Animal because this
	 * class inherits the walk() method from Animal. */
	public void walk(String name) { System.out.println("Cat"); }
}

/*
 * To compile: which method is being called? 
 * It depends on the reference type which is on the LHS of the
 * declaration.  E.g. c.walk();
 * Q: what is c?  
 * A: it is a Cat
 * Q: has the Cat class got a walk method with no parameters?
 * A: yes, it inherits it and that method will be called at runtime. 
 * 
 * E.g. a.walk();
 * Q: what is a?  
 * A: it is a Animal
 * Q: has the Animal class got a walk method with no parameters?
 * A: yes, it that method will be called at runtime.
 * 
 * E.g. a.walk("");
 * Q: what is a?  
 * A: it is a Animal
 * Q: has the Animal class got a walk method with a String parameter?
 * A: no, it won't compile.  
 */
public class OverloadingInAChildClass {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat();
		Animal a1 = new Cat();
		a.walk();			// Animal
		c.walk();			// Animal
		// a.walk("Shep");	// won't compile
		// a1.walk("Shep");	// won't compile
		c.walk("Shep");		// Cat  
	}
}
