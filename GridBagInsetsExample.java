import javax.swing.*;
import java.awt.*;

public class GridBagInsetsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout with Insets Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Default padding
        gbc.insets = new Insets(5, 5, 5, 5); // top, left, bottom, right
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 1: Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JTextField(15), gbc);

        // Row 2: Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JTextField(15), gbc);

        // Row 3: Message with larger padding
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 5, 10, 5); // increased top/bottom padding
        panel.add(new JLabel("Message:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(new JTextArea(5, 15), gbc);

        // Row 4: Submit button
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(15, 5, 5, 5); // larger top margin
        panel.add(new JButton("Submit"), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
