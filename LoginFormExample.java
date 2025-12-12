import javax.swing.*;
import java.awt.*;

public class LoginFormExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel with GridLayout (2 rows, 2 columns)
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5)); // 5px gaps

        // Create labels and text fields
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Add labels and text fields to panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
