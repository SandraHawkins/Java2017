/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/ScopeExampleSimple.java
 */ 

package chapter1JavaBuildingBlocks;

public class ScopeExampleSimple {

	public static void main(String[] args) {

		/* 
		 * If a variable is declared inside curly brackets of a method
		 * or an if block, that variable cannot be seen outside the
		 * scope of those curly brackets/ block.
		 */
		if (true) {
			int blockVariable = 10;
		}
		//System.out.println(blockVariable);  // Can't be seen
		
		int i = 0;
		do {
			String name = "Ted";
			i++;
		} while (i < 10);
	
		//System.out.println(name); // Can't be seen
	
		for (int j = 0 ; j < 10; j++) {
			;
		}
		//System.out.println(j); // Can't be seen
		
		int num = 4;
		
		switch (num) {
		case 2: 
			int a = 10;
	
		case 4:
			//a = 10;
			//System.out.println(a);  // a mightn't have been initialised
			break;
		default:
			break;
		}
		//System.out.println(a); // Can't be seen

	}
	
	/* A local variable can only be accessed within the scope of
	 * the method it is declared in, i.e. within those {}. */
	public void methodA() {
		int num = 10;
	}
	
	public void methodB() {
		methodA();
		//System.out.println(num); // won't compile because, num is
		// declare inside methodA() and can only be seen inside 
		// methodA();
	}
}
