package sheet3ControlFlow;

public class Ex1Loops {

	public static void main(String [] args) {
		
		int i = 0; // 21 22 23
		
		while (i < 23) {
			// When i is not 22, print i followed by a comma
			if (i != 22) {
				System.out.print(i + ","); // 21,
			} else // When i is 22, just print i and a newline
				System.out.println(i);  // 22 
			i++;
		}
		
		// Reset i back to 0
		i = 0;
		do { 
			System.out.print(i + ",");
			i++;
		} while (i < 22);
		System.out.println(i);
		
		
		for (i = 0; i < 22; i++) {
			System.out.print(i + ",");
		}
		System.out.println(i);
		
		/**
			If the following code was on its own in main(), i.e. 
			no other loops, and no declarations of i before it.
			The following code WILL NOT COMPILE:
			i is declared inside the for loop and CANNOT be see
			after the for loop.
		
		for (int i = 0; i < 22; i++) {
			System.out.print(i + ",");
		}
		System.out.println(i);  // This line WILL NOT COMPILE
		
		*/
	}
}
/** OUTPUT
0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22
0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22
0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22
*/