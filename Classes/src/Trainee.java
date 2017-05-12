/** 
 * Author: Sandra Hawkins
 * Date:   12 May 2017
 * Classes//Trainee.java
 */

/**
 * A class is a template/ blueprint for an object/ instance.
 * When you create an instance of a class, your object will get a copy
 * of all member variables.  Member variable are give default values.
 */
public class Trainee {
	
	/* Member variables section.  
	 * Member variables should be kept private and all access to them
	 * from outside the class must go through the public methods. 
	 * This is known as Encapsulation (private member variables and
	 * public accessor methods). When member variables are private,
	 * they cannot be accessed outside the class, e.g. 
	 * 
	 *  		Trainee t1 = new Trainee();
	 *         	t1.age = 2_000_000; 		// WON'T WORK!!!
	 *         
	 * The previous line will not compile because age is private and
	 * cannot be accessed outside the class. So, to access age I must
	 * use the public method in the class. There will be some kind of
	 * method to set the age (setters) and a method to retrieve the
	 * age (getters). 
	 * 
	 * A private member (member variable or method) can only be accessed
	 * in the class that it's in. Only visible here.
	 *         
	 **/
	private String name;
	private String address;
	private int age;
	
	/* Constructors 
	 * 
	 * When you don't type any constructors, you get a default constructor
	 * from the compiler. Here is what it looks like:
	 * 
	 * 		public Trainee() {
	 * 			
	 * 		}
	 * 
	 * When you do enter/ type any constructors (e.g. one that take 
	 * parameters), you NO LONGER get a default constructor provided by
	 * the compiler. 
	 * 
	 * If you want a 'default constructor', i.e. you want to still be able
	 * to type following code:
	 * 
	 * 			Trainee t1 = new Trainee();
	 * 
	 * You will have to type your own constructor that take no parameters
	 * and this will be called a 'no-args constructor'. This is what is 
	 * looks like:
	 * 
	 * 		public Trainee() {}
	 * 
	 * A constructor NEVER has a return type. A constructor will set
	 * up an object in memory, set up its member variables with default
	 * values and returns the location in memory of that new object.
	 * 
	 * e.g. 	Trainee t1 = new Trainee();
	 * 
	 * To call this constructor, you could write the following code:
	 * 
	 * 		Trainee t3 = new Trainee("Fred Flintstone", "Bedrock", 25);
	 * 
	 * 					name = "Fred Flintstone"
	 * 			t3 -->  address = "Bedrock"
	 * 					age = 25
	 * 
	 * 
	 * This constructor is called the no-args constructor. 
	 * The one provided by the compiler when you don't insert any 
	 * constructors is called the 'default constructor'.
	 **/  
	public Trainee() {

	}
	
	// name = "Fred Flintstone" address = "Bedrock" age = 25
	public Trainee(String name, String address, int age) {
		this.name = name;
		this.address = address;
		/* The set methods can be used.  Here I am only using the setAge()
		 * method because it contains validation. You may set the value
		 * passed in directly to the member variable 
		 * (e.g. this.name = name) or call the set method 
		 * (e.g. setName(name)) */
		setAge(age);
	}
	
	/* Methods */             
	/**
	 * Set methods allow access from outside the class to the private 
	 * members variables. Calling code can pass a value into the set
	 * methods and that value will be assigned to the member variable.
	 * This is to prevent invalid values being assigned to member 
	 * variables as the set methods can include validation, see the 
	 * setAge() method below.  
	 * 
	 * When this setName() method is called, e.g. t1.setName("Joe Black");
	 * "Joe Black" will get assigned to the 'name' member variable of the
	 * object it was called on: t1.
	 */						// "Joe Black"
	public void setName(String newName) {
		name = newName; // "Joe Black" get assigned to t1's name mem. var.
	}
	
	/** 
	 * To call this code from main, I typed:
	 * 	
	 * 		t1.setAddress("1 Main Street, Finglas");
	 * 
	 * The parameter 'address' will get the argument "1 Main Street, Finglas",
	 * and it must assign this to the member variable.  
	 * PROBLEM: the member variable and the parameter are the same name.
	 * If you reference 'address' inside the method, it will refer to
	 * the parameter. To get to the member variable, you must use:
	 * 'this.address' 
	 * 'this' refers to the current executing object, i.e. t1's address.
	 * This method was called on t1 and therefore this.address is t1's
	 * address, that is the member variable for t1.
	 * 
	 * 'this' can be used to access members (variable and methods) of 
	 * this class.
	 *  */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * This method could be called with the following line of code:
	 * 
	 * 		t1.setAge(2000000);
	 */
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("In setAge(), " + age + " is invalid.");
		} else {
			this.age = age;
		}
	}
	
	/**
	 * Each get method will return a member variable. The member variables
	 * are private and therefore cannot be accessed outside the class. 
	 * E.g. the following println() would not compile:
	 * 
	 * 		Trainee t3 = new Trainee("Fred Flintstone", "Bedrock", 25);
	 * 		System.out.println(t3.address);  // WON'T WORK!
	 */
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
	
	/**
	 * The toString() method originates in the Object class.  Object
	 * is parent of every class you have written. If you don't type
	 * a toString(), your class will inherit the toString() from the
	 * Object class which will print className@memoryAddress.
	 * If you type in a toString(), you are overriding the toString()
	 * from the Object class and you should return a String that 
	 * include all of the member variables. This toString() can be called
	 * with the following code:
	 * 
	 * 	Trainee t3 = new Trainee("Fred Flintstone", "Bedrock", 25);
	 * 	System.out.println(t3);  
	 * 
	 * When you print t3, it will implicitly call the toString() method,
	 * if you have overridden it, then your method will be called, if
	 * not the one in the Object class will be called.
	 */
	@Override 
	public String toString() {
		return "\nName is " + name + 
				"\nAddress is " + address + 
				"\nAge is " + age;
	}
}