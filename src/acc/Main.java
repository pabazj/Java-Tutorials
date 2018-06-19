package acc;

public class Main {
	
public static void main(String[] args){
		
		Account savingAccount =new SavingAcc();
		savingAccount.Deposit ();
		savingAccount.withdrow();
		savingAccount.getinterest();
		
		Account FixedAccount =new FixedAcc();
		FixedAccount.Deposit ();
		FixedAccount.withdrow();
		FixedAccount.getinterest();
	}

}
