/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/PassingAString.java
 */ 

package chapter4MethodsAndEncapsulation;

public class PassingAStringBuilder {
/*
 * When you pass a StringBuilder or any object into a method, a copy
 * of the memory address is passed. If the method changes the object,
 * the original will change. 
 */
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("Ted");
		
		new PassingAStringBuilder().modify(name);
		
		System.out.println("After modify() " + name); // Tedie
	}
	
	void modify(StringBuilder name) {
		name.append("ie");
		System.out.println("In modify() " + name); 	// Tedie
	}

}
