import javax.swing.*;
import java.awt.*;

public class GridBagFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel messageLabel = new JLabel("Message:");

        // Input fields
        JTextField nameField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextArea messageArea = new JTextArea(5, 15);

        // Row 1: Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0; // label does not expand
        gbc.weighty = 0;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // text field expands horizontally
        gbc.weightx = 1.0; // allows horizontal expansion
        gbc.weighty = 0;
        panel.add(nameField, gbc);

        // Row 2: Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        panel.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        panel.add(emailField, gbc);

        // Row 3: Message
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panel.add(messageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH; // area expands horizontally and vertically
        gbc.weightx = 1.0;
        gbc.weighty = 1.0; // allows vertical expansion
        panel.add(new JScrollPane(messageArea), gbc);

        // Submit button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panel.add(submitButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
