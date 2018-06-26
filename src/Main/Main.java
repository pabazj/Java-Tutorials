package Main;

import java.util.Scanner;

import Account.SavingAccount;

public class Main {
	
	public static void main(String[] args){
		
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter your acc number");  
			double amount = input.nextDouble();
			
			SavingAccount account=new SavingAccount(amount);
			
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
			account.getinterest();
			System.out.println(account.toString());
			
			}
}

