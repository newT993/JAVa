package twentyFivePointTwo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SiderFrame extends JFrame{
	private JSlider diaJSlider;
	private OvalPanel myPanel;
	
	public SiderFrame() {
		super("Slider demo");
		myPanel = new OvalPanel();
		myPanel.setBackground(Color.YELLOW);
		
		diaJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		diaJSlider.setMajorTickSpacing(10);
		diaJSlider.setPaintTicks(true);
		
		diaJSlider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						myPanel.setDiameter(diaJSlider.getValue());
					}
				}
				);
		add(diaJSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}
