/** 
 * Author: Sandra Hawkins
 * Date:   16 May 2017
 * ExerciseSolutions/sheet5Classes/Dog.java
 */ 
package sheet5Classes;

public class Car /*extends Object*/ {
	
	/* Member variables. Will be private. They can only be accessed 
	 * through public methods in this class, known as accessor methods.
	 * Encapsulation: private variables with public accessor methods.
	 * When I use this Dog template to create Dog objects, the member
	 * variables.
	 * 
	 **/
	private String make;
	private String model;
	private double engineSize;
	
	/* Static/ class variables
	 * static - one per class/ once in memory 
	 * 
	 * carCounter is going to count how many Car objects are created 
	 */
	
	public static int carCounter;
	
	/* Constructors. When you don't type ANY constructors, the compiler 
	 * will provide a 'default constructor', which looks like this:
	 * 			
	 * 			public Car() { } 
	 * 
	 * A constructor never has a return type.  It will return the address
	 * to where the new was created in memory but you don't enter
	 * a return type when writing the constructor.
	 * 
	 * carCounter++ is used to count how many car object are created
	 * in memory. To use a static variable, you use the
	 * 		Classname.staticVariableName
	 * e.g.
	 * 		in main()  S.o.pln(Car.carCounter);
	 **/
	public Car() {
		carCounter++;  // increment the counter

	}   // 'no-args constructor'
	
	public Car(String make, String model, double engineSize) {
		//carCounter++; 		// Don't copy and paste
		/* Call the no-args constructor, if there is any code that
		 * has to be executed for all objects that are created.
		 * Rule: constructors can call each other using this(), 
		 * this("", "", 1.2), super() and it MUST be the first
		 * line. */ 
		this();
		
		/* If the set methods perform any validation, make sure they
		 * are called here. */
		
		// this.make = make;
		setMake(make);
				
		this.model = model;
		
		//this.engineSize = engineSize;
		setEngineSize(engineSize);
	}
	
	/* Getters and setters: accessors.
	 * Mutator method. In computer science, a mutator method is a method 
	 * used to control changes to a variable. They are also widely known 
	 * as setter methods. Often a setter is accompanied by a getter 
	 * (also known as an accessor), which returns the value of the 
	 * private member variable. 
	 * 
	 * this.make  	refers to the current object's 'make' member variable.
	 * 
	 * this. 		will always give access to the member of the class.
	 * 
	 * If you refer to 'make' in the following method, it will refer to
	 * the 'make' variable within scope, which is the parameter to the 
	 * method. */
	public void setMake(String make) {
		/* Perform any validation */
		switch (make) {
			case "Audi": 
			case "Toyota":
			case "Mitsubishi":
			case "Ford":
			case "Honda":
			case "Alpha Romeo":
			case "BMW":
			case "Mercedes":
			case "Volkswagen":
			case "Opel":
				this.make = make;
				break;
			default:
				System.out.println(make + " is not a valid make");
				break;
		}
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setEngineSize(double size) {
		if (size >= 1 && size <= 2.3)
			this.engineSize = size;
		else 
			System.out.println(size + " is not a valid engine size");
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getEngineSize() {
		return engineSize;
	}

	
	/* toString(). It's recommended that you replace/ override the 
	 * toString() from the object class.  If you print a reference
	 * variable e.g. System.out.println(c2); and haven't overridden 
	 * the toString() method, you might get this printout:
	 * sheet5Classes.Car@15db9742
	 * The toString() method should return a String of all the member
	 * variable's values.  */
	public String toString() {
		return "\nMake: " + make + 
				"\nModel: "+ model +
				"\nEngine Size: " + engineSize;
	}
}
