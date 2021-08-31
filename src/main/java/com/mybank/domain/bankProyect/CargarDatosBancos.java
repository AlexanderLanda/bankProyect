package com.mybank.domain.bankProyect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entidades.Account;
import entidades.CheckingAccount;
import entidades.Customer;
import entidades.SavingsAccount;

public class CargarDatosBancos {


	ArrayList<String> datos = new ArrayList<String>();
	
	
	public void cargarDatos() {
		
		try {
			FileReader fr = new FileReader("datosClientes.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea ;
			while ((linea=br.readLine())!=null) {
				datos.add(linea);
					System.out.println(linea);
			}
		} catch (Exception  e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<Customer> crearClientes() {
		
		ArrayList<Customer> clientes = new ArrayList<Customer>();
		
		for (int i = 0; i < datos.size(); i++) {
			String aux = datos.get(i);
			Scanner sc = new Scanner(aux);
			sc.useDelimiter("#");
			sc.useLocale(Locale.ENGLISH);
			String nombre = sc.next();
			String apellido = sc.next();
			String fecha = sc.next();
			String tipo = sc.next();
			double saldo = sc.nextDouble();
			double interes = sc.nextDouble();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaFormatter = LocalDate.parse(fecha, dtf);
            
            if (tipo.equalsIgnoreCase("S")) {
            	Account[] cuentas = {new SavingsAccount(saldo, interes),null};
				Customer c = new Customer(nombre, apellido,cuentas , 1);
			    clientes.add(c);
            }
            else {
            	Account[] cuentas = {new CheckingAccount(saldo, interes),null};
				Customer c = new Customer(nombre, apellido,cuentas , 1);
				clientes.add(c);            
            }
				
            
		}
		return clientes;	
	}
	
}
