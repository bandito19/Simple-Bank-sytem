import java.util.Random;

public class Customer {
	private String name;
	private int customerId;
	private Account account;
	public Customer(String name, Account account) {
		this.name = name;
		this.customerId = createId();
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return customerId;
	}
	public int createId() {
		Random random = new Random();
		int n1 = random.nextInt(100);
		int n2 = random.nextInt(100);
		int n3 = random.nextInt(100);
		int id = (100 * n1) + (10 * n2) + n3;
		return id;
	}
	public Account getAccount() {
		return this.account;
	}
	

}
