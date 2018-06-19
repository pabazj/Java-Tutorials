package acc;

public class FixedAcc extends Account {
	
	protected double interest_rate=0.18;
	protected double tot;

	@Override
	public double getinterest() {
		tot =balance*interest_rate;
		System.out.println(tot);
		return tot;
	}

}
