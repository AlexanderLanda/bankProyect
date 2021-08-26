package com.mybank.domain.bankProyect;

import java.security.AccessControlContext;

import entidades.Account;
import entidades.CheckingAccount;
import entidades.Customer;
import entidades.SavingsAccount;

public class Application
{
	public static void main( String[] args )
	{
		Customer cliente = new Customer("Jane","Smith", new SavingsAccount(500.0, 0.3));
		Customer cliente2 = new Customer("Owen","Bryant", new CheckingAccount(500.0, 0));
		Customer cliente3 = new Customer("Tim","Soley", new CheckingAccount(500.0, 500.0));
		Customer cliente4 = new Customer("Maria","Soley", cliente3.getAccount());
		System.out.println("-----------------Jane Smith-----------------");
		System.out.println("Sacar 150 "+cliente.getAccount().withdraw(150.0));
		System.out.println("Ingresar 22.50 "+cliente.getAccount().deposit(22.50));
		System.out.println("Sacar 47.62 "+cliente.getAccount().withdraw(47.62));
		System.out.println("Sacar 400.0 "+cliente.getAccount().withdraw(400.0));
		System.out.println("Customer "+cliente.getFirstName()+" tiene un saldo de "+cliente.getAccount().getBalance());
	
		System.out.println("-----------------Owen Bryant-----------------");
		System.out.println("Sacar 150 "+cliente2.getAccount().withdraw(150.0));
		System.out.println("Ingresar 22.50 "+cliente2.getAccount().deposit(22.50));
		System.out.println("Sacar 47.62 "+cliente2.getAccount().withdraw(47.62));
		System.out.println("Sacar 400.0 "+cliente2.getAccount().withdraw(400.0));
		System.out.println("Customer "+cliente2.getFirstName()+" tiene un saldo de "+cliente2.getAccount().getBalance());
	
		System.out.println("-----------------Tim Soley-----------------");
		System.out.println("Sacar 150 "+cliente3.getAccount().withdraw(150.0));
		System.out.println("Ingresar 22.50 "+cliente3.getAccount().deposit(22.50));
		System.out.println("Sacar 47.62 "+cliente3.getAccount().withdraw(47.62));
		System.out.println("Sacar 400.0 "+cliente3.getAccount().withdraw(400.0));
		System.out.println("Customer "+cliente3.getFirstName()+" tiene un saldo de "+cliente3.getAccount().getBalance());
	
		System.out.println("-----------------Maria Soley-----------------");
		System.out.println("Ingresar 150.0 "+cliente4.getAccount().deposit(150.0));
		System.out.println("Sacar 750.0 "+cliente4.getAccount().withdraw(750.0));
		System.out.println("Customer "+cliente4.getFirstName()+" tiene un saldo de "+cliente4.getAccount().getBalance());
	
	}
}