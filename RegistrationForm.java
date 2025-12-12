import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new BorderLayout());

        // ----- NORTH: Header -----
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Registration Form"));
        frame.add(topPanel, BorderLayout.NORTH);

        // ----- CENTER: Form fields using GridLayout -----
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        centerPanel.add(new JLabel("Name:"));
        centerPanel.add(new JTextField(12));

        centerPanel.add(new JLabel("Age:"));
        centerPanel.add(new JTextField(5));

        centerPanel.add(new JLabel("Email:"));
        centerPanel.add(new JTextField(12));

        frame.add(centerPanel, BorderLayout.CENTER);

        // ----- SOUTH: Submit button -----
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JButton("Submit"));
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
