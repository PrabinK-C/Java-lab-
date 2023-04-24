package focousadpt;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Focousevent extends JFrame implements FocusListener {
	JTextField textField1, textField2;

	public Focousevent() {
		super("Focus Listener Example");

		// Create two text fields for testing focus events
		textField1 = new JTextField("Click to get focus", 20);
		textField2 = new JTextField("Click to lose focus", 20);
		add(textField1, BorderLayout.NORTH);
		add(textField2, BorderLayout.SOUTH);

		// Register the FocusListener with the text fields
		textField1.addFocusListener(this);
		textField2.addFocusListener(this);

		// Set the size of the frame and make it visible
		setSize(400, 300);
		setVisible(true);
	}

	// FocusListener interface methods
	public void focusGained(FocusEvent event) {
		if (event.getSource() == textField1) {
			textField1.setText("Focus Atained");
			textField2.setText("Click to lose focus");
		} else if (event.getSource() == textField2) {
			textField1.setText("Click to get focus");
			textField2.setText("Focus Atained");
		}
	}

	public void focusLost(FocusEvent event) {
		if (event.getSource() == textField1) {
			textField1.setText("Focus Lost");
			textField2.setText("Click to get focus");
		} else if (event.getSource() == textField2) {
			textField1.setText("Click to lose focus");
			textField2.setText("Focus Lost");
		}
	}

	public static void main(String[] args) {
        new Focousevent();
    }
}