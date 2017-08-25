/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/MethodOverloading.java
 */ 

package chapter4MethodsAndEncapsulation;

public class MethodOverloading {

	/* - Access modifier: (public, protected, default, private). Optional
	 *   but it will be default if the access modifier is removed.
	 * - return type: must be directly before the method's name.
	 *   void, boolean, int, double, byte, float, char, short, 
	 *   String, Object or any other object type. [] for an array.
	 * - if you have a return type, you MUST return a value of that
	 *   type or one that fits in that type or it won't compile.
	 * - if the return type is void (no return type), you can have
	 *   a return statement, e.g. return;
	 * - Parameter list: can be empty or as many as you want. Must 
	 *   declare a type with each name, e.g. this won't work: 
	 *   			void regularMethod(int a, b, c)
	 * - {} are needed. 
	 * - The following modifiers can be applied to a method: 
	 *   static: belongs to the class
	 *   final: cannot be changed: overridden in a subclass.
	 *   abstract: cannot have a body, must be overridden in a subclass.
	 *   (final and abstract cannot go together).  
	 *   (native and abstract cannot go together).
	 *   (final and synchronized cannot go together).
	 *   synchronized: can be accessed by only one thread at a time.
	 *   native: the method is written in platform dependent language, e.g. C
	 *   strictfp: floating point numbers adhere to IEE754 standard. 
	 *   
	 * - modifiers can appear in any order:
	 *   static final public     ==    public final static
	 **/
	 static final public void regularMethod(int a, double b, String c) {
		 return; 
	 }
	 
	 /* 
	  * Method Overloading: 
	  * - the methods MUST have same name.
	  * - MUST have a different parameter list.
	  * - the return type can be different.
	  * - the access modifier can be different.
	  */
	 void print(int a, double b) {}
	 
	 protected void print(double b, int a) {}
	 
	 void print(String s, int a, double b) {}
	 
	 String print(String s, double b, float f) { 
		 return "";
	 }
	  
	 /* The following won't compile as the paramter is not different
	  * from the first method above. */
	// public double print(int a, double b) { return 1; }
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.print(1, 2.0);   // calls the 1st print
		mo.print(2.0, 1);   // calls the 2nd print
		//mo.print(2d, 2d);   // won't compile, no method for 2 doubles
		//mo.print(2, 2);     // won't compile, 2 methods that suit
	}
}
