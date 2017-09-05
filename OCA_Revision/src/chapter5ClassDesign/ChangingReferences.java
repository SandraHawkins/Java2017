/** 
 * Author: Sandra Hawkins
 * Date:   5 Sep 2017
 * OCA_Revision/chapter5ClassDesign/ChangingReferences.java
 */ 

package chapter5ClassDesign;

public class ChangingReferences {

	public static void main(String[] args) {
		
		Object o = new Trainee();
		System.out.println(o.toString()); // Uses toString method from Trainee class
		Human h = (Human)o;
		h.name = "Ted";
	
		//h.address = "Finglas";  // No address in Human
		((Trainee)h).address = "Finglas";
		
		Trainee t2 = (Trainee)h;
		System.out.println(t2.name);
		System.out.println(t2.address);
		
		Object o2 = (Object)t2; // Upcast, but cast not needed
		/* The toString() method is overridden in the Trainee class,
		 * which overridden gets called depends on the object type
		 * at runtime. The object is a Trainee object and therefore
		 * the toString() in the Trainee class will be called at 
		 * runtime. */
		System.out.println(o2.toString()); // Name: Ted, address: Finglas // 
		System.out.println(t2.toString()); // Name: Ted, address: Finglas
		
		/********************************************/
		Object o3 = new Trainee();
		((Trainee)o3).name = "Mary";
		System.out.println(o3.toString()); // Name: Mary, address: null
		
		
		Human human = new Trainee();
		System.out.println(human.getName());  // Trainee
	}
}

class Human {
	public String name;
	
	public String getName() { return "Human"; }
}
class Trainee extends Human {
	public String address;
	public String phoneNumber;
	
	public String getName() { return "Trainee"; }
	
	public String toString() {
		return "Name: " + name + ", address: " + address; 
	}
}
