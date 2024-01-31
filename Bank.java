import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		System.out.println("Customer " + customer.getName() + " Removed.");
	}
	
	public void openAccount(Customer customer, double balance) {
		if (balance > 0) {Account account = new Account(customer, balance);
		accounts.add(account);
		System.out.println("account for " + customer.getName() + " created");
		System.out.println("Balance: " + account.getBalance());}
		else {System.out.println("Cannot add a zero or negative value.");}
		
	}
	
	public void deposite(Account account, double amount) {
		if (amount > 0) {account.setBalance(account.getBalance() + amount);
		account.setRecord(amount +" Deposited in " + getDate());}
		else {System.out.println("Cannot add zero or negative value.");}
	}
	
	public void withdraw(Account account, double amount) {
		if (amount <= 0) {System.out.println("Cannot withdraw zero or negative value.");}
		else if (amount < account.getBalance()) {
			System.out.println("You don't have that much in your balance.");
		}
		else {account.setBalance(account.getBalance() - amount);}
	}
	
	public void transfer(Account account1, Account account2, double amount) {
		if (amount > 0 && amount < account1.getBalance()) {
			account2.setBalance(account2.getBalance() + amount);
			account1.setBalance(account1.getBalance() - amount);
		}
		else {System.out.println("Invalid transfer.");}
	}
	
	public String getDate() {
		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();

		DateTimeFormatter mydate = DateTimeFormatter.ofPattern("E,dd MMM YYY");
		DateTimeFormatter mytime = DateTimeFormatter.ofPattern("HH mm SS");

		String date = today.format(mydate);
		String t =time.format(mytime);
		String dateAndTime = date + " " + t;
		
		return dateAndTime;}
}
