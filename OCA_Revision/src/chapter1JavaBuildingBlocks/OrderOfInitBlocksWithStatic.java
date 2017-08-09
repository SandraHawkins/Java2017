/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/OrderOfInitBlocksWithStatic.java
 */ 

/*
 * Something that is static belongs to the class and not to any 
 * individual objects. So, a static variable is shared amongst all
 * objects.  
 * A static initialisation block will execute as soon as the class
 * is mentioned and before any object code executes (e.g. any
 * constructor are called).
 * 
 * Static blocks will execute only ONCE when the class is mentioned 
 * and will not execute every time a new object is created. 
 * 
 * Mentioning a class will be either:
 * 		Sout(Stats.NUM);
 * 			or
 * 		new Stats();
 */
package chapter1JavaBuildingBlocks;

public class OrderOfInitBlocksWithStatic {

	public static void main(String[] args) {
		
		System.out.println(Stats.NUM);  // 999			// 3
		/*
		 * Static init block
		 * 999
		 */
		
		new Stats();
		/*
		 * Member variable setting up
		 * Init block
		 * Stat's constructor
		 */
		System.out.println();
		new Stats();
		/*
		 * Member variable setting up
		 * Init block
		 * Stat's constructor
		 */
	}
}

class Stats {
	
	Mem m = new Mem();								// 4	// 7
	
	static int NUM = 10;							// 1
	
	Stats() {
		System.out.println("Stat's constructor");	// 6	// 9
	}
	
	static {										// 2
		System.out.println("Static init block");	// 2
		NUM = 999;									// 2
	}
	
	{
		System.out.println("Init block");			// 5	// 8
	}
}

class Mem {
	Mem() { System.out.println("Member variable setting up"); }
}
