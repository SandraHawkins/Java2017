/** 
 * Author: Sandra Hawkins
 * Date:   15 Sep 2017
 * OCA_Revision/chapter2OperatorsAndStatements/Q9FromClassTest.java
 */ 

package chapter2OperatorsAndStatements;

public class Q9FromClassTest {
	public static void main(String[] args) {
		 // 
		 int x = 2, y = 3, z = 4;
		    //    3    
			int j=0, k =0; // 0  
			//         0
			for (int i=0; i < x; i++) {  // go 2 times
				do {
					k=0; // 0 1 2 3 4 
					while (k < z) { // go 4 times
						k++;
						System.out.print(k + " "); // 1 2 3 4 
					}							   // 1 2 3 4 
					System.out.println(" ");	   // 1 2 3 4  
					j++;						   // ----
				} while (j< y);					   // 1 2 3 4	
				System.out.println("----");
			}
	}
}
/**
 * What values for x, y and z will produce the following result? 

		1 2 3 4  
		1 2 3 4  
		1 2 3 4  
		----
		1 2 3 4  
		----

		A.	X = 4, Y = 3, Z = 2
		B.	X = 3, Y = 2, Z = 3
		C.	X = 2, Y = 3, Z = 3
		D.	X = 4, Y = 2, Z = 3
		E.	X = 2, Y = 3, Z = 4
*/