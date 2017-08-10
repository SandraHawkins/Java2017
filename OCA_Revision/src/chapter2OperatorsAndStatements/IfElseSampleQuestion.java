/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/IfElseSampleQuestion.java
 */ 

package chapter2OperatorsAndStatements;

public class IfElseSampleQuestion {

	public static void main(String[] args) {

		int value = 33;
		if (value >= 0) {
			if (value != 0)
				System.out.print("the ");  // the
			else
				System.out.print("quick ");
			if (value < 10)
				System.out.print("brown ");
			if (value > 30)
				System.out.print("fox ");   // fox
			else if (value < 50)
				System.out.print("jumps "); 
			else if (value < 10)
				System.out.print("over ");
			else
				System.out.print("the ");
			if (value > 10)
				System.out.print("lazy ");   // lazy
		} else {
			System.out.print("dog ");
		}
		System.out.print("...");			
	}
}
/** OUTPUT
the fox lazy ...
*/