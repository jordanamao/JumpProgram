package random;

import java.util.Scanner;
public class guessNumber {

	public static void main(String[] args) {

		int max = 10;
		int min = 1;
		int range = max - min + 1;

		int rand = (int)(Math.random() * range) + min;
		System.out.println("Random number generated is " + rand);


		System.out.println("Try to guess a number");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		int attempt = 1;


		while( guess != rand) {

			if (guess > rand) {

				System.out.println("The number is too high, try a different number");
				guess = scanner.nextInt();
				attempt++;

			}

			else { System.out.println("The number is too low, try a different number");
				guess = scanner.nextInt(); 
				attempt++;

			}		
		}

		System.out.println("Congrats, you got the number!");
		System.out.println("Number of attemps is " + attempt);
	}

}
