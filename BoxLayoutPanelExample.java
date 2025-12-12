import javax.swing.*;
import java.awt.*;

public class BoxLayoutPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("BoxLayout Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical arrangement

        // Create checkboxes
        JCheckBox optionA = new JCheckBox("Option A");
        JCheckBox optionB = new JCheckBox("Option B");
        JCheckBox optionC = new JCheckBox("Option C");

        // Add checkboxes to panel
        panel.add(optionA);
        panel.add(optionB);
        panel.add(optionC);

        // Optional: Add some vertical spacing between checkboxes
        panel.add(Box.createVerticalStrut(5));

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
