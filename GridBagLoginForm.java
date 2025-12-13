import javax.swing.*;
import java.awt.*;

public class GridBagLoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing around components

        // Labels
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // Text fields
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);

        // Row 1: Username
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST; // label aligned to right
        gbc.weightx = 0;
        panel.add(userLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // text field stretches
        gbc.weightx = 1.0;
        panel.add(userField, gbc);

        // Row 2: Password
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        panel.add(passField, gbc);

        // Row 3: Login Button
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // span two columns
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        panel.add(loginButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
