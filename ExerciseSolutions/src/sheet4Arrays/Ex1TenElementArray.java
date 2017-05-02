package sheet4Arrays;

public class Ex1TenElementArray {

	public static void main(String [] args) {
		
		int [] nums = new int [10];
		
		/* A loop to populate the array */
		for (int i = 0, value = 2; i < nums.length; 
		                               i++, value += 2) {
			nums[i] = value;
		}	
		
		/* A loop to print the array */
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
		}
	}
}
/** OUTPUT
2
4
6
8
10
12
14
16
18
20
*/