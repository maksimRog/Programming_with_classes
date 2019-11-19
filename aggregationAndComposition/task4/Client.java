package task4;

public class Client {
	private String name;
	private Account[] accounts;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public Client(String name, Account[] accounts) {
		super();
		this.name = name;
		this.accounts = accounts;
	}

}
