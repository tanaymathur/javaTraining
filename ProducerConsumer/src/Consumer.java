
public class Consumer extends Thread {
	Container c;
	public Consumer(Container container) {
		// TODO Auto-generated constructor stub
		c = container;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			c.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
