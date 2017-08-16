/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/ArrrayReferences.java
 */ 

package chapter3CoreJavaAPIs;

public class ArrrayReferences {

	public static void main(String[] args) {

		int [] nums = new int[4];
		float [] myFloats = {1, 2.4f, 3.6f, 10}; 
		System.out.println(myFloats[0]);   		// 1.0
		
		char [] initials =  {'a', 'b', 'c'};
		int [] moreNums = {2, 4, 6, 8, 10, 12};
		int a = 9;
		int [][] nums2d  = { {1,1} , {2,2,2}, {3,4} }; 
		
		nums2d[0][0] = initials[0];		   // 'a' cast to an int
		System.out.println(nums2d[0][0]);  // 97
		
		nums2d[0] = nums2d[1]; // { {2,2,2} , {2,2,2}, {3,4} };

		/* Cannot assign a 1D array to a 2D reference. */
		//nums2d = {2,4,6};  
		
		/* Cannot assign an int to a 1D array reference */
		//nums2d[0] = a;
		nums2d[0] = moreNums;
		/* Arrays of different types are different objects and 
		 * therefore you cannot assign a char [] to an int [] reference */ 
		//nums2d[0] = initials;
		 
		moreNums = nums2d[0]; // ok
		
		
		
		int [][] one2d, two2D  = { {1,1} , {2,2,2}, {3,4} }; 
		/* one1d is a one dimensional array and twoD is a two 
		 * dimensional array */
		int [] one1d, twoD[] = {{2,3}}, threeD[][] = { { {1,1}, {} }};
		
		//System.out.println(one1d);  // not initialised
		
		short s = 4;
		int four = 4;
		int s1 = s;
		int [] mixed = {1, 'a', 0b1101, s}; // all values converted to ints
		short [] allShorts = {s, s, s, s, 4, (short)four};	
		mixed = moreNums;
		/* Cannot assign a short array to an int array reference as you
		 * are mixing object types, i.e. an array is an object. */
		//mixed = allShorts;
		
		/*--- Arrays of Objects ---*/
		String [] names = {"Bill", "Ted", "Fred"};
		Dog [] dogs = { new Dog(), new Dog(), /*new Cat()*/ };
		Cat [] cats = { new Cat(), new Cat(), new Cat() };
		Animal [] all = { new Animal(), new Cat(), new Dog() }; 
		/* When the reference is a parent, you can put child objects
		 * into that array. E.g. an array of Shapes. */
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
