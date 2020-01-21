package FileOutPut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterLocal {

	public static void main(String[] args) throws IOException {

		File folder = new File("MyFolder");
		File test = new File("test.txt");
		try {
		new FileOutputStream(test).write("This is a test file".getBytes());
		}catch(IOException x) {}
		
		
		if (!folder.exists())
			folder.mkdir();

		else {

			File file = new File(folder, "data.txt");
			
			System.out.println("absolute path:" + file.getAbsolutePath());
			System.out.println("parent:" + file.getParent());
			//file

			FileOutputStream fos;

			try {

				fos = new FileOutputStream(file);

				fos.write("This is a file written by Java".getBytes());

				fos.close();	

			} catch (IOException e) {

				e.printStackTrace();
			}


		}
	}
}

