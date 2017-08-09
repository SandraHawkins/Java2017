/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/VariableShadowing.java
 */ 

package chapter1JavaBuildingBlocks;

public class VariableShadowing {

	public static void main(String[] args) {
		
		Dog d = new Dog("Patch");
		/*
		 * d --> (name = null)
		 */
		System.out.println(d.name); // null
	}
}

class Dog {
	/* A member variable called 'name' */ 
	String name;
	
	/* A local variable called name which gets it value from the
	 * argument passed into the constructor. */
	Dog(String name) { 	// name = "Patch"
		System.out.println(name);   		// Patch
		name = "Ted";	// name = "Ted"  	// local var changed to Ted
		System.out.println(name);      		// Ted
		System.out.println(this.name); 		// null
	}
	
	/*
	 * Inside the constructor when I mention 'name', it refers to
	 * the local 'name' variable. 
	 * To refer to the member variable, I must use: 
	 * 		this.name
	 */
}