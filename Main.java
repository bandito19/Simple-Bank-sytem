public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		//first customer
		Customer c1 = new Customer("C1");
		bank.addCustomer(c1);
		bank.openAccount(c1, 1000.0);
		System.out.println("account id: " + c1.getId());
		bank.deposite(c1., 150);
		
		System.out.println();
		
		//second customer
		Customer c2 = new Customer("C2");
		bank.addCustomer(c2);
		bank.openAccount(c2, 13900.43);
		System.out.println("account id: " + c2.getId());
		System.out.println();
		
		
	}

}
