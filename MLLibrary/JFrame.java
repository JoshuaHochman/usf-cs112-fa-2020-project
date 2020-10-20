import javax.swing.*;   
import java.awt.*;       
import java.io.*;
import java.lang.Object;
import javax.swing.ImageIcon;


public class JFrame {
	private static void initAndShowGUI() {
    	
	
	JFrame myFrame = new JFrame((String) "Project1 JFrame (Video Game Best Sellers)");
	

	Container contentPane = myFrame.getContentPane();


	contentPane.setLayout(new GridLayout(2, 2));
	


	contentPane.add(new JButton("Japanese Action"));
	contentPane.add(new JButton("Japanese Strategy"));
	contentPane.add(new JButton("American Action"));
	contentPane.add(new JButton("American Strategy"));
	

	myFrame.pack();
	myFrame.setVisible(true);

	
    }


    public static void main(String args[]) {
      
        SwingUtilities.invokeLater(
          new Runnable() { public void run() { initAndShowGUI(); } }
        );
      
    }
}