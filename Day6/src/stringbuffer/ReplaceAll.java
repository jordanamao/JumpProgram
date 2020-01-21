package stringbuffer;

import javax.swing.JOptionPane;

public class ReplaceAll {

	public static void main(String[] args) {
		char letter;
		String inSentence = JOptionPane.showInputDialog(null, "Sentence:");
		
		String replaced = inSentence.replaceAll("[aeiou]", "X");
		JOptionPane.showMessageDialog(null, replaced);

	}

}
