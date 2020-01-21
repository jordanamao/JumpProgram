package Directory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException{
		// set up file and stream

		File inFile = new File("data.txt");

		try {
			
			FileReader fileReader = new FileReader(inFile);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String str;

			str = bufReader.readLine();
			
			while (str!=null) {

				System.out.println(str);
				str = bufReader.readLine();	
			}

			bufReader.close();
			
			
			
		}catch(FileNotFoundException e) {

			System.out.println("FileNotFoundException: " + e.getMessage());
			
		}catch(IOException e) {

			System.out.println("IOException: " + e.getMessage());
		}
	}	
}
