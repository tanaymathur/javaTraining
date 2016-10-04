import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		int port = 80;
		Socket clientInfo = new Socket("localhost", port);
		
		System.out.println(clientInfo);

		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		InputStream in = clientInfo.getInputStream();

		InputStreamReader bridge = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(bridge);

		OutputStream os = clientInfo.getOutputStream();
		PrintWriter bridge1 = new PrintWriter(os);

		while (true) {
			String line = bReader.readLine();
			System.out.println(line);
			String read = keyRead.readLine();
			System.out.println(read);

			bridge1.println(read);
			bridge1.flush();
		}
		
	}

}
