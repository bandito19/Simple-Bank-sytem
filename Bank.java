
import java.util.*;
public class Bank {
	private List<Customer> customers;
	private List<Account> accounts;
	
	public Bank() {
		this.customers = new ArrayList<>();
		this.accounts = new ArrayList<>();
	}
	
	public void addCustomer(Customer cutomer) {
		customers.add(cutomer);
		System.out.println("Customer " + cutomer.getName() + " Added.");
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
	
	public void openAccount(Customer customer, double balance) {
		if (balance > 0) {Account account = new Account(customer, balance);
		accounts.add(account);
		System.out.println("account for " + customer.getName() + " created");
		System.out.println("Balance: " + account.getBalance());}
		else {System.out.println("Cannot add a zero or negative value.");}
		
	}
	
	public void deposite(Account account, double amount) {
		if (amount > 0) {account.setBalance(account.getBalance() + amount);}
		else {System.out.println("Cannot add zero or negative value.");}
	}
	
	public void withdraw(Account account, double amount) {
		if (amount <= 0) {System.out.println("Cannot withdraw zero or negative value.");}
		if (amount < account.getBalance()) {
			System.out.println("You don't have that much in your balance.");
		}
		account.setBalance(account.getBalance() - amount);
	}
	
	public void transfer(Account account1, Account account2, double amount) {
		account2.setBalance(account2.getBalance() + amount);
		account1.setBalance(account1.getBalance() - amount);
	}
}
