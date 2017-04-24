public class MethodsWithNoReturnType {

	public static void main(String [] args) {
		/*
		 * This creates an instance of this class, this instance/
		 * variable m must be used to call any methods in this class.
		 */
		MethodsWithNoReturnType m = new MethodsWithNoReturnType();
		m.printHello();
		String myMessage = "It's hump day";
		m.printMessage(myMessage);
		m.printHello();
		m.printMessage("Hi");
		m.addTwoNumbers(2, 1);
	}
	
	/*
	 * public     - this method can be called from outside of this
	 *              class and package (folder).
	 * void       - nothing is returned.
	 * printHello - is the name of the method.  
	 * ()         - any parameters that the method receives, empty
	 *              brackets means this method received no parameters. 
	 */
	public void printHello() {
		System.out.println("Hello");
	}
	
	/*
	 * public           - this method can be called from outside of this
	 *                    class and package (folder).
	 * void             - nothing is returned.
	 * printMessage     - is the name of the method.  
	 * (String message) - when this method is called, you must pass in a 
	 *                    String. 
	 */
	public void printMessage(String message) {
		System.out.println("Your message: " + message);
	}
	
	/*
	 * public        - this method can be called from outside of this
	 *                 class and package (folder).
	 * void          - nothing is returned.
	 * addTwoNumbers - is the name of the method.  
	 * (int a, double b) - this is the parameter list that this method 
	 *                     accepts. It must receive an int followed
	 *                     by a double. 
	 */
	public void addTwoNumbers(int a, double b) {
		double result; 		// declares a double variable called result
		result = a + b; 	// Adds a and b and stores the answer in result
		System.out.printf("The total of %d and %f is %f", 
						   a, b, result);
	}
}
/***** OUTPUT
Hello
Your message: It's hump day
Hello
Your message: Hi
The total of 2 and 1.000000 is 3.000000
*/