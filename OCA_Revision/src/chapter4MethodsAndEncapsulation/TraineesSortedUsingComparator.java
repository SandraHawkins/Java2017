/** 
                                           * Author: Sandra Hawkins
 * Date:   25 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/Trainee2sSortedUsingComparator.java
 */ 

package chapter4MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TraineesSortedUsingComparator {

	public static void main(String[] args) {
		
		Trainee2 t1 = new Trainee2("Dave Edwards", "Dundrum, Dublin 16");
		Trainee2 t2 = new Trainee2("Abbie Byrne", "Clondalkin, Dublin 22");
		Trainee2 t3 = new Trainee2("Bert Connors", "Blackrock, Co. Dublin");
		Trainee2 t4 = new Trainee2("Edwina Furney", "Ballymun, Dublin 11");
		Trainee2 t5 = new Trainee2("Colin Davies", "Finglas, Dublin 11");
		Trainee2 t6 = new Trainee2("Bert Connors", "Finglas, Dublin 11");
		
		ArrayList<Trainee2> listOfTrainees = new ArrayList<>();
		listOfTrainees.add(t1);
		listOfTrainees.add(t2);
		listOfTrainees.add(t3);
		listOfTrainees.add(t4);
		listOfTrainees.add(t5);
		listOfTrainees.add(t6);
		
		printAList("Unsorted List", listOfTrainees);
		
		/* The list of trainees will be sorted according to the
		 * compareTo() method in the Trainee class. The Trainee class
		 * had to implement the Comparable interface so that the list
		 * could be sorted by the Collections.sort() method. */
		Collections.sort(listOfTrainees);
		
		printAList("Sorted according to compareTo() in Trainee", listOfTrainees);
		
		/*
		 * The Comparator interface has one method:
		 * 
		 * 			public abstract int compare(T o1, T o2);
		 */
		
		/* The sort() method in the Collections class takes as a 2nd
		 * parameter a class that implements the Comparator interface,
		 * this class must implement the compare() method. Here a 
		 * lambda expression is used implement the compare() method,
		 * it returns an int and takes in two objects (of any type
		 * to be compared).
		 **/
		Collections.sort(listOfTrainees, 
				(Trainee2 first, Trainee2 second) -> {  
					if (first.getAddress().equals(second.getAddress())) {
						return first.getName().compareTo(second.getName());
					} else {
						return first.getAddress().compareTo(second.getAddress());
					}
				});
		
		printAList("Sorted according to the compareTo() "
				+ "method in the lambda expression", listOfTrainees);
	}
	
	static void printAList(String heading, List<Trainee2> list) {
		System.out.println("********** " + heading + " **********");
		
		for (Trainee2 t : list) {
			System.out.println(t);
		}
		System.out.println();
	}

}

class Trainee2 implements Comparable<Trainee2> {

	private String name;
	private String address;

	public Trainee2() {}

	public Trainee2(String name, String address) {
		this.name = name;
		this.address = address;
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

	@Override
	public String toString() {
		return "name: " + name + ", address: " + address;
	}

	@Override
	public int compareTo(Trainee2 other) {
		
		// if the names match, compare the addresses
		if (this.name.equals(other.name)) {
			return this.address.compareTo(other.address);
		} else { // otherwise the names don't match, so return 
			// the comparison based on the names
			return this.name.compareTo(other.name);
		}
	}
}
