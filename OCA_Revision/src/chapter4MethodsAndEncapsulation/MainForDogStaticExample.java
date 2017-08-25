/** 
 * Author: Sandra Hawkins
 * Date:   24 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/MainForDogStaticExample.java
 */ 

package chapter4MethodsAndEncapsulation;

public class MainForDogStaticExample {
	
	private int globalVariable;

	public static void main(String[] args) {
		//globalVariable = 22;
		//System.out.println(globalVariable);
		System.out.println(
				new MainForDogStaticExample().globalVariable);
		
		System.out.println(Dog.dogCounter); 		// 0
		System.out.println(Dog.getDogCounter()); 	// 0
		
		Dog d1 = new Dog("Goldie", 4);
		Dog d2 = new Dog("Shep", 6);
		Dog d3 = new Dog("Lassie", 8);
		
		System.out.println(Dog.dogCounter);		// 3
		/* You can use an object reference to access a static variable */
		System.out.println(d3.dogCounter);		// 3
	}
}
class Dog {
	
	/* Member variables can be accessed from instance methods only
	 * i.e. non-static methods only. */
	private String name;
	private int age;
	
	/* A static/ class variable is loaded into memory as soon as
	 * the class is mentioned: System.out.println(Dog.dogCounter);
	 * and before any objects are created. 
	 * A static variable exists just once in memory and is shared
	 * among all objects. Therefore static members (fields/ variable
	 * and methods) can be accessed by object code (constructors, 
	 * getters and setters and toString (non-static methods)) 
	 **/
	public static int dogCounter;
	
	/* Static methods CAN access static variables.
	 * Static methods CANNOT access non-static variables or method. 
	 * Why? because non-static members belong to the object and
	 * no objects exist when static members are created. */
	public static int getDogCounter() {
		//int local = age * 10;
		
		/* 'this' cannot be used in a static variable:
		 * Why? because all statics are created first before any 
		 * objects and 'this' refers to the current object. A static
		 * method should be called on the class name, e.g. 
		 * 					S.o.pln(Dog.getDogCounter()); 
		 * it should not be called on an object reference and therefore
		 * there is no object that 'this' can refer to.  
		 */
		//int var = this.age + 1;
		
		return dogCounter;
	}
	
	/* A static variable can be incremented in a constructor, when
	 * a constructor is called we are in the process of creating 
	 * a Dog object and the static variables will exists before any 
	 * objects are created. 
	 **/
	public Dog() {
		dogCounter++;
	}
	
	public Dog(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
}
