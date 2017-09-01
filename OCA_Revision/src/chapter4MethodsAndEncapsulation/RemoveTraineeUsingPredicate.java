/** 
 * Author: Sandra Hawkins
 * Date:   25 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/RemoveTraineeUsingPredicate.java
 */ 

package chapter4MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;

public class RemoveTraineeUsingPredicate {

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
		
		/* 		interface Predicate {
		 * 
		 * 			boolean test(Object anyType);
		 * 		}
		 *
		 * The removeIf() method in the ArrayList class takes as a 
		 * parameter a Predicate type. I.e. a class that implements
		 * the Predicate interface and override the test() method.
		 * As this is a functional interface (one abstract method), 
		 * you can implement the test() method using lambda expressions.
		 * 
		 *    The parameter passed       { the body of the test method
		 *    into test method       ->    which must return true or 
		 *                                 false } 
		 *
		 */
		listOfTrainees.removeIf( (Trainee2 t) -> {
			
			// Remove from the list if true is returned
			return t.getAddress().startsWith("Finglas");
		});
		
		printAList("Finglas gone", listOfTrainees);
		
		/* Get rid of a name ending in 'Byrne' */
		
		/* Shortest possible */
		listOfTrainees.removeIf( t -> t.getName().endsWith("Byrne") );
		
		/* Same as previous but longer */
		listOfTrainees.removeIf( (Trainee2 t) -> 
						{
							System.out.println("In the test method");
							return t.getName().endsWith("Byrne");
						} );
		
		printAList("Byrne gone", listOfTrainees);
	}
	
	static void printAList(String heading, List<Trainee2> list) {
		System.out.println("********** " + heading + " **********");
		
		for (Trainee2 t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
}