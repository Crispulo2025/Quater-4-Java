import javax.swing.*;
import java.awt.*;

public class GridBagPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("GridBagLayout Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // Create a JPanel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ----- Row 1 -----
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("First Name:"), gbc);
        gbc.gridx = 1;
        JTextField firstNameField = new JTextField(15);
        panel.add(firstNameField, gbc);

        // ----- Row 2 -----
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Last Name:"), gbc);
        gbc.gridx = 1;
        JTextField lastNameField = new JTextField(15);
        panel.add(lastNameField, gbc);

        // ----- Row 3 -----
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(15);
        panel.add(emailField, gbc);

        // ----- Submit button centered below -----
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // span across two columns
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton, gbc);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
