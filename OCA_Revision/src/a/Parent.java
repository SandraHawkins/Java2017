/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/a/Parent.java
 */ 

package a;

import b.Child;

public class Parent {
	
	public void publicMethod() {
		System.out.println("In public method");
	}
	
	/* A protected member (field/ variable or method) is visible 
	 * to any class in the same package and via inheritance. I.e.
	 * this method will be inherited by any class that extends Parent.
	 * I.e. a child class will get a 'copy & paste' of this method.
	 * This protected method can only be called in this package, or
	 * in a Child class that inherits it.  It CANNOT be accessed 
	 * through an instance of this class in another package. 
	 */
	protected void protectedMethod() {
		
	}
	
	/* Is only visible in the same package */
	void defaultMethod() {
		
	}
	
	/* Only visible in the same class */
	private void privateMethod() {
		
	}
	
	private void anotherMethod() {
		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
	}
}

class MainInPackageA {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.publicMethod();
		p.protectedMethod();	// same package
		p.defaultMethod();		// same package
		//p.privateMethod();  	// no access outside of Parent
		
		/* All methods below are called on a Child reference, only
		 * those methods that are inherited by the Child class
		 * can be called here. */
		Child c = new Child();
		c.publicMethod();
		c.protectedMethod();   // inherited into the Child class 
		//c.defaultMethod();   // defaultMethod is not inherited
							   // because Child is in a different package
		//c.privateMethod();
	}
}
