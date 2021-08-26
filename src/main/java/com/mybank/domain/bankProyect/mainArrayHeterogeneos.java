package com.mybank.domain.bankProyect;

import java.util.Iterator;

import entidades.Account;
import entidades.CheckingAccount;
import entidades.Customer;
import entidades.SavingsAccount;

public class mainArrayHeterogeneos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account[] cuentasJane = {new SavingsAccount(500.0, 0),new CheckingAccount(200.0, 0)};
		Customer jane = new Customer("Jane","Simms", cuentasJane, cuentasJane.length);
	
		Account[] cuentasBryant = {new CheckingAccount(200.0, 0)};
		Customer bryant = new Customer("Bryant","Owen", cuentasBryant, cuentasBryant.length);
	
		Account[] cuentasTim= {new SavingsAccount(1500.0, 0),new CheckingAccount(200.0, 0)};
		Customer soley = new Customer("Soley","Tim", cuentasTim, cuentasTim.length);
	
		Account[] cuentasMaria = {new SavingsAccount(200.0, 0),new CheckingAccount(150.0, 0)};
		Customer maria = new Customer("Maria","Tim", cuentasMaria, cuentasMaria.length);
	
		Customer[] clientes = {jane,bryant,soley,maria};
		
		for (int i = 0; i < clientes.length; i++) {
			System.out.println("Customer: "+clientes[i].getLastName()+" , "+clientes[i].getFirstName());
			for (int j = 0; j < clientes[i].getNumberOfAccounts(); j++) {
				if (clientes[i].getAccount(j) instanceof SavingsAccount) {
					System.out.println("SavingsAccount current balance is : "+clientes[i].getAccount(j).getBalance());
				}
				else {
					System.out.println("CheckingAccount current balance is : "+clientes[i].getAccount(j).getBalance());
						
				}
			}
			System.out.println("----------------------------");
			
		}
	}

}
