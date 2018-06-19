package acc;

abstract public class Account {

	String name;
	int account_number;
	double balance =15000;
	double interest_rate=0.0;
	int deposits = 0;
	int withDrawals = 0;
	
	public void Deposit (){
		System.out.println("Deposited succesfully");
	}
	
	public void withdrow  (){
		System.out.println("Withdrow succesfully");
	}
	
	public abstract double getinterest();
		
}
