package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingGuil {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		
	
		JButton button = new JButton(" Press ");
	
		frame.getContentPane().add(button); //Adds Button to content pane of frame
		
	
		frame.setVisible(true);
		

	}

}
