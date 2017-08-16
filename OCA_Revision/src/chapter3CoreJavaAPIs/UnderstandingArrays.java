/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/UnderstandingArrays.java
 */ 

package chapter3CoreJavaAPIs;

public class UnderstandingArrays {

	public static void main(String[] args) {
		// This is a reference that will refer to an int array.
		// Legal: int [] nums; int nums [];
		// Cannot have a number in the []
		int [] nums;
		
		/*
		 * nums --> [0][0][0][0]
		 */
		nums = new int [4];
		
		/* Populate the array: */
		nums[0] = 6;
		nums[1] = 9;
		nums[2] = 10;
		nums[3] = 7;
		/* An exception at Runtime. */
		//nums[4] = 4;  // ArrayIndexOutOfBoundsException: 4
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		/* As it loops, 6 will get copied into n, 9 will get copied 
		 * into n, 10 will get copied into n and 7 will get copied 
		 * into n,*/
		for (int n : nums) {
			System.out.println(n);
		}
			
		int [] empty = { };
		System.out.println("Length of empty: " + empty.length); // 0
		//System.out.println(empty[0]);  //  ArrayIndexOutOfBoundsException
		
		/* 2D array. Cannot have numbers in the [] on the LHS. 
		 * RHS: you must have a number in the first set of [] */
		int [][] values = new int [4][];
		
		/* 
		 * values --> [][][][]
		 *            / /  \ \
		 *        null null null null
		 */
		System.out.println("length of first dimension: " + values.length);
		System.out.println(values[0]); 				// null
		//System.out.println(values[0].length); 	// NullPointerException
		values[0] = new int [3];
		System.out.println(values[0][1]);		// 0 
		values[1] = new int [] {2, 4, 6};	
		values[2] = new int [] {1, 5};
		values[3] = new int [2];
		/* 
		 * values --> []	[] 		[]     []
		 *            / 	/  		 \      \
		 *     [0][0][0]  [2][4][6] [1][5] [0][0]
		 */
		System.out.println("Printing 2D array: ");
		
		for (int i = 0; i < values.length; i++, System.out.println()) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j]);
			}
		}
		
		/* Populating a 2D array with nested for loops. 
		 * new int [2][5]; sets up two arrays with 5 elements in each. 
		 * You must set up memory (using new) before you can populate
		 * each element.
		 * 
		 *	         game =  []   []
		 *					/       \
		 *    [0][0][0][0][0]		[0][0][0][0][0]  
		 *    
		 *   game.length = 2
		 *   game[0].length = 5
		 **/
		int [][] game = new int [2][5];
		
		for (int i = 0, num = 10; i < game.length; i++, num += 10) {
			
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = num;
			}
		}
		/*
		 *	         game =  	[]     []
		 *					    /       \
		 *    [10][10][10][10][10]		[20][20][20][20][20]   
		 */
		for (int [] array1: game) {
			for (int value: array1) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		/* OUTPUT
		 * 10 10 10 10 10
		 * 20 20 20 20 20 
		 */
		
		/* One-liner for setting up a twoD array, the two sets of []
		 * can be separated in the declaration. */
		int [] another2D [] =  { {2, 4, 6}, {8, 9, 10, 11} };
		System.out.println(another2D.length);		// 2
		System.out.println(another2D[0].length);	// 3
		System.out.println(another2D[1].length);	// 4
		
		/*
		 * 		nums3 = 	[]   []   [] 
		 * 					/     |    \
		 * 		[] []            []		[]     []     []
 		 *     /    \					/        \     \ 
		 * {1,2}, {3, 4, 5}			{6, 7, 8, 9}, {10}, {}
		 */
		int [][][] nums3 = {
				{ {1,2}, {3, 4, 5} },	    	// 0
				  {},						    // 1
				  { {6, 7, 8, 9}, {10}, {} }	// 2
			    };
		
		System.out.println(nums3.length);		// 3
		System.out.println(nums3[0].length);	// 2
		System.out.println(nums3[1].length);	// 0 
		System.out.println(nums3[1]); 		    // [[I@15db9742
		//System.out.println(nums3[1][0]); 		// ArrayIndexOutOfBoundsException
		System.out.println(nums3[2].length);	// 3
		System.out.println(nums3[2][1].length); // 1 
		System.out.println(nums3[2][2].length); // 0
		System.out.println(nums3[2][1][0]);	    // 10
	}
}
