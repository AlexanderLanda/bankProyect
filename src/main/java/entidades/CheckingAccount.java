package entidades;

public class CheckingAccount extends Account {
	
	private double overdraftAmount; 

	public CheckingAccount(double initBalance, double 	overdraftAmount) { 
		super(initBalance); 
		this.overdraftAmount = overdraftAmount; 
	}

	public CheckingAccount(double initBalance) { 
		this(initBalance, 0.0); 
	} 
	
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	@Override
	public boolean withdraw(double amount) { 
		boolean result = true; 
		if ( balance < amount ) { 
			double overdraftNeeded = amount - balance; 
			if ( overdraftAmount < overdraftNeeded ) { 
				result = false; 
				} 
			else { 
				balance = 0.0; 
				overdraftAmount -= overdraftNeeded; 
				} 
			} else { 
				balance -= amount;
	          } 
		return result;
	}
}
