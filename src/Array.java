
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Array extends JFrame implements ActionListener{

	private JLabel label;
	private JButton button;
	private JTextField [] number = new JTextField[10];
	
	public Array() {
		setLayout(new GridLayout(12, 3));
		label = new JLabel();
		label.setText("Enter Numbers:");
		number[0] = new JTextField(10);
		number[1] = new JTextField(10);
		number[2] = new JTextField(10);
		number[3] = new JTextField(10);
		number[4] = new JTextField(10);
		number[5] = new JTextField(10);
		number[6] = new JTextField(10);
		number[7] = new JTextField(10);
		number[8] = new JTextField(10);
		number[9] = new JTextField(10);
		button = new JButton("Sort");
		button.addActionListener(this);
		add(label);
		add(number[0]);
		add(number[1]);
		add(number[2]);
		add(number[3]);
		add(number[4]);
		add(number[5]);
		add(number[6]);
		add(number[7]);
		add(number[8]);
		add(number[9]);
		add(button);
		setVisible(true);
		setSize(new Dimension(100, 600));
	}
	
	public void actionPerformed(ActionEvent e) {
		double [] numArray = new double[10];
		numArray[0] = Double.parseDouble(number[0].getText());
		numArray[1] = Double.parseDouble(number[1].getText());
		numArray[2] = Double.parseDouble(number[2].getText());
		numArray[3] = Double.parseDouble(number[3].getText());
		numArray[4] = Double.parseDouble(number[4].getText());
		numArray[5] = Double.parseDouble(number[5].getText());
		numArray[6] = Double.parseDouble(number[6].getText());
		numArray[7] = Double.parseDouble(number[7].getText());
		numArray[8] = Double.parseDouble(number[8].getText());
		numArray[9] = Double.parseDouble(number[9].getText());
		for(int i = 0; i < numArray.length; i++) {
			for(int j = i + 1; j < numArray.length; j++) {
				if(numArray[i] > numArray[j]) {
					swap(numArray, i, j);
				}
			}
			number[i].setText(String.valueOf(numArray[i]));
		}
	}

	public static void swap(double [] list, int smallestIndex, int i) {
		double temp = list[smallestIndex];
		list[smallestIndex] = list[i];
		list[i] = temp;
	}
}
