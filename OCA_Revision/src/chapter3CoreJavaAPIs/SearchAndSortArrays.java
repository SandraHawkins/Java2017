/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/SearchAndSortArrays.java
 */ 

package chapter3CoreJavaAPIs;

import java.util.Arrays;

public class SearchAndSortArrays {

	public static void main(String[] args) {

		int [] nums = {20, 12, 1, 3, 9, 4, 26};
	
		Arrays.sort(nums);
		
		/* When you print a reference to an object (an array is an
		 * object), if that class doesn't override the toString()
		 * method, it will print the memory address. An array 
		 * doesn't have a toString() method. */
		System.out.println(nums); 	// [I@15db9742
		
		System.out.println(Arrays.toString(nums));
		//  0  1  2  3  4   5   6
		// [1, 3, 4, 9, 12, 20, 26]
		int position = Arrays.binarySearch(nums, 4);       // 2
		System.out.println(Arrays.binarySearch(nums, 10)); // -4 -1 = -5
		System.out.println(Arrays.binarySearch(nums, 22)); // -6 -1 = -7
		
		/*
		 * The array MUST be sorted prior to using binarySearch(). 
		 * If it is not sorted, the results are undefined!
		 */
		int [] moreNums = {12, 18, 1, 25, 26, 6};
		System.out.println(Arrays.binarySearch(moreNums, 12)); // -4
		System.out.println(Arrays.binarySearch(moreNums, 10)); // -4
		
		/* Doing it properly. Sort before searching. */
		Arrays.sort(moreNums);
		System.out.println(Arrays.toString(moreNums));
		// [1, 6, 12, 18, 25, 26]
		System.out.println(Arrays.binarySearch(moreNums, 12)); // 2
		System.out.println(Arrays.binarySearch(moreNums, 10)); //-2-1=-3
	}
}
