import javax.swing.*;
import java.awt.*;

public class BoxLayoutCheckboxExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("BoxLayout Y-Axis Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create a panel with BoxLayout (Y_AXIS)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add checkboxes
        JCheckBox cb1 = new JCheckBox("Option 1");
        JCheckBox cb2 = new JCheckBox("Option 2");
        JCheckBox cb3 = new JCheckBox("Option 3");
        JCheckBox cb4 = new JCheckBox("Option 4");
        JCheckBox cb5 = new JCheckBox("Option 5");
        JCheckBox cb6 = new JCheckBox("Option 6");

        // Add checkboxes to panel with rigid areas for spacing
        panel.add(cb1);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // vertical space
        panel.add(cb2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(cb3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(cb4);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(cb5);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(cb6);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
