/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/RethrowingTheCaughtException.java
 */ 

package chapter6Exceptions;

import java.io.IOException;

public class RethrowingTheCaughtException {

	public static void main(String[] args) {
		try {
			a();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void a() throws IOException {
		try {
			b();
		} catch (IOException e) {
			System.out.println("IOException thrown from b() is caught");
			/*
			 * In the exam, you might see code like this, an exception
			 * is caught and rethrown. As it's a checked exception,
			 * you must try/catch it or declare it. So, the code
			 * 'throws IOException' is needed in the method declaration
			 * for this to compile.
			 */
			throw e;
		}
	}
	
	static void b() throws IOException {
		throw new IOException();
	}

}
