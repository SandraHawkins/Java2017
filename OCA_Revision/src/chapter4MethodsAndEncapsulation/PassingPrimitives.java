/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/PassingPrimitives.java
 */ 

package chapter4MethodsAndEncapsulation;

public class PassingPrimitives {
	/*
	 * When you pass primitives into a method, the method receives
	 * a copy of that primitive. i.e. 10 will be copied into another
	 * variable called num in the modify method.
	 */
	public static void main(String[] args) {
		
		PassingPrimitives p = new PassingPrimitives();
		
		int num = 10;  // 10 
		System.out.println("num before modify() : " + num);	 // 10 	
		p.modify(num);
		System.out.println("num before modify() : " + num);  // 10
	}
	/*
	 * num in modify is a local variable to the modify() method, 
	 * any changes to the local variable are only seen inside this
	 * method.
	 */
	public void modify(int num) {
						// num -> 20
		num = num * 2;
		System.out.println("num in modify() is : " + num); // 20
	}
}