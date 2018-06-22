package account;

import java.util.Scanner;

abstract public class Account {

	public enum AccountType{
		Saving,
		Fixed
	}
	//public String accountType; 
	double balance=15000;
	double interest_rate;
	//double amount =0;
	double monthly_interest;
	
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
