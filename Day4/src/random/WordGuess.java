package random;

import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {

		final String SECRET_WORD = "BRAIN";

		String wordSoFar = "", updatedWord = "";
		String letterGuess;

		System.out.println("WordGuess game");

		for(int i = 0; i < SECRET_WORD.length(); i++) {
			wordSoFar = wordSoFar + "-";
		}


		while(SECRET_WORD != updatedWord) {
			
		System.out.println("Enter a letter: ");
		Scanner scanner = new Scanner (System.in);
		char letter = scanner.next().charAt(0);
		
		

		for(int i = 0; i < SECRET_WORD.length(); i++) {


			if (letter == SECRET_WORD.charAt(i)) {

				updatedWord = wordSoFar.substring(0,i)+ letter + wordSoFar.substring(i,updatedWord.length());
				
				//wordSoFar = updatedWord;
			}
		

			else {updatedWord = updatedWord + "-";}

		}

		System.out.println(updatedWord);

	  }
		
	}

}

//finish this
