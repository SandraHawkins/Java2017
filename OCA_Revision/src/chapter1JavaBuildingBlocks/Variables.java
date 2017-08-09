/** 
 * Author: Sandra Hawkins
 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/Variable.java
 */ 

package chapter1JavaBuildingBlocks;

public class Variables {
	
	/* Size of primitives from smallest to largest:
	 * 
	 * byte  =   -128 to 127
	 * short =   -32768 to 32767 
	 * int		
	 * long
	 * float
	 * double
	 * 
	 * char  = 'a' 's' 'G'
	 * boolean = true or false
	 */

	public static void main(String[] args) {
		
		/* Variable names cannot start with a number.
		 * Can have _ 
		 * Can have currency Symbols: $ £ €  
		 * No spaces in a variable name
		 * You cannot use any keywords as a variable name (the purple
		 * words, e.g. public, static, void, int, if, else, ....) */
		int length = 1_234_56;
		//int 2Wrong = 12; // won't compile
		
		/* In a literal, underscores can go in between number but
		 * not at the beginning or the end or next to a decimal point. */
		double price = 12.23_000d; // d is optional
		
		// Binary : 0, 1
		/*              16 8 4 2 1 
		 * int num1 = 0b0__1_0_1_1;   = 11 
		 * int num2 = 0b1__0_1_1_0;   = 22
		 * */
		int binary = 0b1001;
		System.out.println("binary 100 is : " + binary); // 9
		
		// Octal : 0 to 7
		//        512 64 8 1 
		int oct = 0123;
		System.out.println("oct : " + oct); // 83
		
		// Hexadecimal : 0 - 9, a - f
		//       4096 256 16 1
		int hex = 0x1f; 
		//int hex4 = 0x012g; // won't compile, 'g' not allowed
		System.out.println("hex : " + hex);  // 31
		
		long hex2 = 0xDeadCafeL;
		
		/* A literal without decimal places is seen as an int. 
		 * A literal with decimal places is seen as a double. */
		long aLongNumber = 123456789123456L;
		
		/* A double is twice the size of a float, when the compiler
		 * sees 12.5, it is seen as a double and therefore will not
		 * fit into a float, so 'f' is needed at the end of the 
		 * literal. */
		float floatNum = 1234.56789f;
		
		char letter = 'a';
		char a = 97;    // 97 = a, 98 = b, 99 is c 
		System.out.println(a);  // a
		
		char c = '\u0063';
		System.out.println(c);   // c
		
		
		byte b1 = 127;
		//byte b2 = 128;  // won't compile as out of range
		// -128, -127, -126, -125, ...... 0, 1, 2, ..... 126, 127
		byte b3 = (byte)130;
		System.out.println(b3);  // -126
		
		/* Any bytes, shorts, ints added/ divided/ multiplied/ 
		 * subtracted: the result will be an int */
		byte bb1 = 10;
		byte bb2 = 3;
		bb1 = 12;
		/* The values in bb1 and bb2 is not computed until runtime and
		 * therefore the compiler doesn't know that it's within range
		 * and a cast is needed. */
		byte result = (byte) (bb1 + bb2);
		System.out.println(result);  // 13
		
		byte bb3 = 10 + 3;  // no cast needed here, the compiler can 
		// work out the result.
		
		int answer = 12 / 5;
		System.out.println(answer);  // 2
		
		/* Declaring multiple variables: */
		int b, d, e;
		
		/* You cannot declare two variables of a differnt type 
		   on the same line */
		//int f, byte k;
		
		/* All local variables must be assigned a value before
		 * they can be accessed (used or printed) */
		double d1, d2, d3 = 55.5;
		//System.out.println("d2 " + d2); 
		// won't compile, as d2 is not initialised
		System.out.println(d3);  // 55.5  
		
		int k, m, n;
		k = m = n = 22;  // all variables will be 22.
		System.out.println(m);  // 22
	}
}