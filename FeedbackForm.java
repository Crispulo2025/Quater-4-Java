import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeedbackForm {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Feedback Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Instruction label (top)
        JLabel instruction = new JLabel(
                "Please enter your feedback below:",
                SwingConstants.CENTER
        );

        // Text area for feedback
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Submit button
        JButton submitButton = new JButton("Submit");

        // Action listener for button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String feedback = textArea.getText();

                // Print to console
                System.out.println("=== User Feedback ===");
                System.out.println(feedback);
                System.out.println("=====================");

                // Optional: clear after submit
                textArea.setText("");
            }
        });

        // Bottom panel for button
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(submitButton);

        // Add components to frame
        frame.add(instruction, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}