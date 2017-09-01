/** 
 * Author: Sandra Hawkins
 * Date:   31 Aug 2017
 * OCA_Revision/chapter4Questions/Panda.java
 */ 

package chapter4Questions;

/*
 * interface Predicate<T> {
 * 		boolean test(T t);  // Takes in any type
 * }
 * 
 * interface Predicate<Panda> {
 * 		boolean test(Panda t);  // Takes in any type
 * }
 */
import java.util.function.*;

public class Panda {
	int age;  // 1
	
	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 1;
		//       (Panda p) -> { return p.age < 5; } 
		check(p1, p -> p.age < 5);
	}
	
	private static void check(Panda panda, Predicate<Panda> pred) {
		
		String result = pred.test(panda) ? "match" : "not match";
		System.out.print(result);  // match
	} 
}
