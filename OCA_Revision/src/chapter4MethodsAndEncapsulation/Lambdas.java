/** 
 * Author: Sandra Hawkins
 * Date:   25 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/Lambdas.java
 */ 

/*
 * When you are calling a method that takes an interface type, you 
 * need a class that implements that interface and implements the
 * method(s) from that interface. If that interface only has one method,
 * you can use lambdas to implement that one method and pass it into 
 * the method you are calling.  
 * 
 * A lambda expression looks like this: 
 * 
 * 			( Parameter list ) -> { method body }
 * 
 * With lambdas, there is no need to create a class that implements
 * the interface, you can just implement the body of the method and
 * list the parameters it accepts (if any).
 * 
 * A Lambda expression is:
 * - A block of code that gets passed around (i.e. into a method).
 * - A method with a body and maybe parameters (although the method
 *   has no name, no declared return type and no visibility modifier).
 * - A method that's passed around as if it were a variable. 
 * 
 */
package chapter4MethodsAndEncapsulation;

public class Lambdas {

	public static void main(String[] args) {
		
		/* Without Lambdas, I need a class that implements the
		 * PrintOneString interface and I need an instance of that
		 * class passed into the sendOneString method */
		MyPrintOneString myP = new MyPrintOneString();
		sendOneString(myP);
		
		/* Old way - using anonymous inner classes.
		 * I could use an anonymous inner class. When you see 'new'
		 * followed by an interface, it is an anonymous inner class.
		 * Which is an instance of a class that implements that 
		 * interface without a class name but does have a body that
		 * overrides the method */
		sendOneString(new PrintOneString() {
			public void print(String text) {
				System.out.println(text);
			}
		});
		
		
		/*** Implementing the method in 1. no params, no return ***/
		/*
		 * () are optional for the parameter list. You must have them
		 *    with more than one parameter or no parameters.
		 * () are needed if you have one parameter and include the 
		 *    data type. 
		 * {} are optional for one statement. You must have them for 
		 *    more than one statement or no statements.
		 *    When you omit the {} for the body, you cannot have a ;
		 *    at the end of the one statement.  
		 *    
		 * Signature of the method in the interface being implemented: 
		 * 
		 * 			public void print();
		 */
		sendNoParams( () -> { } );
		sendNoParams( () -> System.out.println("Hello") );  // no ;
		sendNoParams( () -> { 
								String date = "25/08/2017";
								System.out.println(date);
								return; // optional return
							} );
		
		
		/*** Implementing the method in 2. one param, no return ***/
		/* Signature of the method in the interface being implemented:
		 * 
		 * 			public void print(String text);   
		 * 
		 * One parameter: Data type is optional and () are optional.
		 * {} are optional when there is only one statement, you 
		 * cannot have a ; and the method must be void, no return type.
		 */
		sendOneString( t -> { } );
		sendOneString( (t) -> { } );
		sendOneString( text -> System.out.println(text) ); // NB: no ;
		sendOneString( (String text) -> { System.out.println(text);
										  return; 
										});
		
		sendOneString( (String text) ->  { 
			// 'text' is a parameter and a local variable into this
			// method. 'text' cannot be redeclared
											//String text = "NO!"; 
										    text = "something else";
										 }   );
		
		sendOneString( (String text) -> {
										int num = 10;
										System.out.println(text + num);
										});
		sendOneString( t -> {
								String text = 
								(t.length() > 10) ? "long" : "short";
								System.out.println(t + " " + text);
								return; // optional
		                    });
		
		/*** Implementing the method in 3. two params, int return ***/
		/* Method signature: 
		 * 		public int print(String one, String two);
		 *
		 * If you insert one type for one parameter, you must insert
		 * both types. 
		 * If you insert 'return', you must include {} and ;
		 * If you have {}, you must have a return keyword and a ;
		 */
		sendTwoString( ( a, b ) -> 10 ); // return is optional/ implicit
		sendTwoString( (String a, String b ) -> 10 );
		sendTwoString( (String a, String b ) -> { return 10; } );
		sendTwoString( (String a, String b ) -> a.length() + b.length() );
		sendTwoString( (String a, String b ) -> {
				if (a.length() > 10) {
					return a.length();
				} else {
					return b.length();
				}
			});
		sendTwoString( (String a, String b ) -> { 
				System.out.println("Inside method");
				return 10; 
			} );
		sendTwoString( (a, b) -> {
				System.out.println("Inside method");
				// return not needed as it will return with an exception
				throw new ArrayIndexOutOfBoundsException();
			} );
	}
	
	/** Methods that take an interface, to call these methods,
	 * you must pass in a class that implements the interface 
	 * and implements the method OR pass in a lambda expression **/
	static void sendNoParams(Printable p) { }
	
	static void sendOneString(PrintOneString p) {
		p.print("Hello");
	}
	
	static void sendTwoString(PrintTwoStrings p) {
		p.print("", "");
	}
	
	void test(String s, int a, double b) {
		// String s = "text";   // Cannot redeclare 's'
		// int a = 10;			// Cannot redeclare 'a' 
		double d = 12.4;
	}
}

interface Printable {
	/*** 1. Method being implemented by the Lambda expression ***/
	public void print();
}

interface PrintOneString {
	/*** 2. Method being implemented by the Lambda expression ***/
	public void print(String text);  
}

interface PrintTwoStrings {
	/*** 3. Method being implemented by the Lambda expression ***/
	public int print(String one, String two);
}

class MyPrintOneString implements PrintOneString {
	public void print(String text) {
		System.out.println(text);
	}
}