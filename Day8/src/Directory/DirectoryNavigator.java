package Directory;

import java.io.File;

public class DirectoryNavigator {

	public static void main(String[] args) {
		
		String filepath = "../";
		File file = new File (filepath);
		if (file.exists()) {
			printDirectory(file);
		}
		
	}
	
	private static void printDirectory (File folder) {
		
		for (File file: folder.listFiles()) {
			
			if (file.isDirectory()) {
			
			File[] files = file.listFiles();
			System.out.println(
					"=== Directory: " + file.getName() + " :Contains: " + files.length+ " Files ===");
			
			printDirectory(file);
		
			}else {
			
			System.out.println(file.getName());
		
		}
		
		
	}

}
	
}
