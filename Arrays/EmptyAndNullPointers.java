/** 
 * Author: Sandra Hawkins
 * Date:   10 May 2017
 * Arrays//EmptyAndNullPointers.java
 */

public class EmptyAndNullPointers {

	public static void main(String[] args) {
		String [][] test = new String [3][];
		//     [null]  [null]  [null]
		
		System.out.println(test.length);       	// 3
		System.out.println(test[0]);   			// null
	    //System.out.println(names[0].length);  // NullPointerException
		//System.out.println(test[0][0]);  		// NullPointerException
		for (String [] one : test)
			System.out.print(one + " ");  		// null null null 
		
		/* When you print the location of an array, (not each 
		 * individual element) it will print what looks like
		 * a memory address. 
		 **/
		String [][] another = { {}, {}, {} };
		System.out.println(another); 	// [[Ljava.lang.String;@15db9742
		System.out.println(another[0]); // [Ljava.lang.String;@6d06d69c
	}
}