import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/** 
 * Author: Sandra Hawkins
 * Date:   15 Jun 2017
 * ArrayLists//Order.java
 * 
 * Order is a POJO (Plain Old Java Object): member variables with
 * getters, setters, constructor(s) and a toString().
 */
public class Order {
	
	// member variables
	private int id;
	private String description;
	private LocalDate date;
	
	private static int idHolder = 200;
	
	public Order() {
		id = idHolder++;
		date = LocalDate.now();
	}
	
	public Order(String description, LocalDate date) {
		this();
		this.description = description;
		this.date = date;
	}	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

	/* The equals() method will be called by the ArrayList's contains()
	 * method. My code: orderList.contains(oCopy) 
	 * 
	 * Loop through all orders:
	 * 		if (list.get(0).equals(oCopy)) return true else return false;
	 * 		if (list.get(1).equals(oCopy)) return true else return false;
	 * 		if (list.get(2).equals(oCopy)) return true else return false;
	 * 		if (list.get(3).equals(oCopy)) return true else return false;
	 * 		
	 * If you don't override the equals() method and you check a list
	 * to see if it contains() a certain Order object (with the same
	 * description and date), your Order class would inherit the 
	 * equals() method from the Object class, which would compare
	 * memory addresses. 
	 **/
	public boolean equals(Object obj) {
		Order other = (Order)obj;
		
		if (this.description.equals(other.description) &&
				this.date.equals(other.date)) {
				
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "\nOrder id=" + id + 
				", description=" + description + 
				", date=" + date.format(formatter);
	}
}
