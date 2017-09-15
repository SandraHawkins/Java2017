/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/OverridingRules.java
 */ 

package chapter6Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * When overriding and the parent method throws a checked exception, 
 * the overriding method (in the child class):
 * 
 * - can throw the same, a subtype or nothing. 
 * - can throw unchecked exceptions.
 * - cannot throw a new checked exception.
 * - cannot throw a parent of the checked exception.
 */
class Parent {
	public void aMethod() throws IOException {}
}

class Child extends Parent {
	/**
	 * What is ok to throw?
	 * The same checked exception as the parent.
	 * A subtype of the parent's checked exception.
	 * Ignore it.
	 * Any unchecked exception are ok to throw.
	 */
	//public void aMethod() throws IOException {} // same, ok
	//public void aMethod() throws FileNotFoundException {} // subtype, ok
	//public void aMethod() {} // nothing ok
	//public void aMethod() throws ClassCastException {} // unchecked, ok
	//public void aMethod() throws InterruptedException {} // no, as it
	// is a new checked exception
	//public void aMethod() throws Exception {} // no, cannot throw a parent
	
}

public class OverridingRules {
/*
 * Where you are calling an overridden method, the compiler will 
 * check the signature of the method in the Parent's class (i.e. the
 * reference type) and at runtime, the object type's overridden 
 * method will be called. Therefore at compile the catch is needed
 * to catch the checked exception listed in the parent's method 
 * signature, and at runtime this catch will be able to deal with the:
 * same/ subtype/ or no exception whichever the child's methods has. 
 */
	public static void main(String[] args) {
		
		Parent p = new Child();
		try {
			p.aMethod();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
