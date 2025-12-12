import javax.swing.*;
import java.awt.*;

public class VerticalBoxForm extends JFrame {

    public VerticalBoxForm() {
        // Frame properties
        setTitle("Vertical BoxLayout Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel with vertical BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding

        // JLabel at the top
        JLabel descriptionLabel = new JLabel("Please fill out the fields below:");
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(descriptionLabel);
        panel.add(Box.createVerticalStrut(10)); // spacing below label

        // Add five JTextFields stacked vertically
        for (int i = 1; i <= 5; i++) {
            JTextField textField = new JTextField();
            textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25)); // allow horizontal expansion
            panel.add(textField);
            panel.add(Box.createVerticalStrut(10)); // spacing between text fields
        }

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalBoxForm().setVisible(true);
        });
    }
}
