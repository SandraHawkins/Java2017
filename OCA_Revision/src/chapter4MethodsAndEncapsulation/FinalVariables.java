/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/FinalVariables.java
 */ 

package chapter4MethodsAndEncapsulation;

public class FinalVariables {
	
	/* A final member variable MUST be given a value before 
	 * the last line of the constructor completes.
	 */
	final int finalMemberVariable /* = 1 */;
	
	{
		/* finalMemberVariable = 2; */
	}
	
	public FinalVariables() {
		 finalMemberVariable = 3; 
		 //finalMemberVariable = 4;  // can't reassign 
	}
	
	public void aMethod() {
		// finalMemberVariable = 5; // won't compile.
	}

	public static void main(String[] args) {
		/* A final local variable once given a value, cannot be 
		 * changed/ reassigned. It doesn't have to be initialised
		 * on the same line. */
		final int localFinal;
		localFinal = 3;
		//localFinal = 5;
	}
}