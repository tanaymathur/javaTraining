import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "test.pmv";
		
		try(FileOutputStream Iout = new FileOutputStream(fileName)){
			IOUtils.writePrimitive(Iout);
		}
		
		try(FileInputStream Iinp = new FileInputStream(fileName)){
			IOUtils.readPrimitives(Iinp);
		}
	}

}
