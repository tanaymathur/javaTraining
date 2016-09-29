
public class Entry {
	public static void main(String[] args) {
		
		Container container = new Container();
		
		for(int it=0;it<2;it++){			
			new Consumer(container).start();
			new Producer(container).start();
		}
		/*Thread producer = new Producer();
		Thread consumer = new Consumer();
		producer.start();
		consumer.start();*/
	}

}
