/*
 * A switch is an alternative to an if else.
 */
public class SwitchExample {
	
	public static void main(String[] args) {
		int num = 1;
		
		if (num == 1) {
			System.out.println("number is 1");
		} else if (num == 2) {
			System.out.println("number is 2");
		} else if (num == 3) {
			System.out.println("number is 3");
		} else {
			System.out.println("number is something else");
		}
		
		System.out.println("********************");
		
		/*
		 * A switch statement is an alternative to an if else.
		 * switch(expression), the expression must be a:
		 * byte, int, char, short, enum or a String
		 * or something that can be unwrapped/ unboxed into a 
		 * primitive, e.g. a Byte, Integer, Character or Short.
		 * 
		 * Once a match is found, e.g. it matches at case 2, the 
		 * code as part of the case will execute until a break
		 * is encountered or the end of the switch is reached.
		 * If you omit all breaks, once a case or default matches 
		 * all the code that follows will execute until the end of
		 * the switch is reached.
		 * 
		 * break will exit a loop (for, while, do-while) or a switch.
		 * 
		 * The case statements must be a 'compile time constant',
		 * that means if you use a variable instead of a literal,
		 * that variable must be declared as a constant, e.g.:
		 * 
		 * final int two = 2;
		 * 
		 * 		switch(num) {
		 * 		case two:
		 *     		....
		 *     		break;
		 * 		}
		 */
		num = 2;
		switch (num) {
		case 1:
			System.out.println("number is 1");
			break;
		case 2:
			System.out.println("number is 2");
			break;
		case 3:
			System.out.println("number is 3");
			break;
		case 4:
			System.out.println("number is 4");
			break;
		default:  /* No cases match */ 
			System.out.println("number is something else");
			break;
		}
	}
}