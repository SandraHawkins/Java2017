/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/Constructors.java
 */ 

package chapter4MethodsAndEncapsulation;

/*
 * - Constructors - no return type, same name as the class.
 * 
 * - If you don't type in a constructor, the compiler will create
 *   a 'default constructor' for you. For the Top class here is what
 *   the default constructor would look like:
 *   
 *   	Top() {
 *   		super();
 *   	}
 *   
 * - Whatever access modifier is on the class (public or default), 
 *   the 'default constructor' (the one provided by the compiler) will 
 *   have the same access modifier.
 * 
 * - If you type in any constructor (i.e. one that takes arguments),
 *   you will not get the 'default constructor' provided by the compiler
 *   anymore. When you have the class Top as follows:
 *   
 *   	class Top {
 *   		public Top(String s) {}
 *   	}
 *   
 *   This line in main(): Top t = new Top();
 *   won't compile because there isn't a no-args constructor.
 *   To fix this: You can type in a constructor that takes no 
 *   arguments or you should explicitly call the constructor that
 *   take an argument: e.g. Top t = new Top("top object");
 *   
 * - When you create a subclass and you don't type any constructors,
 *   the compiler will provide a default constructor, it will implicitly
 *   call the parent's no-args constructor, so make sure the parent
 *   class has a no-args constructor or your subclass won't compile:
 *   
 *   	class Top {
 *   		public Top(String s) { }
 *      }
 *      
 *      class Bottom extends Top {
 *      	Bottom() {
 *      		super();
 *      	}
 *      }
 * 
 * To fix: 
 * Either: type in a no-args constructor in the parent.
 * or: type in any constructor in the child and make its first line
 * a call to the constructor in the parent, e.g.: 
 * 
 * 			class Botton extends Top {
 * 				Bottom() {
 * 					super("any string");
 * 				}
 * 			}
 * 
 * - A call to super() or this() cannot be the second line, it must
 *   be the first. I.e. you can only have one call to either this()
 *   or super().
 *   
 *   
 * - this.name = "Fred";    this.setName("Fred");
 *
 * 	 this refers to the current executing object. e.g.:
 * 		Trainee t1 = new Trainee();
 * 		t1.setName("John");
 * 
 *  					public void setName(String name) {
 *  						this.name = name;
 *  					}
 *     'this' refers to the current object's name, i.e. t1's name.	
 * 
 * - All modifiers can be applied to constructors: public, protected,
 *   (default) and private  
 *   Note: if a constructor has default access, can it be accessed in
 *         a different package? No!
 *         
 * - If a constructor has a return value, it's not a constructor! It 
 *   is a regular method, cannot be called with new Top(); but can
 *   be called with: 
 *   			Top t = new Top();
 *   			t.Top();   
 *   
 * - Only constructors can call other constructors by using the keywords
 *   this() and super() and it must be the first line. Regular methods
 *   cannot call constructors, they can but only by writing new Top();  
 */
class Top {
	
	void Top() {
		//this();
		Top t = new Top();
		System.out.println("Not a constructor but a regular method");
	}
	
	Top() {
		this("name"); //Calls Top(String s) method
	}
	
	Top(String s) { }
}

class Bottom extends Top {
	Bottom() {
		super(""); //calls Top(String s) method
	}
	
	/* This is overloading, when you have a method/ constructor with
	 * the same name but a different parameter list. */
	Bottom(String name, int num) {
		//this();
		super("");  // must be the 1st line in a constructor. super("") calls Top(String s)
				
	}
}

/* The class below won't compile as the parent's no-args constructor
 * is missing and it is implicitly called from the 'default 
 * constructor'. */
//class VeryBottom extends Bottom {
//
//}

public class Constructors {
	
	static String name;
	
	public static void main(String[] args) {
		
		Top t = new Top("top object");
		// Cannot have 'this' in static context.
		/*this.*/name = "Sandra";
	}
}
