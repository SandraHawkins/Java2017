/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//DividingByZero.java
 */

/**
 * Dividing by zero causes an ArithmeticException. It is an unchecked
 * exception (it extends directly from RuntimeException) and therefore
 * you don't need try / catch code surrounding your divide by zero code. 
 */
public class DividingByZero {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
}

/** OUTPUT 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at DividingByZero.main(DividingByZero.java:13)
10 / 0
*/