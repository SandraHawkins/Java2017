/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/White.java
 */ 

package chapter6Exceptions;

class ColorException extends Exception {}
class WhiteException extends ColorException {}

/* 
 * 		Exception		Checked because RuntimeException not in hierarchy
 * 			^
 * 		ColorException
 * 			^
 * 		WhiteException
 */

class White {
	// m1 might throw an exception, so if m1 is called then the 
	// calling code must handle it - either by a try catch or
	// declare it to be thrown
	void m1() throws ColorException { // will throw new WhiteException()
		throw new WhiteException();
	}
	
	// m2 might throw an exception, so if m2 is called then the 
	// calling code must handle it - either by a try catch or
	// declare it to be thrown
	void m2() throws WhiteException { } // might throw a WhiteException but does not throw an exception
	
	public static void main (String[] args){ //throws ColorException or use try/catch
	    White white = new White();
	    //  0   1   1   0
	    int a,  b,	d,	f; 	   a = b = d = f = 0;
	
	    try {
	    	white.m1(); 
	    	a++; 
	    } catch (ColorException e) {   // Will catch the WhiteException
	    	// as this is a parent.
	    	b++;     
	    }
	   
	    try {
	    	white.m2(); 
	    	d++;	
	    } catch (WhiteException e) {	
	    	f++;	
	    } finally {
	    	System.out.println("Finally block"); 
	    }
	    System.out.print(a+","+b+","+d+","+f);
	}
}
/** 
Finally block
0,1,1,0
*/