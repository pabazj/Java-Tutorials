package acc;

import java.util.Scanner;

abstract public class Account {

	public String accountType; 
	double balance =15000;
	double interest_rate;
	int deposits = 0;
	int withDrawals = 0;
	static double amount =0;
	double tot;
	
	public double Deposit (){
		balance = balance + amount;
		System.out.println("Deposited succesfully");
		return balance;
	}
	
	public double withdrow (){
		balance = balance - amount;
		System.out.println("Withdrow succesfully");
		return balance;
	}
	
	public abstract double getinterest();
	
	public static void main(String[] args){
			
			Scanner input=new Scanner(System.in);  
			
			Account savingAccount =new SavingAcc();
			Account FixedAccount =new FixedAcc();
			
			 System.out.println("Enter your name");  
			 String name=input.next();
			 System.out.println("Enter your amount of deposit");  
			 amount = input.nextDouble();
			 amount =savingAccount.Deposit();
			 System.out.println("Your current balance is : "+ amount);
			 System.out.println("Enter your amount of withdrow");  
			 amount = input.nextDouble();
			 amount =savingAccount.withdrow();
			 System.out.println("Your current balance is : "+ amount);
			 double interest = savingAccount.getinterest();
			 System.out.println("----------------------------------------");
			 System.out.println("DETAILS");
			 System.out.println(" Hi "+name + ", " + amount + " is your current balance of  your account and your interest per month is "+ interest);
			 input.close();  
		}
			
	}
