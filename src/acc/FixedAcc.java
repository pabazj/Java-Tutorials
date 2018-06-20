package acc;

public class FixedAcc extends Account {
	
	String accountType= "Fixed Account";
	protected double interest_rate=0.18;

	@Override
	public double getinterest() {
		tot =balance*interest_rate;
		return tot;
	}

}
