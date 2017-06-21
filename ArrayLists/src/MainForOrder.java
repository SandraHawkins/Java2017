import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;

/** 
 * Author: Sandra Hawkins
 * Date:   15 Jun 2017
 * ArrayLists//MainForOrder.java
 */

public class MainForOrder {

	public static void main(String[] args) {

		Order o1 = new Order("TV", LocalDate.now());
		Order o2 = new Order("Car", LocalDate.of(2017, Month.APRIL, 30));
		Order o3 = new Order("Speakers", LocalDate.of(2017, Month.MAY, 1));

		ArrayList<Order> orderList = new ArrayList<>();
		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);
		orderList.add(new Order("Bottle", LocalDate.now()));
		System.out.println(orderList);
	
		//o2.setDate(LocalDate.now());
		/* orderList.get(3) will return a reference to the 4th Order
		 * object, I can then call any set method in the Order class to  
		 * change the member variable for that object, e.g. to change
		 * the date: */
		orderList.get(3).setDate(LocalDate.now());
		System.out.println(orderList);
		
		Order oCopy = new Order("Bottle", LocalDate.now());
		
		// For the following line to return true, you must override
		// the equals() method in the Order class.
		// If you want a different object with the same value for the
		// member variables to be found in an arrayList, you must
		// override the equals() method. 
		System.out.println(orderList.contains(oCopy)); // true
		System.out.println(orderList.contains(o2));    // true
		
		printListUsingForLoop(orderList);
		printListUsingAnIterator(orderList);
		System.out.println("Final print of my List: ");
		printListUsingForLoop(orderList);
	}
	
	public static void printListUsingForLoop(ArrayList<Order> myList) {
		System.out.println("Printing descriptings only :");
		
		for (Order o : myList) {
			System.out.println(o.getDescription());
		}
	}
	
	public static void printListUsingAnIterator(ArrayList<Order> myList) {
		/* An iterator is like a pointer to each item/ Order in the list.
		 * When I call myList.iterator(), it will return an iterator 
		 * that points to the beginning of list. It can be used
		 * to get each order by calling iterator.next(); 
		 * and you can use it to delete the current element. 
		 * 
		 * There are three methods() in an Iterator:
		 *
		 * - hasNext() will return true if the list contains a next element
		 * - next() will move the pointer onto the next element and 
		 *          retrieves the next element.
		 * - remove() will remove the current element.
		 *  
		 **/
		Iterator<Order> iterator = myList.iterator();
		
		System.out.println("Printing descriptings only :");
		// iterator.hasNext(): asks if there is a next element in the list?
		while(iterator.hasNext()) { 
			Order currentOrder = iterator.next(); // Get that element
			System.out.println(currentOrder.getDescription());
			iterator.remove(); // Remove current element
		}
	}
}
