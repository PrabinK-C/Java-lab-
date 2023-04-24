package changevents;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ce extends JFrame implements ChangeListener {

    private JSlider slider;
    private JPanel panel;

    public ce() {
        super("slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 255, 127);
        slider.addChangeListener(this);

        panel = new JPanel();
        panel.setBackground(new Color(127, 127, 127));

        add(slider, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setResizable(true);
        setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        panel.setBackground(new Color(value, value, value));
    }

    public static void main(String[] args) {
        new ce();
    }
}