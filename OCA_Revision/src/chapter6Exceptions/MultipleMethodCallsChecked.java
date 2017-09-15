/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/MultipleMethodCallsChecked.java
 */ 

package chapter6Exceptions;

/* 
 * When you call a method that might throw a checked exception, you 
 * must put a try catch around the calling code OR the enclosing 
 * method must declare it. 
 * 
 * Advice: keep throwing the exception up the call stack and handle 
 * it (try/ catch) at the top. The best thing would be to handle the
 * exception main but it can be handled anywhere throughout the 
 */
public class MultipleMethodCallsChecked {

	public static void main(String[] args) { //throws InterruptedException	
		a();
//		try {
//			a();
//			System.out.println("Won't print");
//		} catch (InterruptedException e) {
//			System.out.println("Something went wrong");
//			e.printStackTrace();
//		}
//		System.out.println("Program carries on");
	}
	
	static void a() { //throws InterruptedException
		b();
	}

	static void b() { //throws InterruptedException
		try {
			c();
		} catch (InterruptedException e) {
			System.out.println("Exception caught in b()");
			
		}
	}
	
	static void c() throws InterruptedException {
		throw new InterruptedException();
	}
}
