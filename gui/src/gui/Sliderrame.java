package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliderrame extends JFrame {
	private JSlider slider;
	private OvalPanel panel;
	public Sliderrame () {
		super("slider demo");
		panel = new OvalPanel();
		panel.setBackground(Color.GREEN);
		
		slider = new JSlider(SwingConstants.HORIZONTAL,0, 200, 10);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
		
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				panel.setDiameter(slider.getValue());
			}
		});
		
		add(slider, BorderLayout.SOUTH);
		add(panel, BorderLayout.CENTER);
	}
}
