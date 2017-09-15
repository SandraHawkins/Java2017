/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/CommonExceptions.java
 */ 

package chapter6Exceptions;

import java.util.Scanner;

/* 
 * We are looking at common exceptions, they are all unchecked, you 
 * don't need a try-catch around the calling code, it will compile
 * without it. You need to know which are thrown by the JVM and which
 * are thrown by the API (programmatically).
 * 
 * Thrown by the JVM					Programmatically (in the API)
 * - ArrayIndexOutOfBoundsException		- IllegalArgumentException
 * - ClassCastException					- IllegalStateException
 * - NullPointerException				- NumberFormatException
 * - ExceptionInInitializerError		
 * - StackOverflowError
 * - NoClassDefFoundError
 * 
 * The JVM exceptions will print the stack trace when the JVM can't
 * perform your incorrect code. You have written rubbish code and
 * you need to fix it. 
 * 
 * 
 * The programmatically thrown exceptions will contain code: 
 * 
 * 		throw new XxxException(); 
 * 
 * either thrown by you in your method or thrown from the API, e.g.
 * in the scanner's nextInt() method or in the Integer's parseInt()
 * method. A method has been called and the exception is thrown
 * from it. 
 */

/* Trying to access a non existing element in an array.
 * Thrown by the JVM (i.e. there isn't a method in the API being
 * called to access the array, the JVM is trying to access element
 * -1 for you and it doesn't exist.  */
class ArrayIndexOutOfBoundsExample {
	static void method() {
		int [] nums = {1, 2, 3};
		System.out.println(nums[-1]);		
	}
}

/*
 * A ClassCastException occurs when you attempt to cast a reference
 * variable into a type and the object being referred to is not that
 * type. 
 * This exception is thrown by the JVM, the JVM is attempting to 
 * cast a Dog into a Cat, and the problem is that a refers to a Dog
 * object and cannot be cast/ referred to by a Cat.
 */
class Animal {}
class Cat extends Animal { }
class Dog extends Animal { }
class ClassCastExample {
	static void method() {
		Animal a = new Dog();
		Cat c = (Cat)a;
		/* Will it compile? Can you cast from 'a' Animal to a Cat, yes
		 * it's a downcast. At runtime: The Cat reference is referring
		 * to a Dog object: ClassCastException
		 */
	}
}

/* Trying to access any method on a reference variable which is null.
 * Watch out for member variable that get default values, you cannot
 * call a method on it if it's null.
 * Thrown by the JVM.
 * */
class NullPointerExample {
	static String name;  // null
	
	static void printNameLength() {
		System.out.println(name.length());
	}
}

/*
 * When an exception occurs in a STATIC initialisation block, it will 
 * throw an ExceptionInInitializerError and it will follow with the 
 * real cause of the Exception.
 */
class ExceptionInInitializerExample {
	
	static {
		int [] nums = {1, 2, 3};
		System.out.println(nums[-1]);
	}
}

/*
 * A recursive method call, fills up the stack. The stack keeps account
 * of what method called what method.....
 * Thrown by the JVM.
 */
class StackOverflowExample {
	static void method() {
		method();
	}
}

/* When these two classes are compiled, two class files are produced 
 * in the bin directory: NoClassDefFoundErrorEg.class and Chair.class
 * if I delete Chair.class and run main from the command line:
 * 
 * > java chapter6Exception.NoClassDefFoundErrorEg 
 * 
 * The Chair class cannot be found and a NoClassDefFoundError is 
 * produced.
 * 
 * This exception is thrown by the JVM.
 * */
class NoClassDefFoundErrorEg {
	public static void main(String[] args) {
		Chair c = new Chair();
	}
}
class Chair {} 

////******** Thrown by the API/ Programatically    *********////

/* You may use this exception yourself to throw it in your method
 * when the user of your code doesn't pass in the right value. 
 */
class IllegalArgumentExample {
	/* If IllegalArgumentException was checked, this method would have
	 * to declare it, BTW it's unchecked.
	 * 
	 * This method doesn't have to declare the IllegalArgumentException
	 * because it is unchecked. 
	 **/	
	static void method(int age)  throws IllegalArgumentException {
		if (age < 18 || age > 65) {
			throw new IllegalArgumentException(
					age + " is out of range");
		}
	}
}

/* Caused when trying to use a Scanner object to read in from a file/ 
 * String/ console and the scanner object was closed. 
 * Thrown Programmatically by the API from the Scanner's nextInt() method. 
 */
class IllegalStateExample {
	static void method() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an int " );
		int num = s.nextInt();
		System.out.println("You typed " + num);
		s.close(); // NO!!!! will cause an IllegalStateException if 
		// you use the scanner to read in again. 
		System.out.print("Enter another int " );
		num = s.nextInt();
		System.out.println("You typed " + num);
	}
}

/* Thrown from the Integer.parseInt() or Double.parseDouble() for 
 * example, when these methods cannot convert the String argument into
 * an int/ double it will throw a NumberFormatException. 
 * Thrown programmatically in the API from the parseInt() method. */
class NumberFormatExample {
	static void method() {
		int num = Integer.parseInt("two");
	}
}

public class CommonExceptions {
	public static void main(String[] args) {
		NumberFormatExample.method();
		//IllegalStateExample.method();
		//IllegalArgumentExample.method(99);
		//StackOverflowExample.method();
		//new ExceptionInInitializerExample();
		//NullPointerExample.printNameLength();
		//ClassCastExample.method();
		//ArrayIndexOutOfBoundsExample.method();
	}
}
