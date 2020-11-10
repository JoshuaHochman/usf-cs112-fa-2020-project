import java.awt.*; 
import javax.swing.*;   
import java.awt.event.*;
      


public class JFrame {

	private static void initAndShowGUI() {
    	
	
		JFrame frame = new JFrame("Project1 JFrame");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container pane = frame.getContentPane();


		pane.setLayout(new GridLayout(2, 2));
	


		pane.add(new JButton("1"));
		pane.add(new JButton("2"));
		pane.add(new JButton("3"));
		pane.add(new JButton("4"));
	

		frame.pack();
		frame.setVisible(true);

	
    }


    public static void main(String args[]) {
      
        SwingUtilities.invokeLater(
          new Runnable() { public void run() { initAndShowGUI(); } }
        );
      
    }
}