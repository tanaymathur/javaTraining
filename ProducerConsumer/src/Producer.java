
public class Producer extends Thread{
	Container c ;
	public Producer(Container container) {
		// TODO Auto-generated constructor stub
		c=container;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			c.put();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Producer ended");
	}

}
