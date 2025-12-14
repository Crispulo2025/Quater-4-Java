import javax.swing.*;
import java.awt.*;

public class ResizeDemo {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Automatic Resizing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Use BorderLayout
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel northLabel = new JLabel("NORTH", JLabel.CENTER);
        JTextArea centerArea = new JTextArea("Resize the window to see me adjust!");
        JButton southButton = new JButton("SOUTH");

        // Add components to regions
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(new JScrollPane(centerArea), BorderLayout.CENTER);
        frame.add(southButton, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}
