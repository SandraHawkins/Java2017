/** 
 * Author: Sandra Hawkins
 * Date:   31 May 2017
 * ExerciseSolutions/sheet12CustomerPizza/MainForPizzas.java
 */ 

package sheet12CustomerPizza;

import java.util.ArrayList;

public class MainForPizzas {

	public static void main(String[] args) {
		
		PizzaSize ps1 = PizzaSize.MEDIUM;
//		System.out.println("Base price for a medium pizza " + 
//							ps1.getBasePrice());
//		System.out.println("Price per topping for a medium pizza " + 
//							ps1.getPricePerTopping());
		
		String [] toppings = {"cheese", "tomato"};
		
		Pizza p1 = new Pizza(toppings, ps1);
		
		Pizza p2 = new Pizza(new String [] {"cheese", "tomato", "ham"}, 
				             PizzaSize.EXTRA_LARGE);

		Pizza [] pizzas = {p1, p2};
		
		/* An ArrayList is a resizeable array. I can add and remove from
		 * it, I can search in it.
		 * <> are know as generics, here is where I state what datatype
		 * I am storing the ArrayList. If I type Pizza inside the <>
		 * I am telling the compiler: please only allow Pizza objects
		 * inside this ArrayList. The compiler will not allow any other
		 * type, e.g. I cannot add a String.  */
		ArrayList<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(p1);
		pizzaList.add(p2);
		
		for (Pizza one : pizzaList) {
			System.out.println(one);
		}
		
		Customer c1 = new Customer("Jon Wilde", "1 Woods Road, Dublin 19", 
				"011234657", 
				new Pizza [] {p1, p2, 
						new Pizza(new String [] {"extra cheese", "pepperoni"   }, 
								  PizzaSize.LARGE)} );
		System.out.println(c1);
	}
}





