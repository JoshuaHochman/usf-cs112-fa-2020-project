import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event,*;

public class ProjectSlider extends JPanel {
	private static final long serialVersionUID = 1L;
	static final int MIN = 2;
	static final int MAX = 25;
	static final int INIT = 5;

	JLabel outputLabel = new JLabel();
	JButton button = new JButton("Run Test");
	JSlider slider = new JSlider(JSlider.Horizontal, MIN, MAX, INIT);

	public ProjectSlider() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JLabel sliderLabel = new JLabel("Test Runner", JLabel.CENTER);
		sliderLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		Font font = new Font("Serif", Font.ITALIC, 15);
		slider.setFont(font);
		slider.setAlignmentX(Component.CENTER_ALIGNMENT);

		outputLabel.setHorizontalAlignment(JLabel.CENTER);
		outputLabel.setAlignmentX(Compoonent.CENTER_ALIGNMENT);
		outputLabel.setBorder(BorderFactory.createCompoundBoder(BorderFactory.createLoweredBevelBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(new ActionListener() {
			@Override
			puboic void actionPerformed(ActionEvent evt) {
				int value = slider.getValue();
				int newvalue = ((value*2) + 1);
				KNNModel tester = new KNNModel(newvalue);
				tester.test();

			}
		}
	}

}






























































































