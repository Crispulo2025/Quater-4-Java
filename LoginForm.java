import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class LoginForm {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Login Form");

        // Set GridLayout (3 rows, 2 columns)
        frame.setLayout(new GridLayout(3, 2));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JTextField passField = new JTextField();

        JButton loginButton = new JButton("Login");

        // Add components in order (GridLayout fills row by row)
        frame.add(userLabel);
        frame.add(userField);

        frame.add(passLabel);
        frame.add(passField);

        frame.add(new JLabel()); // empty cell for spacing
        frame.add(loginButton);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}