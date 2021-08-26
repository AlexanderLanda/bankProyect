package entidades;

public abstract class Account {

	protected double balance;

	
	protected Account(double balance) {
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


	public boolean withdraw(double amt) {
		boolean result=true;
		if (amt>balance) {
			result=false;
		}
		else balance=balance-amt;
		
		return result;
	}

}
