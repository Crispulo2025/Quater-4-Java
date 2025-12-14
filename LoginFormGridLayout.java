import javax.swing.*;
import java.awt.*;

public class LoginFormGridLayout {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel with GridLayout (3 rows, 2 columns)
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Create login button
        JButton loginButton = new JButton("Login");

        // Add components to panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // empty cell for spacing
        panel.add(loginButton);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
