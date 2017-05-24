/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet4BArrays/Ex1SearchingSortingAnArray.java
 */ 
package sheet4BArrays;

import java.util.Arrays;
import java.util.Random;

public class Ex1SearchingSortingAnArray {

	public static void main(String[] args) {

		Ex1SearchingSortingAnArray ex1 = new Ex1SearchingSortingAnArray();

		int [] nums = new int [10];  // {2, 5, 6, 8, 12, 16, 2, ....}
		ex1.populateArrayWithRandomNumbers(nums);
		ex1.printMyArray(nums);
		ex1.findSmallestElement(nums);
		ex1.findLargestElement(nums);
		ex1.searchArray(nums, 5);
		ex1.sortArray(nums);
		ex1.printMyArray(nums);

		/* There is a class in the API called Arrays, which contains
		 * static methods for searching and sorting arrays. You will 
		 * rarely need to created your own methods like we have done
		 * below and instead you can call these static methods. Here
		 * are some examples below. 
		 * 
		 * NOTE: before the Arrays class can search in your array, it
		 * must first be sorted, you can call Arrays.sort(myArray) to
		 * do this for you. 
		 **/
		/* Sort first before calling any other methods */
		Arrays.sort(nums);
		ex1.printMyArray(nums); // print the sorted array
		/* Search in my array for the number 5.  */
		int foundAtPosition = Arrays.binarySearch(nums, 5);
		/* If a negative number is returned, then the number was 
		 * not found.If */		
		System.out.println(foundAtPosition < 0 ? 
				"5 Not found" : "5 found at " + foundAtPosition);
	}

	/**
	 * This method sorts the array from smallest to largest, it uses the 
	 * selection sorting algorithm. The selection sort works as follows: 
	 * you look through the entire array for the smallest element, once 
	 * you find it you swap it (the smallest element) with the first 
	 * element of the array. Then you look for the smallest element in 
	 * the remaining array (an array without the first element) and swap
	 * it with the second element. Then you look for the smallest element 
	 * in the remaining array (an array without first and second elements) 
	 * and swap it with the third element, and so on. 
	 */
	public void sortArray(int [] nums) {
		System.out.println("Sorting the array.....");
		//      {8, 9, 3, 10, 4, 1, 7, 9, 2, 5, 4}
		// i     0    
		// j        1
		// smallest = 1			position = 0

		/* This loop runs once through the whole array */
		for (int i = 0; i < nums.length; i++) {
			int position = i;		// The position where the smallest is found
			int smallest = nums[i]; // The smallest starts at the first element
			// next time into the loop, it will be assigned the second element,
			// and so on. 

			/* This loop on its:
			 * - 1st go, will loop from the 2nd element to the end
			 * - 2nd go, will loop from the 3rd element to the end
			 * */ 
			for (int j = i + 1; j < nums.length; j++) {

				/* See if the current element is smaller than the previous,
				 * if it is then save the element's value and the position 
				 * it was found at */
				if (nums[j] < smallest) {
					smallest = nums[j];
					position = j;
				}
			}
			/* Swap the smallest into the 1st position (the 1st time through
			 * the outer loop), into the 2nd position (the 2nd time through 
			 * the outer loop), and so on. */
			int temp = nums[i];			// Store the (1st) number in temp
			nums[i] = smallest;			// The smallest number goes into position (1)
			nums[position] = temp;		// Where the smallest number was, 
										// put temp in there (the 1st number)
		}
	}

	/**
	 * This method takes in an array to search in and a value to search for.
	 * When the the element is found, it prints out the position it was found
	 * at and exits the loop.
	 */
	public void searchArray(int [] nums, int value) {
		System.out.println("Search in the array for " + value);
		
		boolean isFound = false;
		
		/* Loop through the whole array */
		for (int i = 0; i < nums.length; i++) {
			/* When a match is found */
			if (nums[i] == value) {
				/* Using 'i' I can print the position that the value
				 * is found at, and exit the loop afterwards */
				System.out.printf("%d found at position %d\n", value, i + 1);
				
				isFound = true;
				/* Exits the loop after the first match is found  */
				break;
			}
		}
		if (!isFound)
			System.out.println(value + " not found in the array");
	}

	/**
	 * This method loops through the array, looking for the largest element.
	 */
	public void findLargestElement(int [] nums) {
		
		if (nums.length != 0) {
			int largest = nums[0];
			int positionFound = 0;
			/* This loop will always iterate the whole array when looking 
			 * for the largest. I cannot use 'i' for the position the 
			 * largest is found at because i will always be 20 when 
			 * the loop is finished. I need another variable called
			 * positionFound to hold the correct position. */
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] > largest) {
					largest = nums[i];
					positionFound = i + 1;
				}
			}
			System.out.printf("The largest element is %d at position %d\n",
					largest, positionFound);
		} else {
			System.out.println("The array is empty");
		}
	}

	/**
	 * This method loops through the array, looking for the smallest element.
	 */
	public void findSmallestElement(int [] nums) {
		
		/* If the array is not empty, search for the smallest */
		if (nums.length != 0) {
			int smallest = nums[0];

			/* This loop starts at 1 to skip the first element */
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < smallest)
					smallest = nums[i];
			}

			System.out.println("The smallest element is " + smallest);
		} else {
			System.out.println("The array is empty");
		}
	}

	/**
	 * This method loops through the array and populates it with
	 * random numbers retrieved from the Random classes .nextInt() method.
	 */
	public void populateArrayWithRandomNumbers(int [] nums) {
		System.out.println("Populating the array......");
		/* Creates an instance of the Random class, so that I can 
		 * use it to generate random ints by calling .nextInt()
		 * on the instance. */
		Random random = new Random(); 

		for (int i = 0; i < nums.length; i++) {
			/* random.nextInt(20) will return a number between 0 and 19,
			 * when I add one, I get a number between 1 and 20 */
			nums[i] = random.nextInt(20) + 1;
		}
	}

	/**
	 * Prints the content of the int array passed in. For example:
	 * 
	 * 			3 5 17 6 20 8 12 6 11 11 
	 */
	public void printMyArray(int [] nums) {
		System.out.println("Printing the array.....");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
/** POSSIBLE OUTPUT
Populating the array......
Printing the array.....
1 20 7 19 14 14 7 19 8 3 
The smallest element is 1
The largest element is 20 at position 2
Search in the array for 5
5 not found in the array
Sorting the array.....
Printing the array.....
1 3 7 7 8 14 14 19 19 20 
Printing the array.....
1 3 7 7 8 14 14 19 19 20 
5 Not found
*/