package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JtabbedFrame extends JFrame{
	public JtabbedFrame() {
		super("jtabbedframe");
		JTabbedPane pane = new JTabbedPane();
		
		JLabel label = new JLabel("panel one", SwingConstants.CENTER);
		JPanel panel = new JPanel();
		panel.add(label);
		pane.addTab("tab one", null, panel, "firt panel");
		
		JLabel label2 = new JLabel("anel two");
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(new JButton("NOTTH"), BorderLayout.NORTH);
		panel2.add(new JButton("west"), BorderLayout.WEST);
		pane.addTab("tab three",null, panel2, "thired panel");
		add(pane);
	}
}
