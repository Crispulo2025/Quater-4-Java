import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Title label
        JLabel titleLabel = new JLabel("User Login", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton loginButton = new JButton("Login");
        buttonPanel.add(loginButton);

        // Add components to frame
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
