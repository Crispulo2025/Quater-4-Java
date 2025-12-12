import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldButtonExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("TextField and Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the main panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout(10, 10));

        // Create top panel for JTextField and button using FlowLayout
        JPanel inputPanel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        inputPanel.add(textField);
        inputPanel.add(submitButton);

        // Create label to display the text
        JLabel displayLabel = new JLabel("Your text will appear here.", JLabel.CENTER);

        // Add panels to main panel
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(displayLabel, BorderLayout.CENTER);

        // Add action listener to button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                displayLabel.setText(text);
            }
        });

        // Add main panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
