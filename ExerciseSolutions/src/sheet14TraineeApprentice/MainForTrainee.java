package sheet14TraineeApprentice;

import java.time.LocalDate;
import java.time.Month;

public class MainForTrainee {
	public static void main(String[] args) {
				
		SoftwareDeveloper sd1 = new SoftwareDeveloper("Bob", 
				LocalDate.of(1980, Month.JULY, 25), "1234567A");
		CAD cad1 = new CAD("Dermot", LocalDate.of(1994, 2, 28), 
				"987654G");
		Electrician e1 = new Electrician("Sparks", 
				LocalDate.of(1977, 7, 7), "5555555F", 
				"Mercury Engineering", Apprentice.PHASE_TWO);
		Carpenter c1 = new Carpenter("Chippy", 
				LocalDate.of(1997, 6, 21), "7777777G", 
				"Munster Joinery", Carpenter.PHASE_TWO);
		
		/*
		 * All subtypes can be stored in an array of the parent type
		 */
		Trainee [] all = {sd1, cad1, e1, c1,
				new Electrician("Volter", LocalDate.of(1904, 
						Month.FEBRUARY, 28), "8888888F", 
						"Jones Engineering", Electrician.PHASE_FIVE)};
		
				
		System.out.println("All apprentices in Phase 2:");
		
		
		/*
		 * We want to print the trainee's name and employer's name of
		 * every apprentice currently in PHASE_TWO. So, we loop through 
		 * the trainee array:
		 * It is not possible to call the methods getPhase() and 
		 * getEmployersName() directly on the 't' reference, (as these 
		 * methods are specific to the apprentice types Electrician and 
		 * Carpenter) 't' is a Trainee type. 't' can only be used to 
		 * directly access Trainee methods. So, a cast is needed to 
		 * access the getPhase() and getEmployerName() methods. See below:
		 * 
		 * NOTE: You should NEVER cast when looping though an array 
		 * of parent types without first doing an instance of check as you
		 * might get a ClassCastException. E.g. the first object in the 
		 * array is a SoftwareDeveloper and when 't' refers to a 
		 * SoftwareDeveloper object and I cast 't' into an Apprentice
		 * it will cause a ClassCastException, so I must put the casting
		 * code into an if statement that checks that 't' refers to an
		 * object that "IS-A" Apprentice before casting. 
		 * 
		 * Downcasting: When you have an array of objects and the reference
		 * type of the array is the parent type (this demonstrates 
		 * Polymorphism, where the array contains 'many forms') and you 
		 * want to access child methods, you must change the reference 
		 * type from the Parent down into the Child. But make sure
		 * before you cast that you check the reference 't' refers to the
		 * correct object, i.e. if (t instanceof Apprentice). 
		 */
		for (Trainee t : all) {

			if (t instanceof Apprentice && 
					((Apprentice)t).getPhase() == Apprentice.PHASE_TWO) {
				
				System.out.println("Trainee's name " + t.getName() +
						"\tEmployer's name " + ((Apprentice)t).getEmployerName());
			}
		}
	}
}
/** OUTPUT
All apprentices in Phase 2:
Trainee's name Sparks	Employer's name Mercury Engineering
Trainee's name Chippy	Employer's name Munster Joinery
*/