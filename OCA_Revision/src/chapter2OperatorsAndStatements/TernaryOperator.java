/** 
 * Author: Sandra Hawkins
 * Date:   10 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/TernaryOperator.java
 */ 

package chapter2OperatorsAndStatements;

public class TernaryOperator {

	public static void main(String[] args) {
		/* Ternary operator/ Conditional operator
		 * The ternary operator is an alternative to an if else. 
		 * If the condition is true, then the value between the ?
		 * and : is returned, otherwise the value after the : is 
		 * returned. The ternary operator will either be assigned to 
		 * a variable as in the code examples below or surrounded in 
		 * a call to println() as follows:
		 * 
		 * int num = 10;
		 * S.o.pln(num < 100 ? "num under 100" : "num 100 or over");
		 * 
		 * The round brackets around the condition are optional.
		 */
		int num = 10;
		//         condition ? "if true"       : "if false";
		String s = num < 100 ? "num under 100" : "num 100 or over";
		System.out.println(s);  // num under 100

		System.out.println(num < 100 ? "num under 100" : "num 100 or over");


		int sizeOfYard = 10;
		int numOfPets = 5;
		/* If the condition is true, then return the string between 
		 * the ? and the first colon. If the condition is false, then 
		 * execute the code after the first colon. */ 
		//               condition     ? "true part"    : "false part";
		String status = (numOfPets < 4)? "Pet count OK" : 
					    (sizeOfYard > 8)? "Pet limit on the edge" : 
					    "too many pets";
		System.out.println("Pet status is " + status);
		
		/*
		 * If x is between 80 and 90 then profit = 0.2
		 * if x is over 90                profit = 0.5
		 * otherwise                      profit = 0
		 */
		int x = 91;
//		double profit = x >= 80 && x <= 90 ? 0.2 : 
//			            x > 90 ? 0.5 : 0;
		
					 // (condition) ? true : false
		double profit = x < 80      ? 0    : 
			           // (condition)      ? true : false
			            x >= 80 && x <= 90 ? 0.2  : 0.5; 
		System.out.println("profit : " + profit);	
	}
}
