package labOne;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JLabel name, nrc, major, address, sex;
    private JTextField tname, tnrc;
    private JComboBox<String> cmajor;
    private JTextArea taddress;
    private JButton save, cancel;
    private JRadioButton sexmale, sexfemale;
    private ButtonGroup group;
    private String[] smajor = {"Civil", "EC", "EP", "MECH", "IT", "MC"};
    private JPanel p1, p2, p3;

    public Main() { // Constructor should match class name
        super("Student Data");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initializing components
        name = new JLabel("Student Name");
        nrc = new JLabel("NRC Number");
        sex = new JLabel("Sex");
        major = new JLabel("Student Major");
        address = new JLabel("Address");

        tname = new JTextField(10);
        tnrc = new JTextField(10);
        cmajor = new JComboBox<>(smajor);
        taddress = new JTextArea(3, 10);
        sexmale = new JRadioButton("Male");
        sexfemale = new JRadioButton("Female");

        group = new ButtonGroup();
        group.add(sexmale);
        group.add(sexfemale);

        save = new JButton("Save");
        cancel = new JButton("Cancel");

        // Panels
        p1 = new JPanel(new GridLayout(5, 2));
        p2 = new JPanel();
        p3 = new JPanel();

        // Adding components to panel p1
        p1.add(name);
        p1.add(tname);
        p1.add(nrc);
        p1.add(tnrc);
        p1.add(major);
        p1.add(cmajor);
        p1.add(sex);
        
        // Panel for radio buttons
        p3.add(sexmale);
        p3.add(sexfemale);
        p1.add(p3);

        p1.add(address);
        p1.add(new JScrollPane(taddress));

        add(p1, BorderLayout.CENTER); // Corrected layout usage

        // Adding buttons to p2
        p2.add(save);
        p2.add(cancel);
        add(p2, BorderLayout.SOUTH);

        setVisible(true); // Corrected from deprecated show()
    }

    public static void main(String[] args) {
        new Main(); // Instantiate Main instead of calling a non-existent method
    }
}
