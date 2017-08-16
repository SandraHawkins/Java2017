/** 
 * Author: Sandra Hawkins
 * Date:   10 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/NestedLoopsBreakAndContinue.java
 */ 

package chapter2OperatorsAndStatements;

public class NestedLoopsBreakAndContinue {

	public static void main(String[] args) {
		/* Every time execute goes into the body of the 1st loop, 
		 * the 2nd loop starts from scratch, i.e. the increment
		 * section happens each time.  */ 
		
		    //   i = 0 1 2 3
		for (int i = 0; i < 3; i++) { 			// 1st loop
			
			     // j = 0 1 2 3 	// i = 0
				 // j = 0 1 2 3    // i = 1
				 // j = 0 1 2 3    // i = 2
			for (int j = 0; j < 3; j++) {		// 2nd loop
				
				System.out.printf("i is %d and j is %d\n", i, j );
			}
		}
		/*
		 * i   j
		 * 0   0 
		 * 0   1 
		 * 0   2 
		 * 1   0
		 * 1   1 
		 * 1   2
		 * 2   0 
		 * 2   1 
		 * 2   2  
		 */
		
		/* A break statement exits a loop or switch. 
		 * When a break is in a nested loop, it will break out of
		 * the inner loop, i.e. the loop it's in and go to any code
		 * after the inner loop, as this is in an outer loop, when 
		 * break is encountered, execution will go to i++.*/
		// i = 0 1 2 3 
		for (int i = 0; i < 3; i++) { 		
			
		     // j = 0 1 2 3 
			for (int j = 0; j < 3; j++) {	
				System.out.printf("i is %d and j is %d\n", i, j );
				if (i == 1)
					break;   // goes to 'there' and then i++
			}
			// 'there'
		}
		/*
		 * i  j
		 * 0  0  
		 * 0  1
		 * 0  2 
		 * 1  0  // When i was 1, the if statement was true, and it 
		 *       // breaks out of the inner for and goes to i++.
		 * 2  0 
		 * 2  1 
		 * 2  2
		 */
		
		/* outer:   this is a label. A label is any legal identifier
		 *          followed by a : and must appear directly before
		 *          a loop and if/else or a switch. 
		 * continue outer;   goes straight to i++;
		 **/
		outer:  // i = 0 1 2 3 4 5 
		for (int i = 0; i < 5; i++) {
			//   j = 0 
			for (int j = 0; j < 5; j++) {
				
				System.out.println("Hi");  // Hi Hi Hi Hi Hi
				continue outer;  // goes to i++
				 //break;  // break would got to the printout after the
				// inner loop and output 5 * Hi Outer and 1 Good-Bye
				
			} // end of inner loop
			System.out.println("outer"); 
		}
		System.out.println("Good-Bye"); 
		
		
		/* continue FIRST_CHAR_LOOP;  execution will go to a++
		 * when this statement is encountered. */
		FIRST_CHAR_LOOP:
			//   a = 1 2 3 4 5
		for (int a = 1; a <= 4; a++) {
			//        x = a b 
			for (char x = 'a'; x <= 'c'; x++) {
				
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP; // goes to a++
				System.out.print(" " + a + x); // 1a3a4a
			}
		}
	
		String [] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
		
		outer:
		// i = 0 1 2 3 4 
		for (int i = 0; i < programmers.length; i++) {    
			// j = 0 1 
			for (int j = 0; j < programmers.length; j++) {  

				if (programmers[j].equals("Shreya"))
					continue outer; // goes to i++
				
				System.out.printf("%s\n", programmers[j]);
			}
		}
		/*
		 * Paul
		 * Paul
		 * Paul
		 * Paul
		 */
		
		//           i       0        1         2        3
		String [] names = {"Paul", "Shreya", "Selvan", "Harry"};
		
		/* for (one of what's in it : name of the array )   
		 * As it loops s will get a copy of each element in the array
		 * 1: s = "Paul"
		 * 2: s = "Shreya"
		 * 3: s = "Selvan"
		 * 4: s = "Harry"
		 */
		for (String s : names) {
			System.out.println(s);
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		String [][] addressBook = {
				{"Mary", "0861234567", "mary@gmail.com"}, // addressBook[0]
				{"John", "0871111111", "john@gmail.com"}, // addressBook[1]
				{"Dave", "0893333333", "dave@irl.ie"},	  // addressBook[2]
				{"Pati", "0853333333", "pat@hotmail.com"},// addressBook[3]
				{"Eddy", "0862222222", "ed@goIreland.ie"} // addressBook[4]
		};

		outer:
			  // i = 0 1 2
		for (int i = 0; i < addressBook.length; i++) { // Access each row
			/* This for loop in reality is not needed. And therefore 
			 * the label on the outer loop is not needed. */
			//       j = 0
			for (int j = 0; j < addressBook[i].length; j++) {	// Print each bit of data
				
				if (addressBook[i][0].equals("Dave")) {
					System.out.println(addressBook[i][0]);
					System.out.println(addressBook[i][1]);
					System.out.println(addressBook[i][2]);
					break outer;   // goes to /* here */
				}
			}
			System.out.println("Next row");
		} 
		/* here */
	}
}	
