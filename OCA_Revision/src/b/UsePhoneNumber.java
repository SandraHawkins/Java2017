/** 
 * Author: Sandra Hawkins
 * Date:   23 Aug 2017
 * OCA_Revision/b/UsePhoneNumber.java
 */ 

/*
package a;
public class Phone {
	public static String NUMBER = "0871234567";
}
*/
package b;

import a.Phone;

import static a.Phone.*;
import static a.Phone.NUMBER;

public class UsePhoneNumber {

	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(Phone.NUMBER);
		/* You should access a static member via the class name but
		 * you can access a static member via an object reference. */
		System.out.println(p.NUMBER);
		System.out.println(NUMBER);
	}
}
