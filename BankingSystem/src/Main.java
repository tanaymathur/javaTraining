import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("Barclays");
		Teller teller = new Teller(1, bank);

		Customer saurbh = new Customer(0, "Saurabh");
		Customer tanay = new Customer(1, "Tanay");
		Customer arnav = new Customer(2, "Arnava");

		Account account1 = new Account(0, 1000000, tanay);
		tanay.addAccount(account1);
		Account account2 = new Account(1, 500000, saurbh);
		saurbh.addAccount(account2);
		Account account3 = new Account(2, 7000, arnav);

		teller.transfer(account1, account2, 4000);
//		System.out.println(account1.getBalance() + "    " + account2.getBalance()+"  Bank Balance:"+Bank.totalBalance);
		Random randomGenerator = new Random();
		for(int x=0;x<100;x++){
			
			new Thread() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
				/*	String fromAccount = "account"+new Integer(randomGenerator.nextInt(3)).toString();
					String toAccount = "account"+new Integer(randomGenerator.nextInt(3)).toString();
					int amount = randomGenerator.nextInt(3000); */
					teller.transfer(account1, account2, 4000);
					//System.out.println(account3.getBalance() + "    "+account1.getBalance() + "    " + account2.getBalance()+"  Bank Balance:"+Bank.totalBalance);
					
				}
			}.start();
		}
		
		/*Thread t1 = 
		t1.start();
		Thread t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				teller.transfer(account1, account2, 2000);
				System.out.println(account3.getBalance() + "    "+account1.getBalance() + "    " + account2.getBalance()+"  Bank Balance:"+Bank.totalBalance);
			}
		};
		t2.start();
		Thread t3 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				teller.transfer(account2, account3, 2000);
				System.out.println(account1.getBalance() + "    "+account2.getBalance() + "    " + account3.getBalance()+"  Bank Balance:"+Bank.totalBalance);
			}
		};
		t3.start();
		Thread t4 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				teller.transfer(account2, account1, 2000);
				System.out.println(account3.getBalance() + "    "+account2.getBalance() + "    " + account1.getBalance()+"  Bank Balance:"+Bank.totalBalance);
			}
		};
		t4.start();
		Thread t5 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				teller.transfer(account3, account1, 2000);
				System.out.println(account2.getBalance() + "    "+account3.getBalance() + "    " + account1.getBalance()+"  Bank Balance:"+Bank.totalBalance);
			}
		};
		t5.start();
		Thread t6 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				teller.transfer(account1, account3, 2000);
				System.out.println(account2.getBalance() + "    "+account1.getBalance() + "    " + account3.getBalance()+"  Bank Balance:"+Bank.totalBalance);
			}
		};
		t6.start();*/
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***"+Bank.totalBalance +"***");
		
	}

}
