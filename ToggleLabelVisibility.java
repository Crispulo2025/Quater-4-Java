import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class ToggleLabelVisibility {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Toggle Label Visibility");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create JLabel
        JLabel label = new JLabel("Hello! I appear and disappear.");

        // Create JCheckBox
        JCheckBox checkBox = new JCheckBox("Show Label", true);

        // Set initial visibility
        label.setVisible(true);

        // Toggle visibility when checkbox is clicked
        checkBox.addActionListener(e -> {
            label.setVisible(checkBox.isSelected());
        });

        // Add components
        frame.add(checkBox);
        frame.add(label);

        // Frame settings
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}