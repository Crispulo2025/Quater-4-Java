import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxCounterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        // Create checkboxes
        JCheckBox cb1 = new JCheckBox("Option 1");
        JCheckBox cb2 = new JCheckBox("Option 2");
        JCheckBox cb3 = new JCheckBox("Option 3");
        JCheckBox cb4 = new JCheckBox("Option 4");

        // Label to show count
        JLabel countLabel = new JLabel("Selected: 0");

        // Listener to update count dynamically
        ItemListener updateCount = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int count = 0;
                if (cb1.isSelected()) count++;
                if (cb2.isSelected()) count++;
                if (cb3.isSelected()) count++;
                if (cb4.isSelected()) count++;

                countLabel.setText("Selected: " + count);
            }
        };

        // Attach listener to all checkboxes
        cb1.addItemListener(updateCount);
        cb2.addItemListener(updateCount);
        cb3.addItemListener(updateCount);
        cb4.addItemListener(updateCount);

        // Add components
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        frame.add(countLabel);

        frame.setVisible(true);
    }
}
