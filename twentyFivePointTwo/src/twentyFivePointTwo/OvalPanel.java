package twentyFivePointTwo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OvalPanel extends JPanel{
	private int diameter = 10;
	private void painComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}
	
	public void setDiameter(int newDiameter) {
		diameter = newDiameter >= 0 ? newDiameter : 10;
		repaint();
	}
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
	public Dimension getMinimumSize() {
		return getPreferredSize()	;
	}
}
