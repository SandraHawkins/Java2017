/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/OrderOfInitBlocksWithParent.java
 */ 

/*
 * When the following code executes:     new Child();
 * 
 * The constructor of Child() will be called but before its code
 * executes, but the first line of the constructor is a call to
 * super() and therefore execute will now go to the parent's 
 * constructor, it's code will not execute until:
 * 
 * 		1) Any member variable in the parent will be set up memory
 * 		2) Initialisation blocks in the parent will execute in the 
 * 		   order they appear in the class. 
 *      3) The parent's constructor's body will execute. 
 *      
 *      Now control will return to the child class:
 * 
 * 		4) Any member variable in the child will be set up memory
 * 		5) Initialisation blocks in the child will execute in the 
 *         order they appear in the class. 
 *      6) The child constructor's body will execute.  
 */ 
package chapter1JavaBuildingBlocks;

public class OrderOfInitBlocksWithParent {

	public static void main(String[] args) {
		new Child();	
		
		new Parent();	
		
		/* Create another new Child object, when it creating is
		 * finished, then call the childMethod(). */
		new Child().childMethod();
	}
}
/* OUTPUT
 * 
 * (new Child() : ) 
 * Member: Parent 
 * In Parent's Init
 * In Parent Constructor
 * Member: Child
 * In Child's Init
 * In Child Constructor
 * 
 * (new Parent(): )
 * Member: Parent
 * In Parent's Init
 * In Parent Constructor
 *
 * 
 * (new Child().childMethod();  :) 
 * Member: Parent
 * In Parent's Init
 * In Parent Constructor
 * Member: Child
 * In Child's Init
 * In Child Constructor
 * In child's method
 * 
 */
class Parent {
	Member m = new Member("Parent");					// 4
	
	Parent() {			// 3
		//super();
		System.out.println("In Parent Constructor");	// 6
	}
	
	{
		System.out.println("In Parent's Init");			// 5
	}
}

class Child extends Parent {
	Member m = new Member("Child");					// 7
	
	Child() {			// 1
		// super();		// 2
		System.out.println("In Child Constructor"); // 9
	}
	
	{
		System.out.println("In Child's Init");		// 8
	}
	
	void childMethod() {
		System.out.println("In child's method");
	}
}

class Member {
	Member(String name) {
		System.out.println("Member: " + name);
	}
}