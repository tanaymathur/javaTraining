
interface Interface2 {
	default void show(){
		System.out.println("From Interface");
	}
}

class Test implements Interface2{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Test Implement");
	}
}

public class I{
	public static void main(String args[]){
		Interface2 obj = new Test();
		 obj.show();
	}
}
