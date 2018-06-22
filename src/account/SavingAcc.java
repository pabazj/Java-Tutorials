package account;

public class SavingAcc extends Account{

	String accountType= "Savings Account";
	protected double interest_rate=0.12;
	
	public SavingAcc(double amount) {
	}

	@Override
	public double getinterest() {
		monthly_interest =balance*interest_rate;
		System.out.println(monthly_interest);
		return monthly_interest;
	}
	
	@Override
	public String toString(){
		return "Saving account has the "+ balance+ " with the interest" + monthly_interest;
		
	}

}
