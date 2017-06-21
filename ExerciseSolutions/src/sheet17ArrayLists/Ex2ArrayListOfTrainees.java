/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet17ArrayLists/Ex2ArrayListOfTrainees.java
 */ 

package sheet17ArrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2ArrayListOfTrainees {

	public static void main(String[] args) {
		// Create some trainee objects. Make sure to create two 
		// identical trainee objects, one reference could be t1 for 
		// example and the other reference tCopy. 
		Trainee t1 = new Trainee("Ted", "Finglas", LocalDate.of(1999, 1, 1));
		Trainee t2 = new Trainee("Mary", "Wicklow", LocalDate.of(1988, Month.JULY, 12));
		Trainee t3 = new Trainee("John", "Mayo", LocalDate.of(2009, 6, 22));
		Trainee t4 = new Trainee("Ed", "Bray", LocalDate.of(1992, 11, 15));
		Trainee t5 = new Trainee("Jo", "Kill", LocalDate.of(1970, 7, 13));
		Trainee t6 = new Trainee("Paul", "Cork", LocalDate.of(1988, Month.FEBRUARY, 28));

		Trainee tCopy = new Trainee("John", "Mayo", LocalDate.of(2009, 6, 22));

		// Create an ArrayList for Trainees and add all except tCopy
		ArrayList<Trainee> traineeList = new ArrayList<>();
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t3);
		traineeList.add(t4);
		traineeList.add(t5);
		traineeList.add(t6);

		System.out.println(traineeList.toString().replace('[', '\u0000').
				replace(']', '\u0000'));

		// Check if your ArrayList contains tCopy. If your Trainee
		// class has overridden the equals method, the contains() 
		// method will return true.
		System.out.println("tCopy : " + traineeList.contains(tCopy));

		// Change somebody’s address. 
		traineeList.get(4).setAddress("Dublin");
		System.out.println(traineeList);

		// Prompt the user to enter a name. Loop through the Trainees
		// in the list, if the name is found, print their birthday.
		String name = "";
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a name: ");
			name = scanner.nextLine();

			boolean isFound = false;
			for (Trainee t : traineeList) {
				if (t.getName().equals(name)) {
					System.out.println("Birthday: " + t.getBirthday());
					isFound = true;
				}
			}
			if (!isFound)
				System.out.println(name + " not found");
		}

		// Now remove that trainee from the previous step.
		//traineeList.remove(name);
		
		/* traineeList.iterator() will return an iterator that
		 * can be used instead of a for loop to go through the
		 * array list. */
		Iterator<Trainee> iterator = traineeList.iterator();
		/* iterator.hasNext() will check for a next element in the
		 * list and return true or false */
		while(iterator.hasNext()) {
			/* iterator.next() returns a reference to the next Trainee
			 * in the list. */
			Trainee t = iterator.next();
			/* If the current Trainee's name matched the one entered
			 * by the user. */
			if (t.getName().equals(name)) {
				/* iterator.remove() removes the current */
				iterator.remove();
			}
		}
		
		System.out.println(traineeList);
	}
}
