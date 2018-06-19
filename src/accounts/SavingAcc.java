package accounts;

public class SavingAcc extends Account {
	
	private double interest_rate=0.12 ;
	private int account_number= 00020002;

	public SavingAcc(){
		
	}
	
	public double getinterest_rate(){
		return interest_rate;
	}
	
	public int get_account_number(){
		return account_number;
	}

	public double getinterest(){
		return balance*interest_rate;
	}
	
}
