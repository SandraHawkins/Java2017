/** 
 * Author: Sandra Hawkins
 * Date:   11 May 2017
 * Methods//MethodThatReturnsADouble.java
 */

public class MethodThatReturnsADouble {
	public static void main(String[] args) {
		
		MethodThatReturnsADouble m = new MethodThatReturnsADouble();
		
		int num1 = 10;
		double num2 = 12.2;
		// It's okay to call a method from within the call to the
		// println method, as long as a value is return, i.e. you
		// cannot call a void method when calling println.
		System.out.println("Numbers added : " + 
						   m.addTwoNumbers(num1, num2));// 22.2
		
		double result = m.addTwoNumbers(20, 13.3);
		System.out.println("The result is " + result);
	}
	/*
	 * A void method cannot return anything, i.e. it cannot include
	 * a return statement.
	 * A method that is not void (byte, short, int, long, double, 
	 * float, char, boolean or String) must include a return 
	 * statement or it will not compile.
	 */
	//                              10       12.2 
	public double addTwoNumbers(int a, double b) {
		double result = a + b;  // 22.2
		return result;
		// The return statement must be the last line because
		// the code that follows is unreachable.
		//System.out.println("end of method");
	}
}
/** OUTPUT
Numbers added : 22.2
The result is 33.3
*/