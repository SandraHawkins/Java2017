public class Ex2VarsAndOperators {
	/* 
		= is the assignment operator. It is read from right to left.
		It assigns a value to a variable. 
		When the compiler sees 25, it sees an int.
		When the compiler sees 3.6, it sees a double.
		
		** You cannot use keywords as identifiers. **
		A keyword has special meaning, e.g. public, static, void,
		class, int, short, byte, long, etc.
		An identifier is the name of a variable, a method or a class.
	*/
	public static void main(String [] args) {
	
		short num1 = 25;
		float num2 = 3.6f; // must have f as the compiler see 3.6 as a double
		double num3 = 12.99d; // d is optional 
		int num4 = 42;
		
		/* You can declare more than one variable of the SAME type
		   on the same line but it is not recommended for readability
		   purposes. */
		// int sum, product; 
		double sum = num1 + num2 + num3 + num4;
		// Declares an int called product in memory.
		double product;
		// Initialises/ gives product a value
		product = num1 * num2 * num3 * num4;
		/* Before I access product, it must have been intitialised.
		   Variables declare inside a method must be initialised
		   before being accessed, e.g. printed. */
		System.out.println("The sum is " + sum + "\nThe Product is " + 
						    product);
							
		System.out.printf("The sum is %.2f and the product is %.2f", 
		                  sum, product);
	}
}
/** OUTPUT
The sum is 83.59000038146974
The Product is 49102.2
The sum is 83.59 and the product is 49102.20
*/