/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/PrimitiveBoxingOverloading.java
 */ 

package chapter4MethodsAndEncapsulation;

/*
 * When you pass a primitive into an overloaded method and there 
 * isn't an exact match, e.g. go(b); no matching method that takes
 * a byte, so JVM will choose the method with the smallest argument
 * that is wider that the byte.
 * 
 * The JVM will choose widening over Boxing. So I pass in an int
 * and there isn't a method that takes an int, the JVM will look 
 * for a method that takes a long/ float/ double. 
 * 
 * 1. Widening, e.g. convert a byte into a long
 * 2. Boxing,   e.g. convert an int into an Integer, if there isn't 
 *              a method that takes a primitive larger or the same as
 *              an int, it will box the int.
 * 3. Var args  e.g. the last option.
 */
public class PrimitiveBoxingOverloading {
	
	static void go(Integer x) { System.out.println("Integer"); }
	static void go(long x) { System.out.println("long"); }
	static void go(double x) { System.out.println("double"); }
	static void go(Byte b, Byte b1) { System.out.println("2 Byte wrapper"); }
	/* var args can take 0, 1 or an array*/
	static void go(byte... x) { System.out.println("var args"); }

	public static void main(String[] args) {
		byte b = 5;			go(b);  //  long  
		short s = 5;		go(s); 	//  long
		int i = 5;			go(i);	//  long
		long l = 5;			go(l);  //  long
		float f = 5.0f;		go(f);  //  double

		go(b, b);  // 2 byte wrapper/ converts bytes to Bytes by wrapping them
	}
}