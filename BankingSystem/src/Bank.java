import java.util.ArrayList;

public class Bank {
	
	private String bankName;
	static int totalBalance=0;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	public static void  setBankBalance(int amount){ //System.out.println("##"+amount);
		totalBalance+=amount;
	}
	
	public void addAccount(Account account){
		this.accountList.add(account);
	}
    
	
	public void transfer(Account fromAccount, Account toAccount,int amount){
		
		if(fromAccount.withdraw(amount)){
			toAccount.deposit(amount);
		}
	}
  
}
