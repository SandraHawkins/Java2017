/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/ExamQuestion1.java
 */ 

package chapter6Exceptions;

public class ExamQuestion1 {
	public static void main(String[] args) {
		try {
			try {
				a();
			} catch(InterruptedException e) {
				System.out.println("Exception caught"); 
				e.printStackTrace();
				throw e; //throw new InterruptedException();
			}
		} catch (InterruptedException e) { 
			System.out.println("Exception caught the second time");
		}
		System.out.println("End of main");
	}
	public static void a() throws InterruptedException { b(); }
	public static void b() throws InterruptedException { c(); }
	public static void c() throws InterruptedException {
		throw new InterruptedException();
	}
	public static void d() {
		throw new ArithmeticException();
	}
}
/** OUTPUT
Exception caught
java.lang.InterruptedException
	at chapter6Exceptions.ExamQuestion1.c(ExamQuestion1.java:27)
	at chapter6Exceptions.ExamQuestion1.b(ExamQuestion1.java:25)
	at chapter6Exceptions.ExamQuestion1.a(ExamQuestion1.java:24)
	at chapter6Exceptions.ExamQuestion1.main(ExamQuestion1.java:13)
Exception caught the second time
End of main
*/