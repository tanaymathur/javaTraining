
public class Teller {
	private int id;
	private Bank bankReference;
	
	public Teller(int id, Bank bankReference) {
		this.id = id;
		this.bankReference = bankReference;
	}
	
	public void transfer(Account from, Account to, int amount){
		this.bankReference.transfer(from, to, amount);
	}
	
	
}
