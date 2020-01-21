package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class SwingGuil2 {
	
	public static void main(String args[]) {
	
	//Creating the Frame
	JFrame frame = new JFrame ("Chat Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	
	
	JMenuBar mb = new JMenuBar();
	JMenu m1 = new JMenu("FILE");
	JMenu m2 = new JMenu("Help");
	mb.add(m1);
	mb.add(m2);
	
	
	JMenuItem m11 = new JMenuItem("Open");
	JMenuItem m22 = new JMenuItem("Save as");
	m1.add(m11);
	m1.add(m22);
	
	//Creating the panel at bottom adding components
	JPanel panel = new JPanel(); //the panel is not visible in output
	JLabel label = new JLabel("Enter Text");
	JTextField tf = new JTextField(10); //accepts up to 10 characters
	JButton send = new JButton ("send");
	JButton reset = new JButton("Reset");
	panel.add(label);//Components Added using Flow layout
	
	panel.add(tf);
	panel.add(send);
	panel.add(reset);
	
	JTextArea ta = new JTextArea();
	
	//Adding Components to the frame.
	frame.getContentPane().add(BorderLayout.SOUTH, panel);
	frame.getContentPane().add(BorderLayout.NORTH, mb);
	frame.getContentPane().add(BorderLayout.CENTER, ta);
	frame.setVisible(true);
	
	
	
	}
	

}
