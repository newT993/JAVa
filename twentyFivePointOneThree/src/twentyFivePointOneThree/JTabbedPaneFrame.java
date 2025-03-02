package twentyFivePointOneThree;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame{
	public JTabbedPaneFrame() {
		super("jtabbedpane demo");
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JLabel label = new JLabel("panel one", SwingConstants.CENTER);
		JPanel panel = new JPanel();
		panel.add(label);
		tabbedPane.addTab("Tab one", null, panel, "first panel");
		
		JLabel label2 = new JLabel("panel two", SwingConstants.CENTER	);
		JPanel panel2 = new JPanel()	;
		panel2.add(label2);
		tabbedPane.addTab("tab two", null, panel2, "second pandel");
		
		JLabel label3 = new JLabel("panel two");
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("North"), BorderLayout.NORTH	);
		panel3.add(new Button("west"), BorderLayout.WEST);
		panel3.add(new JButton("east"), BorderLayout.EAST);
		panel3.add(new JButton("south"), BorderLayout.SOUTH);
		panel3.add(label3, BorderLayout.CENTER);
		tabbedPane.addTab("tab three", null, panel3, "third panel");
		
		add(tabbedPane);
	}
}
