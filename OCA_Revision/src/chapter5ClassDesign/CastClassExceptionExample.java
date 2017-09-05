/** 
 * Author: Sandra Hawkins
 * Date:   5 Sep 2017
 * OCA_Revision/chapter5ClassDesign/CastClassExceptionExample.java
 */ 

package chapter5ClassDesign;

public class CastClassExceptionExample {
	
	public static void main(String[] args) {
		
		Human h = new Human();		// Parent object
		Trainee t = (Trainee)h;		// Downcast, ok with the compiler
		
		/* On line 14, the Human object is being referred to by a 
		 * Trainee reference which is a child reference referring
		 * to a parent object, this is the wrong way around and
		 * causes a ClassCastException */		
	}
}
