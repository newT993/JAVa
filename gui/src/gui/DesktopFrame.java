package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DesktopFrame extends JFrame{
	private JDesktopPane desktopPane;
	public DesktopFrame() {
		// TODO Auto-generated constructor stub
		super("using a jdesktoppane");
		
		JMenuBar bar = new JMenuBar();
		JMenuItem item = new JMenuItem("internal frame")	;
		JMenu menu = new JMenu("add");
		
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
		desktopPane = new JDesktopPane();
		add(desktopPane);
		
		item.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JInternalFrame frame = new JInternalFrame("internal frame", 
						true, true, true, true);
				
				MyJpanel myJpanel = new MyJpanel();
				frame.add(myJpanel);
				frame.pack();
				desktopPane.add(frame);
				frame.setVisible(true);
			}
		});
	}
}

class MyJpanel extends JPanel{
	private static Random random = new Random();
	private ImageIcon icon;
	private final static String[] images = {"one.jpg", "two.jpg", "three.jpg"};
	public MyJpanel() {
		int ranNum = random.nextInt(images.length);
		icon = new ImageIcon(images[ranNum]);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		icon.paintIcon(this, g, 0, 0);
	}
	public Dimension getPreferredSize() {
		return new Dimension(icon.getIconWidth(),icon.getIconHeight());
		
	}
}