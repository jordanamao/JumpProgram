import java.util.Scanner;
public class UserInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = scanner.next();
		System.out.println(name);
		System.out.println("Enter your Age:");
		long age = scanner.nextLong();
		System.out.println(age);

	}

}
