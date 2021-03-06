
public class Container {
	private static int size=0;
	
	public static int getSize(){
		return size;
	}
	
	synchronized public void get() throws InterruptedException{
		while(size==0){
			System.out.println("Consumer waiting");
			this.wait();
			System.out.println("Consumer notified");
		}
		size=0;
		System.out.println("Consumer ended");
		this.notify();
		
	}
	
	synchronized public  void put() throws InterruptedException{
		while(size==1){
			System.out.println("Producer Waiting");
			this.wait();
			System.out.println("Producer Notified");
		}
		size=1;
		System.out.println("Producer ended");
		this.notify();
		
	}
	
	
}
