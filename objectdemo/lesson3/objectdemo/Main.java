package lesson3.objectdemo;

/**
 * The Main class is the driver class that in this package 
 * that coordinates construction and behavior of 
 * objects in this package.
 * 
 * @author pcorazza
 *
 */

//creating Main class 
public class Main {

//	main method()
	public static void main(String[] args) {
//		creating cust object of Customer class by passing "Bob" as a parameter to the constructor to intialize cust.name  
		Customer cust = new Customer("Bob");
//		Invoking createNewAccount() method on customer class to create an checkingAccount object of Account class
		cust.createNewAccount();
//		Invoke makeDeposit(5000) method on customer class to update the amount
		cust.makeDeposit(5000);
//		Invoke makeWithDrawal(1250) method on customer class to which deduct from the amount
		cust.makeWithDrawal(1250);
//		Invoke readCheckingAccountId() method on customer class to  get the checkingAccount.getId
		String id = cust.readCheckingAccountId();
		double bal = cust.checkBalance();
		System.out.printf("%s's Account ID: %s%n%s's balance: %.2f", 
				cust.getName(), id, 
				   cust.getName(), bal);

	}

}
