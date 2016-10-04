import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class serverWorker extends Thread {
	private Socket sock;
	public void run(Socket clientInfo) throws IOException {
		this.sock = clientInfo;
	}
	@Override
	public void run() {
		
		new Thread(){
			
			
		}.start();
		
		InputStream in;
		try {
			in = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			while(true){
				String line = br.readLine();
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
