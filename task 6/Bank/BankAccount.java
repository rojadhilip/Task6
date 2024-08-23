package com.Bank;

public class BankAccount {
	public String Accountnumber;
	public String AccountHolderName;
	public double balance;
	public BankAccount(String accountnumber, String accountHolderName, double balance) {
		super();
		this.Accountnumber = accountnumber;
		this.AccountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		Accountnumber = accountnumber;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;

			System.out.println("deposit:"+amount);
			System.out.println("New balance:"+amount);
		}
		else {
		
			System.out.println("Invaild currency") ;
		}
		}
		 public void withdraw (double amount) {
				if(amount>0&& amount<=balance) {
					balance= balance-amount;
					System.out.println("Withdraw:"+amount);
					System.out.println("New balance:"+amount);
				}
                     else {
                     
                    	 System.out.println("Insufficdent balance");
                     }
				
		 }	 
                    	 
                    	 public void displaydetails() {
                    		 System.out.println("accountnumber:"+Accountnumber);
                    		 System.out.println("accountholdername:"+AccountHolderName);
                    	 
					
					
				
			
		}
	}
	


