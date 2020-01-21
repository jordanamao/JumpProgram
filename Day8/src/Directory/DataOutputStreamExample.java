package Directory;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

	public static void main(String[] args) {

		File file = new File ("Data.dat");
		
		try{
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeInt(12345);
			dos.writeBoolean(true);
			dos.writeChar('w');
			dos.close();

		} catch(FileNotFoundException x) {
			System.out.println("FileNotFoundException: " + x.getMessage());
		
		
		}catch(IOException e) {

			e.printStackTrace();

		}

	}
	
}
