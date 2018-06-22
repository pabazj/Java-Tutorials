package account;

public class SavingAcc extends Account{

	String accountType= "Savings Account";
	protected double interest_rate=0.12;
	
	public SavingAcc(double amount) {
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
