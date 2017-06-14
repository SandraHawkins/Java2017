/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * RandomStuff//VarArgs.java
 */

public class VarArgs {

	public static void main(String... args) {
		add();
		add(3);
		add(6, 7);
		add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		add(new int [] {2, 4, 6, 8});
	}
	
	/* int... means a variable length of int arguments can
	 * passed in. E.g. I can pass in zero arguments, one int,
	 * two ints or ten ints into this method. Inside the method
	 * the int..., i.e. the variable length of ints are treated 
	 * as an array.
	 * If you have more than one parameter in a method declaration
	 * and you want one of the parameters to be a var arg, it must
	 * be the last. You can only have one var arg in a parameter list.
	 * */
	public static void add(int... nums) {
		//System.out.println(nums[0]); // ArrayIndexOutOfBoundsException
		// for the first call
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
/** OUTPUT

3 
6 7 
1 2 3 4 5 6 7 8 9 10 
2 4 6 8 
*/