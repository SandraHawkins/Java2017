/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//MainForBankAccount.java
 */

public class MainForBankAccount {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Ted", "Finglas", 500);
		b1.deposit(200);
		
		/* 
		 * The withdraw method might throw a CannotBeOverdrawnException which
		 * is checked. If I call the withdraw() method, I have to deal with 
		 * this checked exception. I can surround the calling code in a try/ 
		 * catch and if the exception should occur, it will jump to the
		 * catch block below. 
		 */
		
		try {
			b1.withdraw(400);  // 300
			b1.withdraw(400);  // Exception occurs!
			// When an exception occurs, the following will NOT execute,
			// because execution will jump to the catch.
			System.out.println("New balance " + b1.getBalance());
			
		} catch (CannotBeOverdrawnException e) {
			System.out.println("Opps, not enough money");
			//e.printStackTrace();
			System.out.println("MESSAGE: " + e.getMessage());
		}
		System.out.println("New balance " + b1.getBalance()); // will execute
	}
}
