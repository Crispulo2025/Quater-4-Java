import javax.swing.*;
import java.awt.*;

public class FormInterfaceExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Form Interface Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout(10, 10)); // gaps for clarity

        // NORTH region: form title
        JLabel titleLabel = new JLabel("User Registration Form", JLabel.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        // CENTER region: panel with GridLayout for labels and text fields
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5)); // 4 rows, 2 columns
        formPanel.add(new JLabel("First Name:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Last Name:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Email:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Phone:"));
        formPanel.add(new JTextField());

        frame.add(formPanel, BorderLayout.CENTER);

        // SOUTH region: submit button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}
