/** 
 * Author: Sandra Hawkins
 * Date:   15 May 2017
 * Classes//Purchase.java
 */

public class Purchase {
	
	/* Member variables
	 * Encapsulation: private member variable with public accessor method
	 **/
	private String itemDescription;
	private int quantity;
	private double price;
	
	/* Constructors.
	 * Two constructors or methods with the same name and different 
	 * parameter list is known as overloading  */
	public Purchase() {
		
	}
	
	public Purchase(String itemDescription, int quantity, double price) {
		/* If no validation takes place, I could set each member as follows:
		 * 	this.itemDescription = itemDescription;
		 * 	this.quantity = quantity;
		 * 	this.price = price;
		 * 
		 * Below, the set methods are called because they each perform
		 * some validation. 
		 */
		setItemDescription(itemDescription);
		setQuantity(quantity);
		setPrice(price);
	}
	
	
	/* Getters and Setters */
	
	//         p1.setItemDescription(          "Milk");
	public void setItemDescription(String itemDescription) {
		/* If the description is over 50 characters in length, then
		 * chop off any addition characters. substring() is a method in 
		 * the String class, which will return a new String thats 
		 * starts at position 0 of the itemDescription passed in and end
		 * at position 50 - 1. */
		if (itemDescription.length() > 20) { // invalid length
			this.itemDescription = itemDescription.substring(0, 20);
		} else { 		
			this.itemDescription = itemDescription;
		}
	}
	
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			System.out.println("Quantity cannot be less than 0: " + quantity);
		} else {
			this.quantity = quantity;
		}
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Price cannot be less than 0: " + price);
		} else {
			this.price = price;
		}
	}
	
	public String getItemDescription() {
		return itemDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	/* Other methods */
	public double getTotal() {
		return quantity * price;
	}
	
	@Override
	/* toString() returns a string representing all of the member 
	 * variables. This toString() replaces the toString() method
	 * that this class inherits from the Object class. If you don't
	 * type your own toString() and you write the following code: 
	 * 
	 * 		Purchase p = new Purchase();
	 * 		System.out.println(p);
	 * 
	 * Printing 'p' would implicitly call the toString() method from 
	 * the Object class and print something like this:
	 * 
	 * 		Purchase@1ba2d7f3
	 * */
	public String toString() {
//		return "\nItem Description: " + itemDescription +
//				"\nQuantity : " + quantity + 
//				"\nPrice : €" + price +
//				"\nTotal Price €" + quantity * price; // getTotal()
		
		/*
		 * The String.format() method can be called when you want to
		 * format a String (e.g. round off a double to 2 decimal places)
		 * but not print it, i.e. you want to return a formatted String
		 * to a calling method (e.g. to main()). The String.format() 
		 * method takes as the 1st parameter the formatting (e.g. "%.2f")
		 * and subsequent parameters are the values to format. If you
		 * have three percentages in the format string, you will normally
		 * have three values afterwards. 
		 */
		return String.format("\nItem Description: %s\nQuantity: %d"
				+ "\nPrice: €%.2f\nTotal Price: €%.2f", 
				itemDescription, quantity, price, getTotal());			
	}
}