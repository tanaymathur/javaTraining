import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.ws.Response;


public class MyHttpService {

	public static void main(String[] args) throws IOException {
		int port=1337;
		ServerSocket service = new ServerSocket(port);
		System.out.println("Waiting for a connection");
		Socket clientInfo = service.accept();
		System.out.println(clientInfo);
		
		InputStream in= clientInfo.getInputStream();   //InputStream is byte type
		
		
		InputStreamReader bridge = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(bridge);
		
		OutputStream os = clientInfo.getOutputStream();		
		PrintWriter bridge1 = new PrintWriter(os);
		
		
		while(true){
			String line = bReader.readLine();
			
		
			

			if(line.isEmpty())
				break;
			System.out.println("##"+line);
			
			bridge1.println("<p>Hello</p>");
//			bridge1.flush();
			
			
//			os.p
			/*OutputStreamWriter bridgeOut = new OutputStreamWriter(out);
			PrintWriter
			clientInfo.*/
//			clientInfo.close();
		}
		bridge1.close();
		
		
	}
}