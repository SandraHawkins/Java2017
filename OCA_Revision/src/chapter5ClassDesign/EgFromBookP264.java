/** 
 * Author: Sandra Hawkins
 * Date:   5 Sep 2017
 * OCA_Revision/chapter5ClassDesign/EgFromBookP264.java
 */ 

package chapter5ClassDesign;

abstract class Animal2 {
	public abstract String getName();
}

abstract class BigCat extends Animal2 {
	public String getName() { //If it was an abstract method there would be no method body
		return "Lion";
	}
	
	public abstract void roar();
}

class Lion extends BigCat {
	
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}