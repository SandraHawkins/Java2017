
public class MainForBankAccount {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("John Murphy", "Carlow", 50.50);
		System.out.println(b1);
		
		System.out.println("Deposit 200, new balance: " + b1.deposit(200));
		System.out.println("New balance " + b1.getBalance());
		System.out.println("Number of accounts " + BankAccount.accountCounter);
		
		b1.addInterest();
		System.out.println("New balance " + b1.getBalance());
		b1.deposit(200);
		System.out.println("New balance " + b1.getBalance());
		b1.withdraw(500);
		System.out.println("New balance " + b1.getBalance());
		b1.withdrawAll();
		System.out.println("New balance " + b1.getBalance());
		
		BankAccount b2 = new BankAccount("Freddy", "Blackrock, Co. Dublin");
		b2.deposit(1000);
		b2.addInterest();
		b2.withdraw(400);
		System.out.println(b2);
		System.out.println("Number of accounts : " + BankAccount.accountCounter);
	}
}
/** OUTPUT
Name=John Murphy, address=Carlow, accountNumber=50008000, balance=€50.50
Deposit 200, new balance: 250.5
New balance 250.5
Number of accounts 1
New balance 263.025
New balance 463.025
Insufficient funds
New balance 463.025
About to withdraw all, you have a balance of €463.03
New balance 0.0
Name=Freddy, address=Blackrock, Co. Dublin, accountNumber=50008001, balance=€650.00
Number of accounts : 2

*/
