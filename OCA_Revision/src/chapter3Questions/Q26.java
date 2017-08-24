/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q26.java
 */ 

package chapter3Questions;

import java.util.ArrayList;
import java.util.List;

public class Q26 {
	public static void main(String[] args) {


		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
//		System.out.println(ages.get(0));
//		System.out.println(ages.get(1));
//		System.out.println(ages.get(2));
//		System.out.println(ages.get(3));
		
		/*
		 * null is the fourth element, it will be unboxed so it can 
		 * be assigned to 'int age' when it loops. To unbox null, 
		 * .intValue() will be called on null and give a 
		 * NullPointerException.
		 */
		for (Integer age : ages) 
			System.out.print(age);
	}


}
