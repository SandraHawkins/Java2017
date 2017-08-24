/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/PassingAString.java
 */ 

package chapter4MethodsAndEncapsulation;

public class PassingAString {
/*
 * When a String is passed into a method. Strings are immutable, and
 * the original will never change. A new string will be created in the
 * method.
 */
	public static void main(String[] args) {
		
		String name = "Ted";
		
		PassingAString p = new PassingAString();
		p.modify(name);
		System.out.println("After modify() " + name); // Ted
	}
	
	void modify(String name) {
		name = name + "ie";
		System.out.println("In modify() " + name); // Tedie
	}
}
