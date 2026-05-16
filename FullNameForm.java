import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FullNameForm {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Full Name Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Create components
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JButton displayButton = new JButton("Display Full Name");

        // Add ActionListener to button
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                String fullName = firstName + " " + lastName;

                JOptionPane.showMessageDialog(frame,
                        "Full Name: " + fullName);
            }
        });

        // Add components to frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);

        frame.add(lastNameLabel);
        frame.add(lastNameField);

        frame.add(new JLabel()); // Empty space
        frame.add(displayButton);

        // Make frame visible
        frame.setVisible(true);
    }
}