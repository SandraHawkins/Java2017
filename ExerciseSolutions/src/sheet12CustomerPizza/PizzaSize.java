/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet12CustomerPizza/PizzaSize.java
 */ 

package sheet12CustomerPizza;

public enum PizzaSize {
	
	SMALL(7, 1.0),   // (base price, price per topping)
	MEDIUM(9, 1.2),
	LARGE(12, 1.5),
	EXTRA_LARGE(16, 2);
	
	private int basePrice;
	private double pricePerTopping;
	
	private PizzaSize(int basePrice, double pricePerTopping) {
		this.basePrice = basePrice;
		this.pricePerTopping = pricePerTopping;
	}
	
	public int getBasePrice() {
		return basePrice;
	}
	
	public double getPricePerTopping() {
		return pricePerTopping;
	}

}
