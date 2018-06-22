package account;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter your acc number");  
			double amount = input.nextDouble();
			
			SavingAcc account=new SavingAcc(amount);
			
			System.out.println("Enter 1 for deposit and 2 for withdrow");
			int choice =input.nextInt();
			
			System.out.println("Amount for the transaction: ");
			amount =input.nextDouble();
			
			switch (choice){
				case 1:
					account.Deposit(amount);
					break;
				
				case 2:
					account.withdrow(amount);
					break;
			}
			
			System.out.println(account.toString());
			
			//Account savingAccount = new SavingAcc();
			//Account FixedAccount = new FixedAcc();
			
				 /*System.out.println("Enter your name");  
				 String name=input.next();
				 System.out.println("Enter your amount of deposit");  
				 double amount = input.nextDouble();
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
				 input.close();  */
			}
}
