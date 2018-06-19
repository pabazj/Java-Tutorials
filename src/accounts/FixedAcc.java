package accounts;

public class FixedAcc extends Account {

	private double interest_rate=0.16 ;
	private int account_number= 00030003;
	
	public FixedAcc(){
		
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
