package fileio;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * 
 * 
 * Program that reads lines from 2 text files
 * and writes them in a 3rd text file alternating
 * one line from file1 and one line from file2 
 * Continue writing all the lines form the longer file
 * 
 * The program makes use of:
 * BufferedReader to read lines of text
 * PrintWriter to write lines of text to a file
 * 
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FilesMerge {

	public static void main(String[] args) throws IOException{
		
		File inFile1 = new File("file1.txt");
		File inFile2 = new File("file2.txt");
		List<String> listStrings = new ArrayList<String>();
		

		
		FileReader inputFile1 = new FileReader(inFile1);
		FileReader inputFile2 = new FileReader(inFile2);
		
		BufferedReader bufReader1 = new BufferedReader(inputFile1);
		BufferedReader bufReader2 = new BufferedReader(inputFile2);
		
		
		
		File outputFile = new File("file3.txt");
		FileOutputStream fos = new FileOutputStream(outputFile);
		PrintWriter pw = new PrintWriter(fos);
		
		
		String line1;
		String line2;
		
		
		line1 = bufReader1.readLine();
		line2 = bufReader2.readLine();
		
	
		while (line1 != null || line2 != null) {
			
			if (line1 != null)
			{
				pw.println(line1);
				line1 = bufReader1.readLine();
			}
			
			if (line2 != null)
				
			{
				pw.println(line2);
				line2 = bufReader2.readLine();
				
			}
			
		}
		
		
		bufReader1.close();
		bufReader2.close();
		

		pw.flush();
		pw.close();
		
	}

}
