public class BasicLoops {

	public static void main(String[] args) {
		/*
		 * A while loop will keep executing when the condition
		 * is TRUE. When the condition becomes false, the while
		 * loop will not be entered.
		 * 
		 * A loop need a counter, which traditionally starts at 0,
		 * the counter is tested in the condition using relational
		 * operators, e.g.
		 * 		while (i < 4)
		 * 		while (i >= 10)
		 * 		while (i != 0)
		 * 		while (i == 5)
		 * 
		 * The following are the six relational operators:
		 * 		<	less than
		 * 		> 	greater than
		 * 		<=  less than or equal to
		 * 		>=  greater than or equal to
		 * 		!= 	not equal to
		 * 		==  equals, e.g. while (i == 4), loop when i is 4.
		 * 
		 * Conditional operators can also be used in the condition 
		 * of a loog. Conditional operators are: && (and), || (or), 
		 * ! (not), e.g.:
		 * 
		 * 		// while i is greater than 0 and i is less than 10
		 * 		while (i > 0 && i < 10) 
		 * 		// while i is 2 OR i is 4, go inside the loop     
		 * 		while (i == 2 || i == 4)
		 * 		// while is not logged in
		 * 		while (!loggedIn)
		 * 		// while is logged in is false and the number of 
		 *      // attempts is still under 3.
		 * 		while (isLoggedIn == false && numOfAttempts < 3)
		 */
		
		int i = 0;     // 0 1 2 3 4 
		
		while (i < 4) {
			System.out.println("i is " + i);  // 0 1 2 3 
			i++;
		}
		/** OUTPUT
		 *  i is 0
		 *  i is 1
		 *  i is 2
		 *  i is 3
		 */
		
		/*
		 * A do while loop will ALWAYS execute at least once because
		 * the condition is physically is at the bottom. The contents
		 * of the loop must execute before the condition is tested
		 * making it run at least once, e.g. this loop will run
		 * once even though the condition is false:
		 * 
		 * 		int i = 10;
		 * 		do {
		 * 			.....
		 * 			i++;
		 * 		} while (i < 9);   // 11 is not less than 9
		 */
		i = 0;  // 0 1 2 3 4
		do {
			System.out.println("Inside do-while, i is " + i); // 0123
			i++;
		} while (i < 4);
		/** OUTPUT:
		 * Inside do-while, i is 0
		 * Inside do-while, i is 1
		 * Inside do-while, i is 2
		 * Inside do-while, i is 3
		 */
		
		
		/*
		 * A for loop is normally used for looping through an array.
		 * The advantage of a for is that the three parts are written
		 * on one line, the three pars are:
		 * 1. The initialisation: int i = 0; This section executes 
		 *    ONCE per loop, as if it were typed before the loop.
		 * 2. The condition or test, e.g. i < 4. The condition must
		 *    always equate to a boolean, i.e. it must be true or false.
		 *    When the condition is true, the body of the loop will 
		 *    execute. 
		 * 3. The increment, e.g. i++. The increment section will 
		 *    always happen after the body the loop, as if it is the
		 *    last line in the body. You can increment a variable as
		 *    follows:
		 *    			i++;
		 *    			++i;
		 *    			i = i + 1;			i = i + 4;
		 *    			i += i; 			i += 4;
		 *    
		 *    			i = i - 1;			i = i - 10;   
		 */
		
		//       0 1 2 3 4
		for (i = 0; i < 4; i++) {
			System.out.println("Inside for, i is " + i);// 0 1 2 3 
		}
		/** OUTPUT: 
		 * Inside for, i is 0
		 * Inside for, i is 1
		 * Inside for, i is 2
		 * Inside for, i is 3
		 */
	}
}