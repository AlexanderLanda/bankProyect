package entidades;

public class Customer {

	private String firstName;
	private String lastName;
	private Account[] account = new Account[10];
	private int numberOfAccounts;
	
	
	public Customer(String firstName, String lastName, Account[] account, int numberOfAccounts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
		this.numberOfAccounts=numberOfAccounts;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}



	public Account getAccount(int index) {
		return account[index];
	}


	public void addAccount(Account account) {
		numberOfAccounts++;
		this.account[numberOfAccounts] = account;
		
	}


	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	
	
}
