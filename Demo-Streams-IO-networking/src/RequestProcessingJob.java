import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RequestProcessingJob implements Runnable {
	private Socket sock;

	public RequestProcessingJob(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {

		new Thread(
				new Runnable(){
					
					public void run() {
						try {
							InputStream in = sock.getInputStream();
							
							InputStreamReader bridge = new InputStreamReader(in);
							BufferedReader br = new BufferedReader(bridge);
							
							while(true){
								String line = br.readLine();
								System.out.println(line);
							}
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					};
				}
				
				
		).start();
		
		
		new Thread(
				
				new Runnable() {
					
					@Override
					public void run() {
						
						try {
							OutputStream out = sock.getOutputStream();
							PrintWriter pw = new PrintWriter(out);
							
							BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
							
							while(true){
//								Scanner scan = new Scanner(System.in);
								String msg=scan.readLine();
								pw.println("Tanay: " + msg);
								pw.flush();
							}
							
							
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					}
				}
				
				
				
				
		).start();
		
		
	}

}
