/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/ExamQuestion2.java
 */ 

package chapter6Exceptions;

class Level1Exception extends Exception {}
class Level2Exception extends Level1Exception {}
class Level3Exception extends Level2Exception {}

/* 
 * 	Exception - Checked if RuntimeExcepion isn't in the hierarchy.
 * 		^
 * 	Level1Exception
 * 		^
 * 	Level2Exception
 * 		^
 * 	Level3Exception
 */

public class ExamQuestion2 {
	public static void main(String args[]) {
		//  0   0   0   0   0   0   3
	    int a,  b,  c,  d,  f,  g,  x;  	 
	    a = b = c = d = f = g = 0;
	    x = 3;
	    try {
	    	try {
	    		switch (x) {
		          case 1: throw new Level1Exception();
		          case 2: throw new Level2Exception();
		          // This exception will be thrown,any other code in
		          // this inner try will be skipped. A matching catch
		          // is looked for, goes to line 40
		          case 3: throw new Level3Exception(); 
	    		} 
	    		a++; 	// skipped
	    	} catch (Level2Exception e) { 
	    		b++;  // this executes
	    	} finally {
	    		c++;  // this executes
	    	}
	    } catch (Level1Exception e) { 
	    	d++;
	    } catch (Exception e) {
	    	f++;
	    } finally {
	    	g++;  // this executes
	    }
	    System.out.print(a+","+b+","+c+","+d+","+f+","+g);
	}
}
/** OUTPUT
0,1,1,0,0,1
*/