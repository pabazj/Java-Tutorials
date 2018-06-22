package account;

public class FixedAcc extends Account {
	
	String accountType= "Fixed Account";
	protected double interest_rate=0.18;

	@Override
	public double getinterest() {
		monthly_interest =balance*interest_rate;
		return monthly_interest;
	}
	
	public String toString(){
		return "Fixed account has the balance of : "+ balance+ " and the interest per month is : " + monthly_interest;
		
	}

}
