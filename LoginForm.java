import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new BorderLayout());

        // ---------- Top Panel (Header) ----------
        JPanel topPanel = new JPanel();
        JLabel headerLabel = new JLabel("User Login");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        topPanel.add(headerLabel);

        // ---------- Middle Panel (GridLayout for username/password) ----------
        JPanel middlePanel = new JPanel(new GridLayout(2, 2, 5, 5));
        middlePanel.add(new JLabel("Username:"));
        middlePanel.add(new JTextField(12));
        middlePanel.add(new JLabel("Password:"));
        middlePanel.add(new JPasswordField(12));

        // ---------- Bottom Panel (Buttons with FlowLayout) ----------
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(new JButton("Login"));
        bottomPanel.add(new JButton("Cancel"));

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
