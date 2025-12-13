import javax.swing.*;
import java.awt.*;

public class GridBagGridWidthExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout gridwidth Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 1: Label and TextField (normal width)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1; // default
        panel.add(new JLabel("First Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JTextField(10), gbc);

        // Row 2: Label and TextField (spans two columns)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(new JLabel("Address:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // spans 2 columns
        panel.add(new JTextField(20), gbc);

        // Row 3: Buttons
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(new JButton("Submit"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JButton("Cancel"), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
