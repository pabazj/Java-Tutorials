package Accounts;

public class FixedAccount extends Account {
	
	String accountType= "Fixed Account";
	private double interest_rate=0.18;

	public void setInterestRate(double interest_rate){
		this.interest_rate = interest_rate;
	}
	@Override
	public double getinterest() {
		monthly_interest =balance*interest_rate;
		return monthly_interest;
	}
	
	public String toString(){
		return "Fixed account has the balance of : "+ balance+ " and the interest per month is : " + monthly_interest;
		
	}

}

