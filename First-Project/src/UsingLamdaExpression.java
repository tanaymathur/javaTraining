
public class UsingLamdaExpression {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		
		Thread t= new Thread(r);
		t.start();
		Runnable r1 =()-> System.out.println(Thread.currentThread().getName());
		r1.run();
	}
}

IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();