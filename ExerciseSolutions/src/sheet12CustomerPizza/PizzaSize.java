/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet12CustomerPizza/PizzaSize.java
 */ 

package sheet12CustomerPizza;

/* 
 * An enum is where you create your own datatype with a list of
 * possible values. When you use this class, e.g. PizzaSize.LARGE,
 * you get an instance of this class, meaning this instance can have
 * member variable associated with it. 
 */
public enum PizzaSize {
	
	/* Values or constants. */
	SMALL(7, 1.0),   // (base price, price per topping)
	MEDIUM(9, 1.2),
	LARGE(12, 1.5),
	EXTRA_LARGE(16, 2);
	
	private int basePrice;
	private double pricePerTopping;
	
	/* A construcor in a enum is private whether you type private or not.
	 * It will be called automatically when you use this call, i.e.
	 * when you type PizzaSize.LARGE, the constructor will be called
	 * passing in 12 and 1.5. */
	private PizzaSize(int basePrice, double pricePerTopping) {
		this.basePrice = basePrice;
		this.pricePerTopping = pricePerTopping;
	}
	
	/*
	 * The get methods are used for retrieving the member variable values
	 * for each constanct/ value. E.g. if I call getBasePrice on a
	 * PizzaSize.SMALL instance, it will return 7.
	 */
	public int getBasePrice() {
		return basePrice;
	}
	
	public double getPricePerTopping() {
		return pricePerTopping;
	}
}
