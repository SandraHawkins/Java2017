/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//NullPointerEg.java
 */


/**
 * Accessing a method on a null reference will cause a NullPointerException.
 * E.g. member variables in an object are assigned default values, if one
 * of the member variable is a String and gets a default value of null and you
 * call a method on it, e.g. .length(), .toLowerCase() or .substring(), it
 * will cause a NullPointerException. It is an unchecked exception (it 
 * extends directly from RuntimeException) and therefore you don't need 
 * try / catch code surrounding your code.  
 */
public class NullPointerEg {

	public static void main(String[] args) {
		Trainee t1 = new Trainee();
		
		// t1 -->  name = null;
		System.out.println(t1.getName()); // null
		
		// When you call a method on a null, you will get a NullPointerException 
		System.out.println(t1.getName().toUpperCase()); // NullPointerException
	}
}

class Trainee {
	private String name;
	
	public String getName() {
		return name;
	}
}

/** OUTPUT
null
Exception in thread "main" java.lang.NullPointerException
	at NullPointerEg.main(NullPointerEg.java:16)
*/
