import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {
        // Frame properties
        setTitle("Registration Form");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel with horizontal BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(10);

        // Age
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(15);

        // Submit button
        JButton submitButton = new JButton("Submit");

        // Add components with horizontal spacing
        panel.add(nameLabel);
        panel.add(Box.createHorizontalStrut(5));
        panel.add(nameField);
        panel.add(Box.createHorizontalStrut(15));

        panel.add(ageLabel);
        panel.add(Box.createHorizontalStrut(5));
        panel.add(ageField);
        panel.add(Box.createHorizontalStrut(15));

        panel.add(addressLabel);
        panel.add(Box.createHorizontalStrut(5));
        panel.add(addressField);
        panel.add(Box.createHorizontalStrut(15));

        panel.add(submitButton);

        // Action listener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();

                JOptionPane.showMessageDialog(null,
                        "Name: " + name + "\nAge: " + age + "\nAddress: " + address);
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }
}
