/* To compile this program:
>javac ArgsInMain.java

To run this program with NO command line args: 
>java ArgsInMain

When you don't pass in any arguments, main will receive an
empty array with 0 elements but it will receive an array.

To run this program with command line args: 
>java ArgsInMain arg1 arg2 "argument 3" arg4 "last argument"

*/
public class ArgsInMain {

	public static void main(String [] args) {
		
		System.out.println("Size of args " + args.length);
		
		/* If no command line arguments are passed in, the 
		following will give an ArrayIndexOutOfBoundsException 
		at runtime and the program will stop here. */
		System.out.println("args[0] " + args[0]);
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args %d is: %s \n", i, args[i]);
		}
		
		/* The following line won't compile because every 
		element in a String array is a String and cannot 
		be assigned to any other data type except a String.
		(Advanced part: Object would work too :-) )*/
		//int num = args[4];
		
		/* You can convert Strings into other data types, once
		you are certain that it is the other type.
		Integer.parseInt(args[4]); 
		takes in a String data type and returns an int.
		*/
		int num = Integer.parseInt(args[4]);
		
		/* \ in a String literal says to remove the special
		meaning of the next character, so \" means output
		a double quote, normally a " is to start or end a 
		String. */
		System.out.printf("\"%s\" converted to an int is: %d", 
						  args[4], num);
	}
}
/** 
The following output will occur when this class is executed
with the following line:
           args      0       1       2        3      4    5
 run            ["Isn't"]["Java"]"great?"]["1 2 3"]["4"]["5"] 
>java ArgsInMain Isn't Java great? "1 2 3" 4 5
 

Size of args 6
args[0] Isn't
args 0 is: Isn't
args 1 is: Java
args 2 is: great?
args 3 is: 1 2 3
args 4 is: 4
args 5 is: 5
*/