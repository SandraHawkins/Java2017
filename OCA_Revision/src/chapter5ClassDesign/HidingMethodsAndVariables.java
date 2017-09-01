/** 
 * Author: Sandra Hawkins
 * Date:   1 Sep 2017
 * OCA_Revision/chapter5ClassDesign/HidingMethodsAndVariables.java
 */ 

package chapter5ClassDesign;

/**
 * This class contains:
 * 
 * - a hidden variable
 * - a hidden static method
 * - a hidden private method
 * 
 * Which one gets called depends on the reference type for all
 * (which is on the LHS of the declaration):
 * 
 * 		Parent p = new Child();
 * 		S.o.pln(p.variable);		// Parent's variable
 *      p.staticMethod();			// Parent's static methods
 */

class Parent {
	/* 
	 * A variable cannot be overridden, it can be typed into a child
	 * and the child variable will hide this one. 
	 */
	public int variable = 10;
	
	
	/* A private method can only be seen in the class it's in and 
	 * therefore you cannot override a private method, but you can
	 * redeclare it in a child class. So, the overriding rules do
	 * not apply. 
	 */
	private void privateMethod() {
		System.out.println("Private method in Parent");
	}
	
	/* 
	 * Static methods are inherited and can be seen in a child class.
	 * You cannot override a static method, if you type the same method
	 * into a Child class, you are hiding/ shadowing this static method.
	 * 
	 * Overriding rules DO apply:
	 * 1. Same name and same parameter list
	 * 2. Return type must be the same or a subtype/ covariant type.
	 * 3. Visibility: cannot be less visible. Same or higher. 
	 * 4. Exceptions: cannot declare new checked exceptions or broader
	 *    (parent type) but can omit it. (Same/ ignore/ subtype)
	 *    
	 * 5a. If the method is static in the parent, it must be static
	 *     in the child.
	 * 5b. If the method is not static in the parent, it must not be
	 *     static in the child.
	 *     
	 * BUT: if a static method is called on a child object with a 
	 *      parent reference: 
	 *      
	 *      	Parent p = new Child();
	 *          p.staticMethod();
	 *          
	 *      Which static method gets called, depends on the reference 
	 *      type. 
	 */
	protected static void staticMethod() {
		System.out.println("Static method in Parent");
	}
}

class Child extends Parent {
	/* Hides 'variable' in the Parent class */
	int variable = 20;
	
	/* This is not an overridden method and can only be called from
	 * within this class. You can ignore any overriding rules, e.g.
	 * you can change the return type and visibility modifier. */
	protected int privateMethod() {
		System.out.println("Private method in Child");
		return 1;
	}
	
	protected static void staticMethod() {
		System.out.println("Static method in Child");
	}

	void anyMethod(int variable) {
		staticMethod();
		System.out.println("Child's variable " + variable);	      // 5
		
		// this.variable will access the member variable
		System.out.println("Child's variable " + this.variable);  // 20
		
		// super.variable will access the parent's member variable		
		System.out.println("Parent's variable " + super.variable);// 10
		
		/* 'Parent.' is used to access static members. */
		//System.out.println("Cannot access a member variable with"
		//		+ " the class name: " + Parent.variable);
	}
}

public class HidingMethodsAndVariables {
	public static void main(String[] args) {
		Parent p = new Child();
		Parent.staticMethod();	// how a static method should be called
		Child.staticMethod();   // how a static method should be called
				
		p.staticMethod();       // p. will be replaced by Parent.
		
		/*
		 * Which variable gets called depends on the reference type.
		 */
		System.out.println("p.variable : "  + p.variable); 
							// Parent's variable: 10

		Child c = new Child();
		c.anyMethod(5);
	}
}
/** OUTPUT
Static method in Parent
Static method in Child
Static method in Parent
10
Static method in Child
Child's variable 5
Child's variable 20
Parent's variable 10
*/