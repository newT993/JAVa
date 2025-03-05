package mana;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class TestFieldFrame extends JFrame{
	
	private JTextField field3;
	private JPasswordField passwordField;
	private JTextField field;
	private JCheckBox checkBox;
	
	private static final String[] colorName = { "Black", "Blue", "Cyan",
			  "Dark Gray","Gray","Green","Light Gray","Magenta", "Orange",
			  "Pink","Red", "White", "Yellow" };
	private JList colorJList;
	private JList copyJList;
	private JButton copyButton;
	
	public  TestFieldFrame() {
		super("jcheckbox field");
		setLayout(new FlowLayout());
		
		//list
		colorJList = new JList(colorName);
		colorJList.setVisibleRowCount(4);
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));
		
		copyButton = new JButton("coyp");
		copyButton.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				copyJList.setListData(colorJList.getSelectedValues());
			}
		});
		add(copyButton);
		
		copyJList = new JList();
		copyJList.setVisibleRowCount(4);
		copyJList.setFixedCellHeight(199);
		copyJList.setFixedCellWidth(14);
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));
		
		//field
		field3 = new JTextField("uneditable field");
		field3.setEditable(false);
		add(field3);
		
		passwordField = new JPasswordField("haha");
		add(passwordField);
		
		TextHandler handler = new TextHandler();
		field3.addActionListener(handler);
		
		//font
		field = new JTextField("change font", 15);
		field.setFont(new Font("Serif", Font.PLAIN, 12));
		add(field);
		
		checkBox = new JCheckBox("italic");
		add(checkBox);
		
		CheckHandler checkHandler = new CheckHandler();
		checkBox.addItemListener(checkHandler);
	}
	
	private class CheckHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Font font = null;
			if (checkBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			}
			field.setFont(font);
		}
	}
	
	private class TextHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String string = "";
			if (e.getSource() == field3) {
				string = String.format("textfield %s ", e.getActionCommand());
			} else if (e.getSource() == passwordField) {
				string = String.format("password %s", e.getActionCommand()); 
			}
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
