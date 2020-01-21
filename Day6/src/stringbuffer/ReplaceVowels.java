package stringbuffer;

import javax.swing.JOptionPane;

public class ReplaceVowels {

	public static void main(String[] args) {
		
		char letter;
		String inSentence = JOptionPane.showInputDialog(null, "Sentence:");
		StringBuffer tempStringBuffer = new StringBuffer(inSentence);
		int numberOfCharacters  = tempStringBuffer.length();
		
		for (int index = 0; index < numberOfCharacters; index++) {
			
			letter = tempStringBuffer.charAt(index);
			
			if ( letter == 'a' || letter == 'A' || letter == 'E' || letter == 'e' ||
				 letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' ||
				 letter == 'U' || letter == 'u'){
					 tempStringBuffer.setCharAt(index, 'X');
				 }
		}
		JOptionPane.showMessageDialog(null, tempStringBuffer);

	}

}
