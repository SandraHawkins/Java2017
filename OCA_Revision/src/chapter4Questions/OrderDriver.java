/** 
 * Author: Sandra Hawkins
 * Date:   31 Aug 2017
 * OCA_Revision/chapter4Questions/Order.java
 */ 

package chapter4Questions;

class Order {
	static String result = "";  // ucrcr
	{ result += "c"; }  // 1. 
	
	static
	{ result += "u"; }
	
	{ result += "r"; }  // 2. 
}
public class OrderDriver {
	public static void main(String[] args) {
		/* When the class Order is mentioned, the static init block
		 * will execute and it only executes once. */
		System.out.print(Order.result + " ");  // u 
		System.out.print(Order.result + " ");  // u 
		new Order();  // 1. 2. 
		new Order();  // 1. 2. 
		System.out.print(Order.result + " "); // ucrcr
	}
}
/** OUTPUT: 
 * 	u u ucrcr 
 */