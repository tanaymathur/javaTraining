import java.util.ArrayList;

public class Customer {
	private int id;
	private String name;
    ArrayList <Account> accountList = new ArrayList<Account>();
    
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addAccount(Account account){
		this.accountList.add(account);
	}
    
	public ArrayList<Account> getAccount(){
		return this.accountList;
	}
    
}
