/** 
 * Author: Sandra Hawkins
 * Date:   6 Sep 2017
 * OCA_Revision/chapter5ClassDesign/Q14P295.java
 */ 

package chapter5ClassDesign;

interface HasVocalCords {
	public abstract void makeSound();
}

interface CanBark extends HasVocalCords {
	public void bark();
}

//public class Q14P295 implements CanBark {

//}
