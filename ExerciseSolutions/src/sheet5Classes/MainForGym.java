/** 
 * Author: Sandra Hawkins
 * Date:   17 May 2017
 * ExerciseSolutions/sheet5Classes/MainForGym.java
 */ 
package sheet5Classes;

public class MainForGym {

	public static void main(String[] args) {
		
		/**
		 * 				name = Jimmy James
		 * 		g1 -->  membershipNumber = 100
		 *              cost = 7
		 *              paymentFrequency = 1 (PAY_AS_YOU_GO)
		 */
		Gym g1 = new Gym("Jimmy James", Gym.PAY_AS_YOU_GO);
		System.out.println("Cost : " + g1.calculateCost());  // 7
		System.out.println(g1);  // g1.toString()
		
		Gym g2 = new Gym();
		g2.setName("Donald Duck");
		System.out.println(g2);
		
		Gym g3 = new Gym("Christiano Ronaldo", 100);
		System.out.println(g3);
		
		int [] nums = {2, 4, 6, 8};
		
		System.out.println("-------------------------------");
		
		Gym [] memberships = {g1, g2, g3, 
							  new Gym("Paddy Smith", Gym.YEARLY),
							  new Gym("James Blunt", Gym.MONTHLY)
							 };
		
		for (int i = 0; i < memberships.length; i++) {
			System.out.println(memberships[i]);
		}
		
		System.out.println("---------- enhanced for loop ----------");
		
		for (Gym j: memberships) {
			System.out.println(j);
		}
	}
}