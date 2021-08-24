package entidades;

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;
	
	
	public Customer(String firstName, String lastName, Account account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}



	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
