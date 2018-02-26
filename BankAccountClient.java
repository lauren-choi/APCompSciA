/* Lauren Choi
 * AP CS A 0 period
 * BankAccountClient: testing all methods and constructors in BankAccount class
 * December 7th, 2017
 */


public class BankAccountClient {

	public static void main(String[] args) {
		
		// testing default constructor
		BankAccount account1 = new BankAccount();
		System.out.println(account1.toString());
		
		// testing overloaded constructor
		BankAccount account2 = new BankAccount(47162, 150000.00, "Bob Jones");
		System.out.println(account2.toString());
		
		// getting account2's accountNumber, accountName, and balance
		System.out.println(account2.getAccountName());
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getBalance());
		
		// setting account1's accountNumber, accountName, and balance
		account1.setAccountName("Jane Doe");
		account1.setAccountNumber(81262);
		account1.setInitialBalance(100.00);
		
		// adding money to account2
		account2.addMoney(89129);
		
		// pulling money from account1
		account1.pullMoney(83838);
		
	}

}
