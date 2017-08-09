/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/OrderOfInitBlocks.java
 */ 

/*
 * When the following code executes:     new Init();
 * 
 * The constructor of Init() will be called but before its code
 * executes:
 * 
 * 		1) Any member variable will be set up memory
 * 		2) Initialisation blocks will execute in the order they
 *         appear in the class. 
 *      3) The constructor's body will execute. 
 *      
 * If there is more code: 				new Init();
 * The same steps will happen again, i.e. 1), 2), 3).
 * 
 * 
 * OUTPUT:
 * 
 * In A
 * Init block 1
 * Init block 2
 * In the Constructor: One
 * In A
 * Init block 1
 * Init block 2
 * In the Constructor: Two
 */
package chapter1JavaBuildingBlocks;

class OrderOfInitBlocks {
	public static void main(String[] args) {
		
		new Init("One");
		new Init("Two");
	}
}

class Init {
	
	A a = new A();		// 1
	String message;		// 1
	
	{					// 2
		System.out.println("Init block 1");
	}
	
	public Init(String message) {
		this.message = message;									// 4
		System.out.println("In the Constructor: " + message);	// 4
	}
	
	{					// 3
		System.out.println("Init block 2");
	}
}

class A {
	A() {
		System.out.println("In A");
	}
}