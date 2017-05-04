/** 
 * A ternary operator is an alternative to an if else statement. 
 * It takes the form of:
 * 		
 * 		x =	(condition) ? what to assign to x if the condition is true
 *                      : what to assign to x if the condition is false ;
 * 
 * It can be used to assign any value to a variable or if you place
 * a ternary operator into a call to println, it will print the
 * result out.  
 *
 */
public class TernaryOperator {
	
	public static void main(String[] args) {
		
		String passOrFail;
		/* The hasPassed variable would ideally get its value from 
		 * a method.
		 */
		boolean hasPassed = false;
		
		passOrFail = (hasPassed) ? "pass" : "fail";
		
		System.out.println("The result is a " + passOrFail);
	}
}