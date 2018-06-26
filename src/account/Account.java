package Account;

import java.util.Scanner;

abstract public class Account {

	protected double balance=15000;
	protected double monthly_interest;
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getMonthlyInterest(){
		return monthly_interest;
	}
	
	public void  Deposit (double amount){
		balance +=amount;
		System.out.println("Deposited succesfully");
	}
	
	public void withdrow (double amount){
		
		if(amount>balance)
			System.out.println("Cannot withdrow");
		else
			balance -= amount;
			System.out.println("Withdrow succesfully");
	}
	
	public abstract double getinterest();
	public abstract String toString();
			
	}
