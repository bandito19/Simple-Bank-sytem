

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Customer mahmoud = new Customer("Mahmoud", 19);
		
		bank.addCustomer(mahmoud);
		
		bank.openAccount(mahmoud, 100.0);
	}

}
