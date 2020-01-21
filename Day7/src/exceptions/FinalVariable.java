package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FinalVariable {

	public static void main(String[] args) throws FileNotFoundException {
		
		try(FileOutputStream fileStream = new FileOutputStream ("javatpoint.txt");){
			
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
			
		} catch(Exception e) {
			
			System.out.println(e);
			
		}
		

	}

}
