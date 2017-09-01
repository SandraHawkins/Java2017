/** 
 * Author: Sandra Hawkins
 * Date:   28 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/NullAsAVarArgs.java
 */ 

package chapter4MethodsAndEncapsulation;

import java.util.Arrays;

public class NullAsAVarArgs {

	public static void main(String[] args) {
		
		walk(1, 2, 3);	// when printed: [I@15db9742
		walk(1, null);  // when printed: null
		walk(2, new int [] {4, 5});

	}

	static void walk (int start, int... nums) {
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
	}
}
