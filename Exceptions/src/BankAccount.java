/**
 * To demonstrate exceptions, the withdraw() method might throw a 
 * CannotBeOverdrawnException if the amount to withdraw is more than the 
 * balance. CannotBeOverdrawnException extends from Exception, is therefore
 * a checked exception and must be declared in the method header where the
 * throw new XxxException() code is. In main() where the withdraw()
 * method is called, this code must be surrounded in a try/ catch.
 **/
public class BankAccount {
	
	/* Member variables */
	private String name;
	private String address;
	private int accountNumber;
	private double balance;
	
	/* Static/ class variables */
	private static final double INTEREST_RATE = 5;
	public static int accountCounter;
	private static int accountNumberHolder = 50008000;
	
	/**
	 * A private constructor cannot be called from outside this class.
	 * It is used to set up some defaults, i.e. increment the counter,
	 * assign the next account number in sequence and increment that
	 * counter for the next account.
	 * This constructor is private so that when a BankAccount is created,
	 * at the very minimum you must specify a name and address. 
	 */
	private BankAccount() {
		accountCounter++;
		accountNumber = accountNumberHolder++;
	}
	
	/**
	 * There are two ways to create a BankAccount object: by calling
	 * this constructor and passing in the name and address or by
	 * calling the constructor underneath and passing in a deposit
	 * amount along with the name and address. 
	 */
	public BankAccount(String name, String address) {
		this();
		this.name = name;
		this.address = address;
	}

	/**
	 * This constructor creates a BankAccount object and takes in a 
	 * name, address and amount to deposit into the bank account.
	 */
	public BankAccount(String name, String address, double balance) {
		this();
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Deposit() takes an amount, ensures it is a positive number
	 * and adds it to the balance. 
	 */
	public double deposit(double amount) {
		if (amount > 0)
			balance += amount;
		else 
			System.out.println(amount + " can not be negative");
		return balance;
	}
	
	/**
	 * The withdraw method takes in an amount. If that amount is greater than 
	 * the balance, a CannotBeOverdrawnException is thrown, the calling code 
	 * must then deal with this by placing a try/ catch around it. See main(). 
	 */
	public double withdraw(double amount) throws CannotBeOverdrawnException {
		
		if (amount > balance) 
			throw new CannotBeOverdrawnException("You don't have that much money!,"
					+ " attempting to withdraw " + amount
					+ " balance is : " + balance);
		else 
			balance = balance - amount;
		return balance;
	}
	
	/**
	 * This method prints that it is about to withdraw all the money 
	 * and sets the balance to 0.
	 */
	public void withdrawAll() {
		System.out.printf("About to withdraw all, you have a balance "
				+ "of €%.2f\n", balance);
		balance = 0;
	}
	
	/**
	 * When called on a BankAccount object, it will add on the interest.
	 **/
	public double addInterest() {
		balance = balance + (balance * (INTEREST_RATE / 100));
		return balance;
	}

	/**
	 * Returns a string containing all of the member variables.
	 */
	@Override
	public String toString() {
		return "Name=" + name + 
				", address=" + address + 
				", accountNumber=" + accountNumber + 
				String.format(", balance=€%.2f", balance);
	}	
}