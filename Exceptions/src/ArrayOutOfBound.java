/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//ArrayOutOfBound.java
 */


/**
 * Accessing an array element past the end or before the beginning will
 * cause an ArrayIndexOutOfBoundsException. It is an unchecked
 * exception (it extends directly from RuntimeException) and therefore
 * you don't need try / catch code surrounding your array accessing code. 
 */
public class ArrayOutOfBound {

	public static void main(String[] args) {
		
		int [] nums = {1, 2, 3, 4};
		
		System.out.println(nums[4]);
	}
}
/**
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
at ArrayOutOfBound.main(ArrayOutOfBound.java:13)
*/