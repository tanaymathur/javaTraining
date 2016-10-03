import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
	
	public static void writePrimitive(OutputStream out) throws IOException{
		//TODO ALONG A DOUBLE , A BOOLEAN
		try(DataOutputStream dOut = new DataOutputStream(out)){
			dOut.writeLong(1L);
			dOut.writeDouble(12.21);
			dOut.writeBoolean(false);
		}
	}
	
	
	public static void readPrimitives(InputStream in) throws IOException{
		
		try(DataInputStream dIn = new DataInputStream(in)){
			long IValue=dIn.readLong();
			System.out.print(IValue+"\t");
			
			double DValue=dIn.readDouble();
			System.out.print(DValue+"\t");
			
			boolean BValue=dIn.readBoolean();
			System.out.print(BValue+"\t");
		}
	}

}
