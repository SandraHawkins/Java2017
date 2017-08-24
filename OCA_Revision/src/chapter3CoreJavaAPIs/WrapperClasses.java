/** 
 * Author: Sandra Hawkins
 * Date:   17 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/WrapperClasses.java
 */ 

package chapter3CoreJavaAPIs;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
/* 
 * There are eight wrapper classes: Boolean, Byte, Short, Integer,
 * Long, Float, Double and Character. 
 * 
 * Their purpose:
 * 
 * 1. To automatically convert primitives into objects. E.g. when
 *    you add a primitive into a List. Or you when you get() an object
 *    from a list and use it in an addition.
 *     
 * 2. Use their methods to convert Strings from a GUI into numbers.
 * 
 * 3. Use their methods to convert numbers from your code into
 *    Strings to display on the GUI. 
 *    
 * 4. To convert between different wrapper types. E.g. from a
 *    Double to a Integer.
 */
public class WrapperClasses {

	public static void main(String[] args) {

		/*
		 * 1.  Anywhere an object is expected and you pass in a 
		 * primitive, it will automatically be converted into a wrapper 
		 * object. This process is known as boxing. E.g. when you add 
		 * a primitive int into an ArrayList that holds Integers, the 
		 * primitive will be converted/ boxed into a Integer wrapper. 
		 */
		ArrayList<Integer> listOfInts = new ArrayList<>();
		listOfInts.add(10);					// new Integer(10)
		/* The add method will returns its success, it will always
		 * be true for ArrayList. If you added the same element twice 
		 * to a TreeSet (doesn't allow duplicated), false would be 
		 * returned when the second add().
		 * */
		System.out.println(listOfInts.add(12));	// true
		listOfInts.add(new Integer(22));
		listOfInts.add(new Integer("100"));
		//listOfInts.add('c');  // 
		/* Previous line won't compile, as 'c' turns into a Character 
		 * object and an Integer object is expected. */
		Integer c = new Integer('c');
		listOfInts.add(c);	// ok, adds an Integer wrapper

		/* Anywhere a primitive is expected and you get a wrapper, it
		 * will automatically unbox it. 
		 * listOfInts.get(0) will return an Integer, a primitive is 
		 * expected for the addition, so 10 (the first element in 
		 * the list) will be unboxed.*/
		int result = 34 + listOfInts.get(0);
		System.out.println("Result is : " + result);  // 44

		/* To create wrapper objects use:
		 * 
		 * 	- Use the constructor. The constructors take the primitive
		 * 	  or a String, the Character constructor only takes a char.
		 * 	- Use the static valueOf() methods. They take a primitive,
		 * 	  a String or the Integer types take a String and the radix 
		 *    (2, 8, 16).
		 */
		Float f1 = new Float(12.23f);		// float constructor
		Float f2 = new Float(12.23);		// double constructor
		Float f3 = new Float("12.23");		// String constructor
		
		Character letter = new Character('c');
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf("12");
		//                            8421
		Integer i3 = Integer.valueOf("1101", 2);  // binary = 13
		Integer i4 = Integer.valueOf("7650", 8);  // octal
		Integer i5 = Integer.valueOf("ca89", 16); // hexadecimal
		Double price1 = Double.valueOf(12.5);
		Double price2 = Double.valueOf("12.99");

		/* If the String passed to the valueOf method or the constructor
		 * cannot be parsed into a number, the method will throw
		 * a NumberFormatException
		 **/

		/* 2. Converting Strings from a GUI into numbers to use in 
		 *    your code. 
		 * 
		 *   To convert a String into a primitive use the static 
		 *   methods Double.parseDouble(), Integer.parseInt(), etc. 
		 *   These parseXxx() methods are only in the Number classes.
		 **/
		String strNumber = JOptionPane.showInputDialog("Enter a number");
		int answer = 200 + Integer.parseInt(strNumber);
		System.out.println(answer);

		/*
		 * 3. Use their methods to convert numbers from your code into
		 *    Strings to display on the GUI. 
		 *    
		 * Each wrapper class has a static toString() method to convert
		 * from the primitive into a String. 
		 */
		double total = 12.99 + 2.49;
		JTextField txtTotal = new JTextField();
		txtTotal.setText(Double.toString(total));

		/*
		 * 4. To convert between different wrapper types. E.g. from a
		 *    Double to a Integer.
		 *    
		 * The number wrapper classes (Integer, Float, Double, Byte, 
		 * Short and Long) all have xxxValue() methods, e.g. intValue(),
		 * floatValue(), doubleValue(), byteValue(), etc. These methods
		 * are for casting/ converting from one wrapper type to another. 
		 * You can only convert between number types. Works the same
		 * as casting, i.e. if the value won't fit it will be wrapped
		 * around or in the case of converting from a Double to an
		 * Integer, the places after the decimal will be chopped.
		 * 
		 * *** These methods are instance methods, i.e. not static ***
		 */
		Double dblPrice = new Double(12.99);
		             // = 12.99;
				     // = new Double("12.99");
		Integer newPrice = dblPrice.intValue();
		System.out.println(newPrice);	// 12
		
		Integer intValue = 129;     // -128 . . . 0 . . . 127 
		Byte byteValue = intValue.byteValue();
		System.out.println(byteValue);  // -127
		
		/* When creating a Boolean wrapper you can use the constructors
		 * or the static valueOf() method, both can take a primitive
		 * or a String, the String will only equate to true, when it
		 * has the characters "tRuE" in any case, otherwise it 
		 * will be false. */
		Boolean b2 = true;						// true
		Boolean bb2 = true;						// b2 == bb2 true
		Boolean b3 = new Boolean(true);			// true
		Boolean b4 = new Boolean("false");		// false
		Boolean b5 = Boolean.valueOf("tRUe");	// true
		Boolean b6 = new Boolean("hello");  	// false
		Boolean b7 = Boolean.valueOf("hi");   	// false
		Boolean b8 = Boolean.valueOf(""); 		// false
		Boolean b9 = Boolean.valueOf(null);		// false
		
		/* Comparing wrappers with primitives */
		byte b1 = 10;
		short s1 = 10;
		char c1 = 'a';
		boolean boo1 = true;
		
		/* The byte will be promoted to a short and the comparison 
		 * will happen */ 
		if (b1 == s1) { 
			System.out.println("Primitives same value");
		}
		
		/*
		 * When you compare a wrapper to a primitive, the wrapper is 
		 * unwrapped/ unboxed/ converted to a primitive and then
		 * the comparison takes place.
		 */
		Short s2Wrapper = 10;
		int int1 = 10;
		if (s2Wrapper == int1) {
			System.out.println("Wrapper and primitive same value");
		}
		
		String name = "Sandra";
		//if (name == s2Wrapper) {}
		/* Won't compile as you cannot compare different objects 
		 * using == */
		
		/*
		 * == can compare the same types, if you attempt to compare
		 * different types, it won't compile. In order to save memory, 
		 * two instances of the following wrapper objects (created 
		 * through boxing (Integer i = 10;) - not using 
		 * new Integer(10)), will always be == when their primitive 
		 * values are the same:
		 * 
		 * - Boolean
		 * - Byte -128 to 127
		 * - Character from \u0000 to \u007f (7f is 127 in decimal)
		 * - Short and Integer from -128 to 127
		 */
		Integer i2Wrapper = 128;
		Integer i3Wrapper = 128;
		if (i2Wrapper == i3Wrapper) {
			System.out.println("Same area of memory");
		}
		
		if (i2Wrapper.equals(i3Wrapper)) {
			System.out.println("The wrapper's values are equal");
		}
	}
}