/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/StaticImports.java
 */ 

/*
 * Static imports allow you access to static member(s) (static fields/ 
 * variable or methods) in a class and then you don't have to prefix 
 * the member with the class name in your code.
 * 
 *  e.g. import static java.lang.Integer.*; this gives direct access
 *  to all static members of the Integer class, and in the code below 
 *  I can access the static members directly without Integer.XXXX
 *  
 * When writing a static import, you must import a single static 
 * member e.g.  import static java.lang.Integer.MIN_VALUE;
 * or all static members e.g. import static java.lang.Integer.*;
 * The following will not compile: import static java.lang.Integer;
 * 
 * static imports are for variables (constants) and methods only.
 */
package chapter4MethodsAndEncapsulation;

import javax.swing.JOptionPane;  // One class
import javax.swing.*; 			 // All classes in the swing package

import static java.lang.Integer.MIN_VALUE; // One variable
import static java.lang.Integer.valueOf;   // One method
import static java.lang.Integer.*;	// All static variables and methods

//Integer is in the lang package
//Integer is the class
import static javax.swing.JOptionPane.showMessageDialog;

public class StaticImports {

	public static void main(String[] args) {
		/* Regular imports allow you to import one or more classes. */
		// import package.package.Class; // 1 class
		// import package.package.*;     // all classes in that package
		// import javax.swing.JOptionPane;
		//JOptionPane.showMessageDialog(null, "Hello");

		// Without static imports
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.valueOf("abc", 16)); //Hexadecimal
		JOptionPane.showMessageDialog(null, "Hello");
		
		// With static imports, you can leave out all class names
		System.out.println(MIN_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println(SIZE);
		System.out.println(parseInt("123"));
		System.out.println(valueOf("abc", 16));
		showMessageDialog(null, "Hello");
		
		// import static javax.swing.JOptionPane.*;
		// import static javax.swing.JOptionPane.showMessageDialog;
	}
}