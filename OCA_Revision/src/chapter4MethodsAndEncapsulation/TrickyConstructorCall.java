/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/TrickyConstructorCall.java
 */ 

package chapter4MethodsAndEncapsulation;

class Parent {
	/* static variables are inherited by the Child class and 
	 * can be accessed just by 'name' or Parent.name */
	//static String name = "Parent";
		
	Parent(String s) {  
		// super();
	}
}

/* hint: The order things happen. */
class Child extends Parent {
	
	String name = "Child";
	
	/* The first line of a constructor must be a call to another 
	 * constructor. The purpose is to create the parent first.
	 * On the first line here, the Child's member variables will not 
	 * be set up in memory until after the Parent constructor completes
	 * and therefore you cannot access (non-static) member variables 
	 * as part of the constructor :
	 * call (this(xx) or super(xx). xx can only be a static variable.
	 * 
	 * The solution: do not access a member variable as part of a 
	 * call to this() or super().
	 * or:
	 * You make name static. 
	 **/
	Child() {
		super("");  	 // just to make this class compile :-) Calls constructor Parent(String s)
		//super(name);   // won't compile.
	}
}

// main() {   new Child();   }