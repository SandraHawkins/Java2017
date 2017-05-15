/** 
 * Author: Sandra Hawkins
 * Date:   15 May 2017
 * Classes//MainForPurchase.java
 */

public class MainForPurchase {

	public static void main(String[] args) {
		
		Purchase p1 = new Purchase();
		
		/* 			itemDescription = "Milk"
		 *	p1 -->  quantity = 0
		 * 			price = 0.0
		 **/
		p1.setItemDescription("Milk");
		p1.setQuantity(3);
		p1.setPrice(1.89);
		
		System.out.println("Desc : "  + p1.getItemDescription());
		System.out.println("Quantity: " + p1.getQuantity());
		System.out.println("Price : €" + p1.getPrice());
		
		Purchase p2 = new Purchase();
		p2.setItemDescription("Peanut butter");
		p2.setQuantity(-4);		 // Quantity cannot be less than 0: -4
		p2.setPrice(-1.99);		 // Price cannot be less than 0: -1.99
		System.out.println(p2);  // p2.toString()
		/*
		 * Item Description: Peanut butter
		 * Quantity : 0
		 * Price : €0.0
		 * Total Price €0.0
		 */
		
		Purchase p3 = new Purchase("A super shiny new blue mouse mat", 
								   19, 1.60);
		System.out.println(p3);
		
		Purchase p4 = new Purchase("Keyboard", 15, 14.39);
		System.out.printf("\n%s total price: €%.2f",
		                   p4.getItemDescription(), p4.getTotal());
	}
}

/** OUTPUT
Desc : Milk
Quantity: 3
Price : €1.89
Quantity cannot be less than 0: -4
Price cannot be less than 0: -1.99

Item Description: Peanut butter
Quantity: 0
Price: €0.00
Total Price: €0.00

Item Description: A super shiny new bl
Quantity: 19
Price: €1.60
Total Price: €30.40

Keyboard total price: €215.85
*/