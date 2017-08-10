/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/SwitchExample.java
 */ 

package chapter2OperatorsAndStatements;
/*
 * - A switch statement can evaluate an int, byte, short, char, enum 
 *   and a String. Anything else won't compile. 
 *   I bought some cute elephants and sweets.
 * - However you can evaluate anything that can be implicitly cast 
 *   to an int, e.g. an Integer, Short, Byte and Character wrappers.
 *   You can switch on an Integer, Short, Byte and Character wrappers.
 * - A case constant must be the same type as the expression or it must
 *   be implicitly cast. E.g. if I switch on an int, I can have a case
 *   that is a character: case 'b':
 * - If using a variable as the case constant, the variable must be 
 *   final and must be initialised on the same line (that's called
 *   a compile time constant).
 * - Once a case matches, code will keep executing until a break or
 *   the end of the switch is encountered.
 * - The 'default:' doesn't have to appear last, it can appear anywhere. 
 *   When none of the cases match, the default is executed, if there 
 *   are no breaks, all remaining code after the default will execute. 
 *   until the end of the switch.
 */
public class SwitchExample {
	
	static enum Lights { RED, AMBER, GREEN };
	static Lights l2; // null
		
	public static void main(String[] args) {
		
		Lights lights = Lights.AMBER;
		l2 = Lights.GREEN;
		System.out.println(l2);
		
		switch (lights) {
		case AMBER:
			System.out.println("Drive faster");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		case RED:
			System.out.println("Stop");
			break;
		default:
			System.out.println("Out of order");
			break;
		}
		
		String dayOfWeek = "Saturday";

		switch (dayOfWeek) {
		case "Monday":
			System.out.print("1");
		default:
			System.out.print("other");
		case "Tuesday":
			System.out.print("2");
		case "Wednesday":
			System.out.print("3");
		case "Thursday":
			System.out.print("4");
		case "Friday":
			System.out.print("5");
		}
		// output: other2345
		
		int num = 8;
		final int x = 10; // must be initialised on the same line
		
		switch (num) {
		case 2:
		//case "four":  // won't compile, must be an int or something
			// that can be implicitly cast to an int. 
		case 'b':		// 'b' is stored as 98
		case 8: 
			System.out.println("In case 8");
			System.out.println("Hello");
		case x:  // This variable must be declared as a constant
			System.out.println("even number");
			break;
		default:
			System.out.println("odd number");
			break;
		}
		
		Integer num2 = new Integer(10);
		Integer num3 = 12;		// 12 is boxed into a Wrapper
		int num4 = num2;		// The Integer 10 is unboxed and the 
		                        // primitive 10 is stored in num4
				
		switch (num2) { 
		case 6:
			break;
		case 8:
			break;
		default:
			break;
		}
		
		
		byte b = 5;
		final byte value = 15;

		switch (b) {  // bics, enum and String
		case 'a':	// 97
			break;
		case 10:
			break;
		case value:
			break;
		//case 128:		// too large for a byte
		//	break;			
		default:
			break;
		}
		
		System.out.println((int)'a'); // 97
		System.out.println((int)'A'); // 65	
		
		String pet = "dog";
		switch (pet) {
		case "cat":
			System.out.println("Cat");
		default:
			System.out.println("None of the others");
		case "mouse":
			System.out.println("Mouse");
		case "snake":		
			System.out.println("Snake");
		}
		// None of the others
		// Mouse
		// Snake
		
	}
}
