/** 
 * Author: Sandra Hawkins
 * Date:   31 Aug 2017
 * OCA_Revision/chapter4Questions/Order23.java
 */ 

package chapter4Questions;

public class Order23 {
	String value = "t";

	{ value += "a"; }
	{ value += "c"; }
	
	public Order23() {
		value += "b";
	}
	
	public Order23(String s) {
		value += s;
	}
	
	public static void main(String[] args) {
		Order23 order = new Order23("f");
		order = new Order23();
		System.out.println(order.value);
	} 
}
