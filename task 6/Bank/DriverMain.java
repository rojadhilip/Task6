package com.Bank;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new bank account
		BankAccount Account=new BankAccount("1234","janvika",6000);
		Account.displaydetails();
		//deposit 	amount into account	
		Account.Deposit(10000);
		// withdraw a amount into account
		System.out.println(".......");
		Account.withdraw(2000);
		System.out.println("......");

	}

}
