/** 
 * Author: Sandra Hawkins
 * Date:   8 Jun 2017
 * Exceptions//RecursiveMethodCallProblem.java
 */

public class RecursiveMethodCallProblem {

	public static void main(String[] args) {
		
		new RecursiveMethodCallProblem().aMethod();
	}
	
	/* When a method calls itself, it is known as a recursive method call. 
	 * The stack trace keeps track of what method called what method. 
	 * When the stack becomes full from a recursive method call, it will 
	 * throw an error: StackOverflowError causing the application to stop
	 * and print the stack trace. */
	public void aMethod() {
		aMethod();
	}

}
/**
Exception in thread "main" java.lang.StackOverflowError
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
	at RecursiveMethodCallProblem.aMethod(RecursiveMethodCallProblem.java:15)
*/
