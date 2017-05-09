/** 
 * Author: Sandra Hawkins
 * Date:   9 May 2017
 * Arrays//ThreeDArray.java
 */

public class ThreeDArray {
	public static void main(String[] args) {

		/* This sets up 3 arrays, each of those contains
		 * 2 array with 4 elements in each. Each element is 0.
		 * 
		 * bigArray1 --> [ ]                     [ ]                     [ ] 
	 	 *               /                        |                       \
		 *              / 		                  |                        \
		 *        [ ] [ ]                      [ ] [ ]	   	               [ ] [ ]
		 *        /     \                      /     \                     /     \    
 		 *[0][0][0][0] [0][0][0][0]   [0][0][0][0] [0][0][0][0]   [0][0][0][0] [0][0][0][0]
		 * 
		 */
		int [][][] bigArray1 = new int [3][2][4];
		System.out.println(bigArray1[0].length);    // 2
		System.out.println(bigArray1[0][0].length); // 4
		System.out.println(bigArray1[0][0].length); // 4
		System.out.println(bigArray1[0][0][0]);	    // 2
		
		int [][][] bigArray = {
				// bigArray[0][0]  bigArray[0][1]    
				// 0 1    0 1 2
				{ {1,2}, {3,4,5} }, 		// bigArray[0]
				
				// bigArray[1][0], bigArray[1][1], bigArray[1][2]
				{ {6}, {7,8,9,10}, {11}, }, // bigArray[1]
				                
				// bigArray[2][0], bigArray[2][1]
				{ {12,13,14}, {15, 16} }	// bigArray[2]
			};
		
		bigArray[2][0][1] = 33;
		bigArray[1][2] = new int [] {11, 11, 11, 11};
		
		/* The next two lines have gotten rid of {3,4,5} from bigArray[0] */
		bigArray[0] = new int [1][];
		bigArray[0][0] = new int []{1,2};
		
		
		System.out.println(bigArray[1][1][1]);   // 8
		System.out.println(bigArray[2][0][2]);   // 14
		//System.out.println(bigArray[1][2][1]); // ArrayIndexOutOfBounds
		
		System.out.println(bigArray.length);         // 3
		System.out.println(bigArray[1][1].length);   // 4
		System.out.println(bigArray[2].length);      // 2
		
		/* You cannot mix datatypes in an array */
		//bigArray[1][1] = new byte[] {1, 2, 3};
		//bigArray[1][1] = new char[] {'a', 'b', 'c'};
		
		/* The 'old' loops to print the contents of the 3D array */
		System.out.println("***************");
		for (int i = 0; i < bigArray.length; i++) {
			for (int j = 0; j < bigArray[i].length; j++) {
				for (int k = 0; k < bigArray[i][j].length; k++){
					System.out.print(bigArray[i][j][k] + " ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
		/* The enhanced for loop to print the contents of the 3D array */
		System.out.println("***************");
		for (int [][] twoD : bigArray) {
			for(int [] oneD : twoD) {
				for (int num : oneD) {
					System.out.print(num + " ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
/** OUTPUT
2
4
4
0
8
14
3
4
2
***************
1 2 	
6 	7 8 9 10 	11 11 11 11 	
12 33 14 	15 16 	
***************
1 2 	
6 	7 8 9 10 	11 11 11 11 	
12 33 14 	15 16 	
*/
