import javax.swing.*;
import java.awt.event.*;

public class CheckBoxToggleLabel extends JFrame implements ItemListener {

    private JCheckBox checkBox;
    private JLabel label;

    public CheckBoxToggleLabel() {

        // Frame setup
        setTitle("Checkbox Toggle Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Label
        label = new JLabel("Hello! I appear and disappear 👋");
        label.setBounds(50, 50, 220, 30);

        // Checkbox
        checkBox = new JCheckBox("Show Label", true);
        checkBox.setBounds(80, 100, 120, 30);
        checkBox.addItemListener(this);

        // Add components
        add(label);
        add(checkBox);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Toggle visibility based on checkbox state
        label.setVisible(checkBox.isSelected());
    }

    public static void main(String[] args) {
        new CheckBoxToggleLabel();
    }
}