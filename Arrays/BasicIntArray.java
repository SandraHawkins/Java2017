public class BasicIntArray {

	public static void main(String [] args) {
	
		/* This line sets up a reference variable called nums
		that will refer to an int array in memory.
		Rule: The square brackets in the declaration cannot contain
		a number, e.g. this wouldn't compile: int [4] nums; */
		int [] nums;   			//    nums -->
		
		/* Sets up memory for 4 integers, each will have a default
		value.  nums will refer to the start of the array in memory.
		Rule: You cannot omit the size of the array on the RHS. 
		e.g. the following would not compile: nums = new int []; 
		Compiler error: 'Array dimension missing'. */
		nums = new int [4];  	//             0  1  2  3
								//    nums -->[0][0][0][0] 
				
		/* These four lines populate the nums array with 2 going
		into position 0, 4 going into position 1 and so on.*/
		nums[0] = 2;			//    nums -->[2][0][0][0]
		nums[1] = 4;			//    nums -->[2][4][0][0]
		nums[2] = 6;			//    nums -->[2][4][6][0]
		nums[3] = 8;			//    nums -->[2][4][6][8]
		
		/* The long way to print an array (tip: use a for loop instead).*/
		System.out.println(nums[0]);  	// 2
		System.out.println(nums[1]);	// 4
		System.out.println(nums[2]);	// 6
		System.out.println(nums[3]);	// 8
		
		
		/* The following line of code will give an 
		ArrayIndexOutOfBoundsException, you cannot access before
		or past the size of the array. */ 
		// System.out.println(nums[4]);	// ERROR at runtime!
	}
}