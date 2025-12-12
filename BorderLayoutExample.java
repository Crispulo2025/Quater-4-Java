import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // NORTH region: JLabel
        JLabel nameLabel = new JLabel("Cris Maranan", JLabel.CENTER);
        frame.add(nameLabel, BorderLayout.NORTH);

        // CENTER region: JTextArea
        JTextArea textArea = new JTextArea();
        frame.add(textArea, BorderLayout.CENTER);

        // SOUTH region: JButton
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}
