/** 
 * Author: Sandra Hawkins
 * Date:   1 Jun 2017
 * ExerciseSolutions/sheet12CustomerPizza/Pizza.java
 */ 

package sheet12CustomerPizza;

public class Pizza {
	
	private String [] toppings;
	private PizzaSize pizzaSize;
	
	public Pizza(String[] toppings, PizzaSize pizzaSize) {
		this.toppings = toppings;
		this.pizzaSize = pizzaSize;
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public double calculatePrice() {
		return pizzaSize.getBasePrice() + 
			  (pizzaSize.getPricePerTopping() * toppings.length);
	}
	
	@Override
	public String toString() {
		String text = "Pizza toppings = ";
		/* Loop through the toppings array, when it's not the last element
		 * put in a , and a space, if it is the last element, just add
		 * it onto the text String.*/
		for (int i = 0; i < toppings.length; i++) {
			text += toppings[i];
			
			if (i != toppings.length - 1)
				text += ", ";
		} 
		
		text += ", pizzaSize = " + pizzaSize.toString().toLowerCase().
				                   replace('_', ' ');
		
		text += String.format(", Price = €%.2f", calculatePrice());
		
		return text;
	}
}
