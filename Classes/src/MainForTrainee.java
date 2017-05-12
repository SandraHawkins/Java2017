/** 
 * Author: Sandra Hawkins
 * Date:   12 May 2017
 * Classes//MainForTrainee.java
 */

public class MainForTrainee {

	public static void main(String[] args) {
		
		/* Use the Trainee class.  A class is a template for creating
		 * an object. */
		Trainee t1 = new Trainee();
		/* 
		 * 					name = null
		 * 			t1 -->  age = 0
		 * 					address = null
		 **/
		
		/* The next two lines won't work because age is private and
		 * I must use the accessor (set and get) methods instead. */
		//t1.age = 2_000_000;
		//System.out.println("Trainee's age is " + t1.age);
		t1.setName("Joe Black");
		t1.setAddress("1 Main Street, Finglas");
		t1.setAge(20000);
		
		/* 
		 * 					name = Joe Black
		 * 			t1 -->  age = 0
		 * 					address = Main Street, Finglas
		 **/
		
		System.out.println("t1's name " + t1.getName());
		System.out.println("t1's address " + t1.getAddress());
		/* Only display the age if it's not 0 */		
		if (t1.getAge() != 0) {
			System.out.println("t1's age " + t1.getAge());
		}
		
		Trainee t2 = new Trainee();
		t2.setName("Mary Black");
		t2.setAddress("Wicklow");
		t2.setAge(40);
		
		System.out.println("Name " + t2.getName());
		System.out.println("Address : " + t2.getAddress());
		System.out.println("Age : " + t2.getAge());
		
		Trainee t3 = new Trainee("Fred Flintstone", "Bedrock", 25);
		System.out.println(t3);  // S.o.pln(t3.toString());
		
		Trainee t4 = new Trainee("Mary Jones", "Meath", 45);
		System.out.println(t4);  // S.o.pln(t4.toString());
		
		Trainee t5 = new Trainee();
		t5.setName("Damien Shady");
		System.out.println(t5.getName());
	}
}
/** OUTPUT
In setAge(), 20000 is invalid.
t1's name Joe Black
t1's address 1 Main Street, Finglas
Name Mary Black
Address : Wicklow
Age : 40

Name is Fred Flintstone
Address is Bedrock
Age is 25

Name is Mary Jones
Address is Meath
Age is 45
Damien Shady
*/