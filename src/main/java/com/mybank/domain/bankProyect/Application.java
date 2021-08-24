package com.mybank.domain.bankProyect;

import java.security.AccessControlContext;

import entidades.Account;
import entidades.Customer;

public class Application
{
	public static void main( String[] args )
	{
		Customer cliente = new Customer("Luis","Ramos", new Account(500.0));
		System.out.println("Sacar 150 "+cliente.getAccount().whitdraw(150.0));
		System.out.println("Ingresar 22.50 "+cliente.getAccount().deposit(22.50));
		System.out.println("Sacar 47.62 "+cliente.getAccount().whitdraw(47.62));
		System.out.println("Sacar 400.0 "+cliente.getAccount().whitdraw(400.0));
		System.out.println("Customer "+cliente.getFirstName()+" tiene un saldo de "+cliente.getAccount().getBalance());
	}
}