
public class Account {
	private int accountId;
	private int balance;
	private Customer customer;
	
	public Account(int accountId, int balance, Customer customer) {
		this.accountId = accountId;
		this.balance = balance;
		this.customer = customer;
		Bank.setBankBalance(balance);
	}
	
	
	public boolean deposit(int amount){
		this.balance+=amount;
//		Bank.setBankBalance(amount);
		Bank.totalBalance+=amount;
		return true;
	}
	
	public boolean withdraw(int amount){
		if(this.balance >= amount ){
			this.balance-=amount;
//			Bank.setBankBalance(-1*amount);
			Bank.totalBalance-=amount;
			return true;
		}else{
			return false;
		}
			
	}
	
	public int getBalance(){
		return this.balance;
	}
	


}
