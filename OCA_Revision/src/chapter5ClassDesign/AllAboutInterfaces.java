/** 
   * Author: Sandra Hawkins
 * Date:   1 Sep 2017
 * OCA_Revision/chapter5ClassDesign/AllAboutInterfaces.java
 */ 

package chapter5ClassDesign;

/* Interfaces can be public or default. */
interface Country {
	
	/* Constants:
	 * All variables in an interface are public static and final
	 * whether you include those keywords or not. 
	 * When a class implements an interface it will inherit all 
	 * constants. */
	public static final int LEINSTER = 1;
	static final int MUNSTER = 2;
	final int CONNACHT = 3;
	int ULSTER = 4;
	
	/* abstract methods 
	 * - Cannot have a body. 
	 * - Cannot be private or final.
	 * - All methods without typing abstract, default or static will
	 *   all be public and abstract.
	 * - The first concrete class MUST implement/ override all abstract
	 *   methods. 
	 **/
	public abstract String getProvince();
	abstract void printCountryName();
	void printNumberOfProvinces();
	
	/* default methods
	 * 
	 * NOTE: 'default' is not an access modifier and it is now used to
	 *       modify a method in an interface, meaning the method will
	 *       have a body and be inherited by implementing classes, 
	 *       which may choose to override it. 
	 *       
	 * - Must have a body
	 * - Will be public whether you type it or not.
	 * - default methods can only appear in an interface.
	 * - The implementing class will inherit this method and may
	 *   choose to override it. 
	 * - Cannot be declared with protected or private keywords. 
	 */
	public default String getCounty() {
		return "Dublin";
	}
	
	/* static methods
	 * - This static method belongs to interface and can only be called
	 *   with the following code: S.o.p(Country.getCounties());
	 * - Static methods are not inherited by implementing classes.
	 * - Static methods are not inherited by sub-interfaces.
	 * - Cannot be protected or private.
	 */
	public static String getCounties() {
		return "Louth, Meath, Dublin, Wicklow, Wexford, Kildare....";
	}
}

public class AllAboutInterfaces implements Country {
	
	public AllAboutInterfaces() {
		System.out.println(MUNSTER); // Constants are inherited
	}
	
	/* This overrides the default method from the interface. */
	public String getCounty() {
		return "Wexford";
	}
	
	public static void main(String[] args) {
		System.out.println(Country.LEINSTER);
	}

	@Override
	public String getProvince() {
		return "Leinster";
	}

	@Override
	public void printCountryName() {
		System.out.println("Ireland");
	}

	@Override
	public void printNumberOfProvinces() {
		System.out.println("Four provinces in Ireland");
	}
}