public class PopulatingWithALoop {

	public static void main(String [] args) {
		
		int [] nums = new int[10];  
		// nums-->[0][0][0][0][0][0][0][0][0][0]
		
		for (int i = 0, value = 2; i < nums.length; i++, value += 2) {
			nums[i] = value;
			System.out.println(nums[i]);
		}
		
		System.out.println("The real loop for printing");
		/* A loop for printing the array */
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