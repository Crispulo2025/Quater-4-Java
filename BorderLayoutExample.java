import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set BorderLayout (default for JFrame, but set explicitly for clarity)
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel labelNorth = new JLabel("Welcome to the Application", JLabel.CENTER);
        JButton buttonSouth = new JButton("Submit");
        JTextArea textAreaCenter = new JTextArea();

        // Add components to the frame
        frame.add(labelNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(new JScrollPane(textAreaCenter), BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
