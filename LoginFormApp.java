import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class LoginFormApp {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with GridLayout (rows, cols)
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

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

        // Display frame
        frame.setVisible(true);
    }
}