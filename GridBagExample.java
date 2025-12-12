import javax.swing.*;
import java.awt.*;

public class GridBagExample extends JFrame {

    public GridBagExample() {
        // Set frame properties
        setTitle("GridBagLayout Example");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // padding around components

        // JLabel spanning two columns
        JLabel label = new JLabel("Enter your information:");
        gbc.gridx = 0; // column 0
        gbc.gridy = 0; // row 0
        gbc.gridwidth = 2; // span 2 columns
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(label, gbc);

        // JTextField below in one column
        JTextField textField = new JTextField(20);
        gbc.gridx = 0; // column 0
        gbc.gridy = 1; // row 1
        gbc.gridwidth = 1; // single column
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(textField, gbc);

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GridBagExample().setVisible(true);
        });
    }
}
