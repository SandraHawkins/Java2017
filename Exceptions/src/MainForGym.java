/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//MainForGym.java
 */

public class MainForGym {

	public static void main(String[] args) {

		/* 
		 * If you call a method/ constructor that might throw a checked
		 * exception, you will need to deal with it:
		 * 
		 * - place a try/ catch around the calling code:
		 **/
		try {
			Gym g1 = new Gym("Bob", 7);
			System.out.println(g1);
			
		} catch (InvalidPaymentFrequencyException e) {
			System.out.println(e.getMessage()); // 7 is not valid
			
			e.printStackTrace(); // red text
		}
		
		Gym g2 = new Gym();
		try {
			/* Again, calling this method, might throw a checked exception,
			 * therefore the catch below the method call, will catch the
			 * exception if it is thrown. */
			g2.setPaymentFrequency(Gym.MONTHLY);
		} catch (InvalidPaymentFrequencyException e) {
			System.out.println("Got the pay freq wrong");
			e.printStackTrace();
		}
		System.out.println(g2);
	}
}
