package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
     

public class ProjectFrame {

	private static void initAndShowGUI() {
    	
	
		JFrame frame = new JFrame("Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container pane = frame.getContentPane();
		pane.setLayout(new GridLayout(2, 2));
        frame.pack();
        frame.setVisible(true);

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