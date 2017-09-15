/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/MultipleMethodCallsUnchecked.java
 */ 

package chapter6Exceptions;

public class MultipleMethodCallsUnchecked {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		b();
	}

	static void b() {
		c();
	}

	static void c() {
		d();
	}

	static void d() {
		System.out.println(10 / 0); // Unchecked - ArithmeticException
	}
}
/** OUTPUT
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at chapter6Exceptions.MultipleMethodCallsUnchecked.d(MultipleMethodCallsUnchecked.java:28)
	at chapter6Exceptions.MultipleMethodCallsUnchecked.c(MultipleMethodCallsUnchecked.java:24)
	at chapter6Exceptions.MultipleMethodCallsUnchecked.b(MultipleMethodCallsUnchecked.java:20)
	at chapter6Exceptions.MultipleMethodCallsUnchecked.a(MultipleMethodCallsUnchecked.java:16)
	at chapter6Exceptions.MultipleMethodCallsUnchecked.main(MultipleMethodCallsUnchecked.java:12)
*/
