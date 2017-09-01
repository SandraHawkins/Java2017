/** 
 * Author: Sandra Hawkins
 * Date:   31 Aug 2017
 * OCA_Revision/chapter5ClassDesign/OverridingAndOverloading.java
 */ 

package chapter5ClassDesign;

/*
 * Overriding Methods:
 * 1. Same name in parent, same name in child.
 * 2. Same parameter list. 
 * 3. Same return type or a covariant type. The return type in the
 *    child class can be a subtype of the return type in the parent. (e.g. List is the parent and ArrayList is the child)
 * 4. Accessiblity modifier: same or more visible. 
 *    cannot be less visible.
 *    -------->
 *    public, protected, (default), private
 * 5. Exceptions: the overriding method (in the child class) 
 *    cannot throw a new or broader checked exception.  Cannot throw
 *    a different checked exception or a parent of the super class one. 
 *    The overriding method can omit the Exception (leave it out). 
 *    
 * Overloading Methods:
 * 1. Same name in the same class or a subclass.
 * 2. You MUST have a different parameter list or it is not a valid
 *    overload.
 * 3. Return type can change. 
 * 4. Visibility modifier can change. 
 * 
 * Which overridden method gets called, depends on the object type.
 * 
 *  	Animal a1 = new Horse();
 *      Ref var   = object type
 *      
 * Which overRRidden gets called depends on the object type, which
 * is on the RHS of the declaration. And this is worked out at Runtime. 
 *
 */
class Animal {
	// Overloading the eat() method underneath
	public void eat() {
		System.out.println("Animal eating");
	}
	
//	// Overloading the eat() method on top
//	void eat(String s) {
//		System.out.println("Animal eating " + s);
//	}
	
	/* sleep() with no parameters is not overridden in the child class
	 * therefore if you have this code: 
	 * Animal a1 = new Horse();
	 * a1.sleep(); 
	 * Horse inherits sleep() and therefore the Animal version is called */
	public void sleep() {
		System.out.println("Animal sleeping");
	}
}

class Horse extends Animal {
	@Override
	public void eat() {
		System.out.println("Horse eating");
	}
	
	// Overloads the eat() method on top
	void eat(String s) {
		System.out.println("Horse eating " + s);
	}
	
	void eat(String s1, String s2) {
		System.out.println("Horse eating " + s1 + " and " + s2);
	}
	
	// Overloads the sleep() method in Animal 
	public void sleep(String s) {
		System.out.println("Horse sleeping on " + s);
	}
}

public class OverridingAndOverloading {
	public static void main(String[] args) {
		Animal a = new Animal();
		Horse h = new Horse();
		Animal a1 = new Horse();
		
		/* Which overridden method gets called depend on the object
		 * type that the reference refers to, i.e. a1 refers to
		 * a Horse object, therefore eat() in Horse will be called. */
		a.eat();			// Animal eating
		h.eat();			// Horse eating
		a1.eat();			// Horse eating
		
		//Horse h1 = new Animal();   // Parent left = child right
		// The RHS must pass the IS-A test, i.e. it must be the same as
		// or extends the type on the LHS. 
		
		/* The sleep method is in the Animal class and not in Horse. 
		 * It is not overridden but it is inherited by the Horse class 
		 * There is only is one sleep() method in the Animal class, no
		 * matter how I call sleep(), it will always execute the one
		 * in the Animal class. 
		 * */
		a.sleep();			// Animal sleeping
		h.sleep();			// Animal sleeping
		a1.sleep();			// Animal sleeping
		
		/* Q: What reference type is 'a'?
		 * A: It's an Animal.
		 * Q: Does the Animal class have an eat() method that takes
		 *    a String? 
		 * A: No, therefore it won't compile. */
		//a.eat("Hay");
		
		/* Q: What reference type is 'h'?
		 * A: It's a Horse.
		 * Q: Does the Horse class have an eat() method that takes
		 *    a String? 
		 * A: Yes, therefore it compiles. 
		 *
		 * Which overloaded methods get called depends on the
		 * reference type. 
		 * Q: What reference type is 'h'?
		 * A: It is a Horse
		 * Therefore, the eat() method that takes a String will be
		 * called in the Horse class.
		 **/
		h.eat("Hay");		// Horse eating hay 
		
		/* Q: What reference type is 'a1'?
		 * A: It's an Animal.
		 * Q: Does the Animal class have an eat() method that takes
		 *    a String? 
		 * A: No, therefore it won't compile. */
		//a1.eat("Hay");
		
		/* FINAL NOTE: If a method is overridden, which method to 
		 * call depend on the object type. 
		 * 
		 * If it is not an overridden method being called (an
		 * overloaded method, a static variable, a static method, 
		 * an instance variable), it will be based on the reference
		 * type. E.g. h.eat("Hay") will be called on 'h' which 
		 * is a Horse.
		 **/
		
		Horse h2 = new Horse();
		h2.eat("Hay", "Oats");		// Horse eating Hay and Oats
		// Calls eat() in the Horse class that takes two Strings
	}
}