/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/VariableScope.java
 */ 

package chapter1JavaBuildingBlocks;

/*
 * Static variables live as long as the class is mentioned or is running.
 * Instance/ member variables live as long as the object it's in. 
 * Local variables live as long as long as the method they are in is
 * running. 
 * Block variables live as long as the block (curly brackets, e.g.
 * while loop, if statement, switch, do while, for loop, init block) 
 * they are declared in.  
 */
public class VariableScope {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		System.out.println(a.name);  		// null		
		a.printDetails();
		System.out.println(Animal.animalCounter);  // 0
		
		/*
		 * i is a local/ block variable and is only accessible within 
		 * the for loop.
		 * 
		 * result is a local/ block variable and is only accessible 
		 * within the for loop.
		 */
		for (int i = 0; i < 4; i++) {
			int result = i * 10; // local variables
			System.out.println("Result " + result);
		} // result no longer accessible.
		
		System.out.println(Animal.animalCounter); // 0
	} // static variable is no longer accessible
	// Or the new Animal() is no longer accessible
	// or the Animal's name is no longer accessible
	
	void aMethod() {
		/* 
		 * num is a local variable and can only be seen inside the 
		 * method. When the method finishes executing, num cannot be
		 * seen/ accessed.
		 */
		int num = 10; 
		System.out.println("Number is " + num);
	} // num no longer exists.
}

class Animal {
	
	/*
	 * Member variables live as long as the object exists. E.g.
	 * Animal a = new Animal();	  
	 * name will exist for as long as 'a' refers to the animal object.
	 * 
	 * You can make 'a' refer to something else:
	 * 
	 * Animal a2 = new Animal();
	 * a = a2;
	 * a = new Animal();
	 * a = null;
	 */
	String name;
	
	/*
	 * A static variable belongs to the class. It is created when
	 * the class is mentioned and it will die when main is finished or
	 * when the program exits. 
	 */
	static int animalCounter;
	
	Animal() {
		/* 
		 * This local variable exists only within this block (curly 
		 * brackets), when this constructor finishes, 'age' will
		 * no longer exist and cannot be accessed anywhere else. 
		 */
		int age = 4;
	}
	
	
	void printDetails() {
		/*
		 * message is a local variable and only exists in this block. 
		 */
		String message = "Animals details : ";
	}
}
