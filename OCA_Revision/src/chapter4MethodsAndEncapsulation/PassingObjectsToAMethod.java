/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/PassingObjectsToAMethod.java
 */ 

package chapter4MethodsAndEncapsulation;

public class PassingObjectsToAMethod {
/*
 * When you pass an object reference into a method, the method will
 * get a copy of the memory address of that object. It can use that
 * memory address to change the contents of the object and any changes
 * will be seen outside of the method. 
 * If the method reassigns the reference to a new object, the 
 * original object in main() stays the same, the new object is only
 * accessible in the modify() method.
 * e.g. t1 = new Trainee();  
 */
	public static void main(String[] args) {
		Trainee t = new Trainee();
		/*
		 * t --> age = 18    // changes to 28
		 */
		System.out.println("age before modify() : " + t.age); // 18
		
		new PassingObjectsToAMethod().modify(t);
		System.out.println("age after modify() : " + t.age); // 28
		
	}
	              //    ^
	              //    |
	void modify(Trainee t1) {
		t1.age = 28;
		System.out.println("age in modify() : " + t1.age); // 28
		t1 = new Trainee();
		t1.age = 58;
		System.out.println("t1's new age: " + t1.age);
	}
}

class Trainee {
	int age = 18;
}
/*
 * age before modify() : 18
 * age in modify() : 28
 * age after modify() : 28
 */
