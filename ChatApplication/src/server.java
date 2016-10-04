import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {
		int port = 80;
		ServerSocket service = new ServerSocket(port);
		System.out.println("Waiting For clients");
		
		while(true){
			Socket clientAccept = service.accept();
			
		}

}
