import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Assignment5 {
	public static void main(String[] args) throws IOException {
		
		String fileName = "output.txt";
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		PrintWriter write = new PrintWriter(fileName);
		do {
			System.out.println("Enter String");
			String s = input.readLine();
			if (s.equals("break"))
				break;
			int stringLength = s.length();
			String newString = "";
			
			  for (int it = 0; it < stringLength; it++) { 
				  Character ch = s.charAt(it);
				  newString+=(Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch));
				  
			  }
			 
//			newString = s.toUpperCase();
			write.println(newString);
//		System.out.println(newString);
		} while (true);
		write.flush();
		System.out.println("Program ended");
	}
}
