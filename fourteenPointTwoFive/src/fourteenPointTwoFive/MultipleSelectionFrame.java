package fourteenPointTwoFive;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{
	private JList colorList;
	private JList copyList;
	private JButton copyButton;
	private static final String[] colorNames = {
			"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Lisht Gray",
			"Magenta", "Orange", "Pink", "Red", "White", "Yellow"
	};
	
	public MultipleSelectionFrame() {
		super("Multiple selection list");
		setLayout(new FlowLayout());
		
		colorList = new JList(colorNames);
		colorList.setVisibleRowCount(5);
		colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorList));
		
		copyButton = new JButton("Copy >>>");
		copyButton.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						copyList.setListData(colorList.getSelectedValues());
						
					}
				}
				);
		add(copyButton);
		copyList = new JList();
		copyList.setVisibleRowCount(5);
		copyList.setFixedCellHeight(100);
		copyList.setFixedCellHeight(100);
		copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorList));
	}
}
