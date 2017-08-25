/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/Statics.java
 */ 

package chapter4MethodsAndEncapsulation;


public class Statics {

	/* Global variables are always given default values. */
	int memberVariable = 10;
	static int classVariable = 22;
	
	/* Instance/ non-static methods or constructors can access BOTH static and 
	 * non-static variables */
	public Statics() {
		// super();
		System.out.println("memberVariable: "+memberVariable);
		System.out.println("classVariable: "+classVariable);
	}
	
	/* static initialisation block - its purpose is to initialse
	 * static variables which may take more than one line, e.g. to
	 * populate an ArrayList */
	static {
		classVariable = 22;
		//memberVariable = 50;
	}
	
	/* initialisation block. Give member variables their defaults.
	 * Can access static variable as they will have already been
	 * set up in memory.
	 **/
	{
		memberVariable = 4; //instance variable
		classVariable = 14;
		
		regularMethod();
	}
	
	public void regularMethod() {
		System.out.println("Regular method");
	}
	
	/* Can only access static members because the objects might not
	 * yet exist */
	public static void aStaticMethod() {
		//memberVariable = 4;
		classVariable = 14;
		
		/* You CANNOT type 'this' into a static method.
		 * The static method can be called before any objects
		 * exist and 'this' refers to the current object. */
		//this.memberVariable = 22;
	}
	
	/* This method can only be called on an instance of this class
	 * 
	 * 		Statics s = new Statics();
	 * 		S.o.pln(s.toString());
	 * 
	 * and therefore can access member variables (member varaibles) and statics because
	 * the static variables are shared among all objects. */
	public String toString() {
		
		return Integer.toString(memberVariable + classVariable);
	}
	
	
	public static void main(String[] args) {
		new Statics();
		
		System.out.println(classVariable);
		aStaticMethod();
		
		/* From main, because main is static, you can only directly
		 * access static members, if you want to access non-static
		 * members (i.e. object code), you must have an instance
		 * of the class first. */
		//toString();
		Statics s = new Statics();
		System.out.println(s.toString());
		
		/* parseInt() is a static method and no object is needed to 
		 * call it. */
		int num = Integer.parseInt("123");
	}
}
