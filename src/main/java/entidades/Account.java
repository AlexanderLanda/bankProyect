package entidades;

public class Account {

	private double balance;

	
	public Account(double balance) {
		super();
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}



	public boolean deposit( double amt) {

		boolean result=true;
		if (amt<0) {
			result=false;
		}
		else balance=balance+ amt;
		
		return result;
	}

	public boolean whitdraw( double amt) {

		boolean result=true;
		if (amt>balance) {
			result=false;
		}
		else balance=balance-amt;
		
		return result;
	}

}
