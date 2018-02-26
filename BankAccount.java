/* Lauren Choi
 * AP CS A 0 period
 * BankAccount: this class will create a bank account and let users change their data.
 * December 7th, 2017
 */


public class BankAccount {

	// initializing variables
	private int accountNumber;
	private double balance;
	private String accountName;
	private double money;
	
	// default constructor
	public BankAccount () {
		accountNumber = 0;
		balance = 0;
		accountName = "______";
	}
	
	// overloaded constructor
	public BankAccount (int accountNumber, double balance, String accountName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountName = accountName;
	}
	
	// accessor method for accountNumber
	public int getAccountNumber () {
		return accountNumber;
	}
	
	// accessor method for balance
	public double getBalance () {
		return balance;
	}
	
	// accessor method for accountName
	public String getAccountName () {
		return accountName;
	}
	
	// mutator method for changing account number
	public void setAccountNumber (int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// mutator method for setting initial balance
	public void setInitialBalance (double balance) {
		this.balance = balance;
		System.out.println("You have set your initial balance to " + balance + ".");
	}
	
	// mutator method for changing account name
	public void setAccountName (String accountName) {
		this.accountName = accountName;
		System.out.println("You have set your account name to " + accountName + ".");
	}
	
	// mutator method for adding money to bank account
	public void addMoney (double money) {
		balance += money;
		System.out.println("You have deposited " + money + " dollars in your account.");
	}
	
	// mutator method for pulling money from bank account
	public void pullMoney (double money) {
		if (money >= balance) {
			System.out.println("Warning: you are overdrawing " + Math.abs(money - balance) + " dollars from your account.");
		}
		balance -= money;
	}
	
	// toString method for returning data in format
	public String toString () {
		return "Hello, " + accountName + ". Your account number is " + accountNumber + ". You have " + balance + " dollars.";
	}
	
}
