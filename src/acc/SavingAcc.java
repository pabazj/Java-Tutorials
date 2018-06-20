package acc;

public class SavingAcc extends Account{

	String accountType= "Savings Account";
	protected double interest_rate=0.12;
	
	@Override
	public double getinterest() {
		tot =balance*interest_rate;
		System.out.println(tot);
		return tot;
	}

}
