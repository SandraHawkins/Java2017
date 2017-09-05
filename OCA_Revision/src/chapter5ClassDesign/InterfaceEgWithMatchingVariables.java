/** 
 * Author: Sandra Hawkins
 * Date:   5 Sep 2017
 * OCA_Revision/chapter5ClassDesign/InterfaceEgWithMatchingVariables.java
 */ 

package chapter5ClassDesign;

interface One {
	int NUM = 1;
}

interface Two {
	int NUM = 2;
}

interface Three extends One, Two {
	int NUM = 3;  // shadows the inherited variables NUM
}

public class InterfaceEgWithMatchingVariables implements Three {
	public InterfaceEgWithMatchingVariables() {
		System.out.println(Two.NUM);
	}
	public static void main(String[] args) {
		new InterfaceEgWithMatchingVariables();
	}
}
