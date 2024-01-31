import java.util.*;
public class Account {
	private int accountId;
	private Customer Cutomer;
	private double balance;
	private ArrayList<String> History = new ArrayList<>();
	
	public Account(Customer Customer, double balance) {
		this.setCutomer(Customer);
		this.accountId = Customer.getId();
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double value) {
		if (value > 0) {balance += value;}
		else {System.out.println("Cannot add a zero or negative value.");}
	}
	
	public int getId() {
		return this.accountId;
	}
	
	public String getCutomer() {
		return Cutomer.getName();
	}
	
	public void setCutomer(Customer cutomer) {
		Cutomer = cutomer;
	}
	
	public void setRecord(String record) {
		this.History.add(record);
	}
	
	public void History() {
		System.out.println(this.getCutomer()+" History: ");
		for(String record : this.History) {
			System.out.println(record);
		}
		System.out.println();
	}
}
