package Accounts;

public class SavingAccount extends Account{

	String accountType= "Savings Account";
	private double interest_rate=0.12;
	
	public SavingAccount(double amount) {
	}

	@Override
	public double getinterest() {
		monthly_interest =balance*interest_rate;
		return monthly_interest;
	}
	
	@Override
	public String toString(){
		return "Saving account has the balance of : "+ balance+ " and the interest per month is : " + monthly_interest;
		
	}

}

