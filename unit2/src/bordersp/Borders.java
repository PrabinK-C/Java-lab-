package bordersp;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Borders extends JFrame {

	public Borders() {
		super("Border Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new GridLayout(3, 3));
		setSize(300, 300);

		// create borders
		Border emptyBorder = BorderFactory.createEmptyBorder();
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
		Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		Border etchedBorder = BorderFactory.createEtchedBorder();

		Border matteBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE);

		// add borders to labels
		JLabel label1 = new JLabel("Empty Border");
		label1.setBorder(emptyBorder);
		JLabel label2 = new JLabel("Line Border");
		label2.setBorder(lineBorder);
		JLabel label3 = new JLabel("Raised Bevel Border");
		label3.setBorder(raisedBevelBorder);
		JLabel label4 = new JLabel("Lowered Bevel Border");
		label4.setBorder(loweredBevelBorder);
		JLabel label5 = new JLabel("Etched Border");
		label5.setBorder(etchedBorder);

		JLabel label9 = new JLabel("Matte Border");
		label9.setBorder(matteBorder);

		// add labels to panel
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label9);

		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Borders();
	}
}