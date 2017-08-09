/** 
 * Author: Sandra Hawkins
 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/VariableDefaults.java
 */ 

package chapter1JavaBuildingBlocks;

public class VariableDefaults {
	/* This is a global/ member variable. Declared outside a method
	 * and within the class curly brackets. 
	 * All member variables get default values. */
	int memVariable; 	// 0
	boolean isWinter;   // false
	
	/* An array is an object and therefore they default value will
	 * be null. */
	int [] globalArray;  // null
	String name;		// null
	
	public static void main(String[] args) {
	
		VariableDefaults var = new VariableDefaults();
		var.aMethod();
		
		System.out.println("Mem variable: " + var.memVariable); // 0
		System.out.println("isSummer: " + var.isWinter);     // false
		
		var.usingArrays();
		
		/* A local variable must be initialised before it can be 
		 * accessed, the following if statement might not execute and
		 * therefore the line of code: 
		 * 		System.out.println("num: " + num);
		 * will not compile.
		 */
		int num;
		boolean isTrue = true;
		// isTrue = get value from user;
		if (isTrue) {  // isTrue is evaluated at runtime
					// The compiler doesn't know what value it will have
					// num might not be initialised
			num = 10;
		}
		
		/* The next line won't compile as the if statement might not
		 * execute because 'isTrue' is not evaluated until runtime. */
		//System.out.println("num: " + num);
		
		int num2;
		/* The following code will definitely initialise num, because
		 * either the if or the else will definitely execute. */
		if (isTrue) {
			num2 = 10;
		} else {
			num2 = 12;
		}
		
		System.out.println("num " + num2);   // 10
		
		int value = 5;
		char size;  // local variable, not initialised
		
		/* The following if else statement does not assign a value
		 * to size in all branches, therefore the line of code 
		 * afterwards will not compile. */
		if (value == 0)
			size = 's';
		else if (value == 5)
			size = 'm';
		else if (value == 10) {
			//size = 'l';
		} else 
			size = 'x';
		
		//System.out.println("size " + size);
	}
	
	public void aMethod() {
		int localVar;
		/* Local variables are declared inside a method. 
		 * 
		 * Local variables must be initialised before they can be 
		 * accessed (printing, adding, calling) */
		
		//System.out.println("localVar : " + localVar ); // won't compile
	}
	
	public void usingArrays() {
		/* Local variables must be initialised before being accessed */
		int [] localArray;
		String anotherName;
		
		System.out.println("global array: " + globalArray);  // null
		System.out.println("name : " + name);				 // null
		
		/* The next two lines won't compile. Local variables must
		 * be initialised before they are accessed. */
		//System.out.println("local array: " + localArray);
		//System.out.println("anotherName : " + anotherName);
	
		/* When I ask for new memory for an array, each element gets
		 * a default value: 0 for an int. */
		int [] nums = new int [4];
		// nums --> [0][0][0][0]
		System.out.println("nums[1]: " + nums[1]);		
	}
}
