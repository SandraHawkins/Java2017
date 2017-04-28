public class PassArrayToAMethod {

	public static void main(String [] args) {
	
		double [] myNumbers = {1.2, 2.3, 5.6, 8.8};
		PassArrayToAMethod p = new PassArrayToAMethod();
		p.printMyArray(myNumbers);
	}
	
	public void printMyArray(double [] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
/** OUTPUT
1.2
2.3
5.6
8.8
*/