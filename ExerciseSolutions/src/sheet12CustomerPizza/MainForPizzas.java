/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet12CustomerPizza/MainForPizzas.java
 */ 

package sheet12CustomerPizza;

public class MainForPizzas {

	public static void main(String[] args) {
		
		PizzaSize p1 = PizzaSize.MEDIUM;
		System.out.println(p1.getBasePrice());
		System.out.println(p1.getPricePerTopping());
		
		String [] toppings = {"cheese", "tomato"};
		
		//Pizza p1 = new Pizza (toppings, PizzaSize.SMALL);

	}

}
