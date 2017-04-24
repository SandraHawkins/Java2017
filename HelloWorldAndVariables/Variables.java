public class Variables {

	public static void main(String [] args) {
	
		/* The range of a byte is -128 to 127 */
		byte verySmallNumber = -125;
		System.out.println("byte value: " + 
						   verySmallNumber);
			
		/* The range of a short: -32,768 to 32,767 */
		short myAge = 40;
		/* (short) will convert the result of 
		 myAge - 10 into a short variable. */
		myAge = (short)(myAge - 10);
		System.out.println("I am : " + myAge);
	
		// Declares an int variable called number.
		// An int stores a whole number.
		// **** most common for a whole number ****
		int number;
		// Assigns 10 into the variable number.
		number = 10;
		System.out.println("Number is : " + number);
		
		long veryLargeNumber = 12345678912123456L;
		
		// **** double most common for floating point ****
		float price = 12.99f;
		double anotherPrice = 49.99d;
		
		char myInitial = 'S';
		boolean isSummer = false;
		boolean isSpring = true;
	
		/* When the compiler see a whole literal,
		 it sees it as an int.  When it sees a 
		 literal with a decimal place, it sees it
		 as a double, if you want to declare a float 
		 you must insert 'f' or 'F'. */
		
		int doubleMyAge = myAge * 2;
		int firstNumber = 15;
		// An int divided by an int is an int result
		int half = firstNumber / 2;
		System.out.println("Half of 15: " + half);
		
		String message = "The end ";
		System.out.println("Hello\t" + message + myAge);
	}
} 