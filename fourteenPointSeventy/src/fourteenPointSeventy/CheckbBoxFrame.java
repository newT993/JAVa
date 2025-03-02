package fourteenPointSeventy;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckbBoxFrame extends JFrame{
	private JTextField txtField;
	private JCheckBox jCheckBox;
	private JCheckBox italicCheckBox;
	
	public CheckbBoxFrame(){
		super("JcheckBox Test");
		setLayout(new FlowLayout());
		
		txtField = new JTextField("watch the font stle change",20)	;
		txtField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(txtField);
		
		jCheckBox = new JCheckBox("bold");
		italicCheckBox = new JCheckBox("italic");
		add(jCheckBox);
		add(italicCheckBox);
		
		CheckoxHandler handler = new CheckoxHandler();
		jCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
	}
	
	private class CheckoxHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			Font font = null;
			if(jCheckBox.isSelected() && italicCheckBox.isSelected()) {
				
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(jCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			} else if(italicCheckBox.isSelected()){
				font = new Font("Serif", Font.ITALIC, 14);
			} else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			txtField.setFont(font);
		}
	}

}
