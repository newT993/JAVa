package twentyFivePointOneTwo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
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

public class DesktopFrame extends JFrame{
	private JDesktopPane theDesktop;
	public DesktopFrame() {
		super("using a jdesktoppane");
		
		JMenuBar bar = new JMenuBar();
		JMenu addMenu = new JMenu("add");
		JMenuItem newFrame = new JMenuItem("internal frame");
		
		addMenu.add(newFrame);
		bar.add(addMenu);
		setJMenuBar(bar);
		
		theDesktop = new JDesktopPane();
		add(theDesktop);
		
		newFrame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JInternalFrame frame = new JInternalFrame("internal frame", 
						true, true, true, true);
				
				MyjPanel panel = new MyjPanel();
				frame.add(panel, BorderLayout.CENTER);
				frame.pack();
				theDesktop.add(frame);
				frame.setVisible(true);
			}
		});
	}
}

class MyjPanel extends JFrame{
	private static Random generator = new Random();
	private ImageIcon pictureIcon;
	private final static String[] images = {
			"one.jpg", "two.jpg", "three.jpg", "four.jpg"
	};
	
	public MyjPanel () {
		int randomNum = generator.nextInt(images.length);
		pictureIcon = new ImageIcon(images[randomNum]); 
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		pictureIcon.paintIcon(this, g, 0, 0);
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(pictureIcon.getIconWidth(), pictureIcon.getIconHeight());
	}
}