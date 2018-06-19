package acc;

public class SavingAcc extends Account{

	protected double interest_rate=0.12;
	protected double tot;
	
	@Override
	public double getinterest() {
		tot =balance*interest_rate;
		System.out.println(tot);
		return tot;
	}

}
