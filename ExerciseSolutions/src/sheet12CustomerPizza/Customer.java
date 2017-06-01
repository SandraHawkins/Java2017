/** 
 * Author: Sandra Hawkins
 * Date:   1 Jun 2017
 * ExerciseSolutions/sheet12CustomerPizza/Customer.java
 */ 

package sheet12CustomerPizza;

import java.util.Arrays;

public class Customer {
	
	private String name;
	private String address;
	private String phone;
	private Pizza [] pizzas;
	
	public Customer(String name, String address, String phone, 
			        Pizza[] pizzas) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pizzas = pizzas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Pizza[] getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}
	
	public double getTotalCost() {
		double cost = 0;
		
		for (Pizza one : pizzas) {
			cost += one.calculatePrice();
		}
		
		return cost;
	}

	@Override
	public String toString() {
		String text = "Name: " + name;
		text += "\nAddress: " + address;
		text += "\nPhone: " + phone;
		
		for (int i = 0; i < pizzas.length; i++) {
			
			text += "\n" + (i + 1) + ": " + pizzas[i];
			if (i != pizzas.length - 1)
				text += ", ";
		}
		text += String.format("\nTotal Cost : €%.2f", getTotalCost());
		
		return text;		
	}
}
