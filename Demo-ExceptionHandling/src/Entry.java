import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) 
			throws FileNotFoundException,IOException, ClassNotFoundException{
		
		setValue(78);		//risky method call
		
/*		try{
			setValue(78);		//risky method call
		}catch(ArithmeticException e){
			e.printStackTrace();   // logged these messages into a file
		}
*/		
		saveValue(99);
		
		System.out.println("reached end of main()....");
	}
	
	static public void setValue(int value) throws ArithmeticException{
		
		System.out.println("inside setValue()...");
		
		int denominator = 0,ans = 0;
		
	/*	if(denominator > 0)
		{
			int ans = value/denominator;
		}else{
			System.out.println("cannot perform division");
		}*/
		try{
		 ans = value/0;
		}
		catch(Exception e){
//			e.printStackTrace();
			ans = 5;
		}
		
		System.out.println("reached end of setValue()...."+ans);
		
	}
	
	public static void saveValue(int value) throws FileNotFoundException,IOException, ClassNotFoundException{
		
//		throw new ClassCastException();
		throw new ClassNotFoundException();
		
		/*FileOutputStream fOut = null;
		try{
			fOut = new FileOutputStream("\\test\\something.txt");
			
		}finally{
			fOut.write((byte)value);
			System.out.println("Running clean-up code...");
		}*/
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		try{
			FileOutputStream fOut = new FileOutputStream("\\test\\something.txt");
			fOut.write((byte)value);
		}catch(FileNotFoundException fne){
			fne.printStackTrace();		// acting on exception in saveValue
			throw fne;						// giving chance to my caller to act
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Clean-up code...");
		}
*/		
	}
	
	
	
	
	
	
}
