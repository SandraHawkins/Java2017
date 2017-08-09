/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/MethodNameSameAsConstructor.java
 */ 

package chapter1JavaBuildingBlocks;

public class MethodNameSameAsConstructor {

	public static void main(String[] args) {
		
		new Hello();  // Hello() not called
		System.out.println("In main");
		
		Hello h = new Hello();
		h.Hello(); // now the Hello() method will be called. 
	}
}

class Hello {
	/*
	 * This method is NOT A CONSTRUCTOR! And will not be called with
	 * this code: new Hello();
	 * 
	 * It can be called with this code:   new Hello().Hello();
	 * 
	 * A constructor cannot have a return type, if it does, it is 
	 * an ordinal method and must be explicitly called in code.
	 */
	 public void Hello() {
		 System.out.println("Hello!!!!");
	 }
}

/** OUTPUT: 
 * In main
 * Hello!!!!
 */