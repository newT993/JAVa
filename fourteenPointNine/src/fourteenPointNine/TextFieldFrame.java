package fourteenPointNine;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
	private JTextField txField;
	private JTextField txField2;
	private JTextField txField3;
	private JPasswordField jPasswordField;
	
	public TextFieldFrame() {
		// TODO Auto-generated constructor stub
		super("Testing: Jtextfield and jpwdfield");
		setLayout(new FlowLayout());
		
		txField = new JTextField(10);
		add(txField);
		
		txField2 = new JTextField("Enter text here");
		add(txField2);
		
		txField3 = new JTextField("Uneditable text field", 21);
		txField3.setEditable(false);
		add(txField3);
		
		jPasswordField = new JPasswordField("Hidden text");
		add(jPasswordField);
	}
	
	private class TextFieldHandler implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			String string = "";
			
			if(e.getSource() == txField) {
				string = String.format("textField1: %s", e.getActionCommand());
			}else if (e.getSource() == txField2) {
				string = String.format("textField2: %s", e.getActionCommand());
			} else if (e.getSource() == txField3) {
				string = String.format("textfield3: %s", e.getActionCommand());
			} else if (e.getSource() == jPasswordField) {
				string = String.format("pwd: %s", e.getActionCommand());
			}
			JOptionPane.showMessageDialog(null,  string);
		}
	}
}
