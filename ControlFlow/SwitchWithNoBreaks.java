/*
 * A switch statement is an alternative to an if else. Below is an 
 * example of an if else followed by a switch which performs the 
 * same 
 */

public class SwitchWithNoBreaks {
	public static void main(String[] args) {
		
		int num = 8;
		
		if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9) {
			System.out.println("Odd number");
		} else if (num == 2 || num == 4 || num == 6 ||
				   num == 8 || num == 10) {
			System.out.println("Even number");
		} else {
			System.out.println("Something else");
		}
		System.out.println("**************************");
		
		
		/* An alternative to the if else above. */
		switch (num) {
		case 1:
		case 3:
		case 5: /* If any of these cases match, it will keep */
		case 7: /* falling through until a break is found. */
		case 9:
			System.out.println("Odd number");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("Even number");
			break;
		default:
			System.out.println("Something else");
			break;
		}
	}
}
/** OUTPUT
Even number
**************************
Something else
*/