import javax.swing.*;
import java.awt.*;

public class CheckBoxExample extends JFrame {

    public CheckBoxExample() {
        // Set frame properties
        setTitle("Checkbox Options");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel with vertical BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create checkboxes
        JCheckBox option1 = new JCheckBox("Option 1");
        JCheckBox option2 = new JCheckBox("Option 2");
        JCheckBox option3 = new JCheckBox("Option 3");

        // Add checkboxes to the panel with vertical spacing
        panel.add(option1);
        panel.add(Box.createVerticalStrut(10)); // 10-pixel vertical gap
        panel.add(option2);
        panel.add(Box.createVerticalStrut(10));
        panel.add(option3);

        // Add panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CheckBoxExample().setVisible(true);
        });
    }
}
