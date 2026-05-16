import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmptyFieldChecker {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("TextField Validation");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String text = textField.getText().trim();

                // Check if text field is empty
                if (text.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            frame,
                            "Error: Text field cannot be empty!",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            frame,
                            "Hello, " + text + "!"
                    );
                }
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}