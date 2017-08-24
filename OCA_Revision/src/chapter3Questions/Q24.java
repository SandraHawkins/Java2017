/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/QuestionsFromBook/Q24.java
 */ 

package chapter3Questions;

import java.util.Arrays;
import java.util.List;

public class Q24 {

	public static void main(String[] args) {
		String [] names = {"Tom", "Dick", "Harry"};
		List<String> list = Arrays.asList(names);
		list.set(0, "Sue");
		System.out.println(names[0]);

	}

}
