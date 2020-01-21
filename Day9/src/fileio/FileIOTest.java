package fileio;

/*
 * reads lines from input file
 * writes them to output file , excluding duplicated
 * 
 * make use of 
 * 
 * BufferReader
 * HashSet add() method
 * PrintWriter
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		

		File inFile = new File("inputfile.txt");

		
			FileReader inputFile = new FileReader(inFile);
			BufferedReader bufReader = new BufferedReader(inputFile);
			

			HashSet<String> h_set = new HashSet<String>();
			
			File outputFile = new File("outputfile.txt");
			FileOutputStream fos = new FileOutputStream(outputFile);
			PrintWriter pw = new PrintWriter(fos);
			
			String line;
			line = bufReader.readLine();
			
			//read lines from input file
		
			while (line != null) {
				
				h_set.add(line);
				line = bufReader.readLine();
				
				
			}
		
			System.out.println("Original Hash Set:" + h_set);
			
			for(String s: h_set) {
				
				pw.println(s);
			}
		
			bufReader.close();
			pw.flush();
			pw.close();
			
			System.out.println("File operation performed successfully");
		
			

	}

}
