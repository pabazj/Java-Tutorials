package accounts;

public class Account {

private String name ="Pabasara";
private int account_number= 00010001;
protected double balance =15000;
private double interest_rate=0.08;

	//name
	public void setName(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	
	//account number
	public void set_account_number(int account_number){
		this.account_number = account_number;
	}
	public int get_account_number(){
		return account_number;
	}
	
	//balance
	public void setbalance(double balance){
		this.balance = balance;
	}
	public double getbalance(){
		return balance;
	}
	
	//interest_rate
	public void setinterest_rate(double interest_ratee){
		this.interest_rate = interest_rate;
	}
	public double getinterest_rate(){
		return interest_rate;
	}
	
	public double getinterest(){
		return balance*interest_rate;
	}
	public double current_balance(){
		return( getinterest()+getbalance());
	}
	
	public static void main(String[] args){
		System.out.println("Account owner= "+ new Account().getname());
		System.out.println("Account number= "+ new Account().get_account_number());
        System.out.println("Account interest= "+ new Account().getinterest());
        System.out.println("Account balance= "+new Account().current_balance());
        System.out.println("------------------------------------------------------------");
        System.out.println("Saving Account owner= "+ new SavingAcc().getname());
		//System.out.println("Saving Account number= "+ new SavingAcc().get_account_number());
        System.out.println("Saving account interest= "+ new SavingAcc().getinterest());
        System.out.println("Saving account balance= "+new SavingAcc().current_balance());
        System.out.println("------------------------------------------------------------");
        System.out.println("Fixed Account owner= "+ new FixedAcc().getname());
		//System.out.println("Fixed Account number= "+ new FixedAcc().get_account_number());
        System.out.println("Fixed account interest= "+ new FixedAcc().getinterest());
        System.out.println("Fixed account balance= "+new FixedAcc().current_balance());
    }

}
