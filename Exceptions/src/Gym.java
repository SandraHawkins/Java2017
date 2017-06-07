/** 
 * Author: Sandra Hawkins
 * Date:   17 May 2017
 * ExerciseSolutions/sheet5Classes/Gym.java
 */ 

public class Gym {
	
	/* Member variables */
	private String name;
	private int membershipNumber;
	private double cost;
	private int paymentFrequency;  // Pay as you go/ Monthly/ Yearly
	
	/* Static/ class variables which should be used for the 
	 * payment frequency*/
	public static final int PAY_AS_YOU_GO = 1;
	public static final int MONTHLY = 2;
	public static final int YEARLY = 3;
	
	/* Used to assign a value to each object's membership number and
	 * this variable keeps track of the number for the next membership. */
	private static int membershipCounter = 100;
	
	/* Constructors */
	/* This constructor sets up the membership number and increment
	 * the static variable for the next membership. */
	public Gym() {
		membershipNumber = membershipCounter++;
		// Setting a default, the most common type of payment
		paymentFrequency = MONTHLY; 
		calculateCost(); // to ensure the cost is calculated for a new member
	}
	
	/* The code in this constructor calls the setPaymentFrequency() 
	 * method, it might throw an exception, it is a checked exception
	 * and therefore, this method need to declare that it too might
	 * throw an exception.
	 * */
	public Gym(String name, int paymentFrequency) 
						throws InvalidPaymentFrequencyException {
		this();
		this.name = name;
		//this.paymentFrequency = paymentFrequency;
		/* the set method might throw a InvalidPaymentFrequency, therefore
		 * this method / constructor must declare that it too might
		 * throw an InvalidPaymentFrequency  */
		setPaymentFrequency(paymentFrequency);
		calculateCost(); // to ensure the cost is calculated for a new member
	}
	
	/* Accessor method */
	// No setter for membership number, it will be set up automatically
	// in the constructor
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * If the argument passed in is not one of PAY_AS_YOU_GO, MONTHLY or
	 * YEARLY then an InvalidPaymentFrequencyException is thrown. This is a
	 * checked exception (it extends from Exception) and therfore this method
	 * must declare that it might throw an InvalidPaymentFrequencyException, 
	 * as is underneath in the method declaration.  
	 */
	public void setPaymentFrequency(int paymentFrequency) 
								throws InvalidPaymentFrequencyException {
		
		switch (paymentFrequency) {
			case PAY_AS_YOU_GO:
			case MONTHLY:
			case YEARLY:
				this.paymentFrequency = paymentFrequency;
				break;
	
			default:
				/* If a method might throw a checked exception, it must
				 * declare it, i.e. throws InvalidPaymentFrequency in
				 * the method header. */
				throw new InvalidPaymentFrequencyException(
						paymentFrequency + " is not valid");
		}
	}
	
	public int getPaymentFrequency() {
		return paymentFrequency;
	}
	
	public int getMembershipNumber() {
		return membershipNumber;
	}
	
	public double calculateCost() {
		double yearly = 350;
		
		if (paymentFrequency == PAY_AS_YOU_GO)
			cost = yearly / 50;
		else if (paymentFrequency == YEARLY)
			cost = yearly;
		else // Monthly
			cost = yearly / 12 * 1.2;
		return cost;
	}
	
	private String getPaymentFrequencyAsString() {
		switch (paymentFrequency) {
			case PAY_AS_YOU_GO:
				return "pay as you go";
			case YEARLY:
				return "yearly";
			default:
				return "monthly";
		}
	}
	
	/* toString() */
	@Override
	public String toString() {
		return "\nName: " + name +
				"\nMembership number: " + membershipNumber +
				String.format("\nCost: €%.2f", calculateCost()) +
				"\nPayment Frequency: " + getPaymentFrequencyAsString();
	}
}