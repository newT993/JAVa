package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OvalPanel extends JPanel{
	private int diameter;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}
	
	public void setDiameter(int newDia) {
		diameter = (newDia>=0?newDia : 10);
		repaint();
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
}
