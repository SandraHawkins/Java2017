/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/Operators.java
 */ 

package chapter2OperatorsAndStatements;

public class Operators {

	public static void main(String[] args) {
		
		/*
		 * % modulus operator returns the remainder after integer
		 * division. 
		 */
		int a = 13;
		int b = 4;
		System.out.println("a % b: " + a % b);	// 1
		System.out.println("a / b: " + a / b);	// 3
		
		/*
		 * When + finds a String on the left: String concatenation.
		 * When + finds numbers on the left: addition.
		 * 
		 * When an int is added to a double, the result will be a 
		 * double.
		 */
		System.out.println(12 + 4.0 + "hello");	// 16.0hello
		System.out.println("hello" + 12 + 4);	// hello124
		System.out.println("" + 12 + 4);		// 124

		int result = (int)(12.2 + 6);  	// 18
		double result2 = 12.2 + 6;		// 18.2
		
		/*
		 * ++ 	Increment
		 * -- 	Decrement
		 * 
		 * ++i	Pre-increment
		 * i++	post-increment
		 */
		int players = 0;	
		
		// players++ will use players in the printout and then increment
		System.out.println(players++);	// 0
		System.out.println(players);	// 1 
		// ++players will increment players by one before printing. 
		System.out.println(++players);	// 2

		int answer = players++;
		System.out.println(answer);		// 2
		System.out.println(players);	// 3
		
		// From the book P59.
		int x = 3;						// 4 3
		int y = ++x * 5 / x-- + --x;		
		//        4 * 5 / 4   + 2
		System.out.println("x : " + x);	// 2
		System.out.println("y : " + y); // 7
		
		
		int num1 = 3;								//	4 3 4
		int num2 = num1++ * 5 / --num1 + num1++; 	// 
		//         3	  * 5 /  3     + 3 
		System.out.println("num1 : " + num1);		// 4 
		System.out.println("num2 : " + num2); 		// 8
		
		int j = 5;					// 6 5 6
		int k = j++ - --j * j++;	// 
		//      5   -  5  * 5
		System.out.println("j : " + j);  // 6
		System.out.println("k : " + k);  // -20
		
//		int j = -5;					// -5 -4 -5 -4
//		int k = j++ - --j * j++;	// 
//		//      -5  - -5  * -5 
//		//      -5  - +25 
//		System.out.println("j : " + j);  // -4
//		System.out.println("k : " + k);  // -30
		
		/*
		 * x += 2;			x = x + 2;
		 * x -= 2;			x = x - 2;
		 * x *= 2;			x = x * 2;
		 * x /= 2;			x = x / 2;
		 */
		int c = 5; 		
		c += 10;		
		System.out.println("c : " + c);		// 15
		
		/* 
		 * When you have d *= 2 + 5;
		 * What's on the RHS will happen first, i.e. you may as well
		 * place brackets around the RHS as follows:  
		 */
		int d = 3;
		d *= 2 + 5;		// d = 3 * (2 + 5);
		System.out.println("d : " + d); // 21
		
		int e = 3;
		e = e * 2 + 5;
		System.out.println("e : " + e);	// 11
	}
}