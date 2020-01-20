import java.util.Scanner;

public class breakingloop {

	public static void main(String[] args) {
		 
		String name;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("Your name");
			name = scanner.nextLine();
			
			if (name.length()>0)
			break;
			
			System.out.println("Invalid Entry" + "You must enter at least one charater");
			
		}

	}

}
