/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/b/Child.java
 */ 

package b;

import a.Parent;

public class Child extends Parent {

	/*
	 * Any public and protected methods from the Parent will be
	 * inherited, as if they are copied and pasted in here.
	 */
	private void anotherMethod() {
		publicMethod();
		protectedMethod();
		//defaultMethod();	// Cannot be seen outside of package a
		//privateMethod();	// Cannot be seen outside of class Parent
	}
}

class MainInPackageB {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.publicMethod();
		//p.protectedMethod();    // Cannot be seen outside of package 'a'
		//p.defaultMethod();	  // Cannot be seen outside of package 'a'
		//p.privateMethod();      // Cannot be seen outside of the Parent

		Child c = new Child();
		c.publicMethod();
		/* The protected method which is in the Parent class is in 
		 * package 'a' can only be accessed outside of 'a' physically
		 * inside a Child / subclass through inheritance. See line 19. 
		 * Cannot be access via a reference to that class outside
		 * of package 'a'. */
		//c.protectedMethod();      // *** only visible physically inside
								  // *** the child class, via inheritance
		
		//c.defaultMethod();	  // Cannot be seen outside of package 'a'
		// c.privateMethod();	  // Cannot be seen outside of the Parent
	}
}

