package solitaire;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// GUI tutorial from Alex Lee on Youtube ---  https://www.youtube.com/watch?v=5o3fMLPY7qY
public class GUI implements ActionListener {
	
	private JFrame frame;
	private JLabel label, label2, label3, label4;
	private JPanel panel;
	private JButton button;
	private JCheckBox box1, box2, box3, box4;
	private JRadioButton r1, r2, r3;
	private JSeparator line;
	
	
	int count = 0;
	
	public GUI() {
		
		// create our components of GUI
		button = new JButton("button");
		button.addActionListener(this);
		
		label = new JLabel("Clicks: 0");
		label2 = new JLabel("---------Sample Solitaire GUI (rough draft) ------------");
		label3 = new JLabel("Board Type:");
		label4 = new JLabel("Options:");
		
		box1 = new JCheckBox("Replay");
		box2 = new JCheckBox("New Game");
		box3 = new JCheckBox("Autoplay");
		box4 = new JCheckBox("Random");
		
		r1 = new JRadioButton("English");
		r2 = new JRadioButton("Hex");
		r3 = new JRadioButton("Diamond");
		
		line = new JSeparator(SwingConstants.HORIZONTAL);
		
		
		// Create Panel and Add components to it.
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10,20,20,20));
		panel.setLayout(new GridLayout(0,1));
		panel.add(line);
		panel.add(button);
		panel.add(label);
		panel.add(label2);
		panel.add(label4);
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		panel.add(box4);
		panel.add(label3);
		panel.add(r1);
		panel.add(r2);
		panel.add(r3);
		panel.add(line);
		
		
		// Create Panel and Add the panel to Frame.
		frame = new JFrame("Solitaire");
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Solitaire");
		frame.pack();
		
		
	}
	
	/* method to disply frame */
	public void display() {

		frame.setVisible(true);
		
	}

	/* additional method used count number of clicks of button */
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Clicks: " + count);
		
	}
}
