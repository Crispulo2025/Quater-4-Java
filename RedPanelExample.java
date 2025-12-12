import javax.swing.*;
import java.awt.*;

public class RedPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Red Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JPanel with red background
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);

        // Create a JLabel and add it to the panel
        JLabel label = new JLabel("Welcome to Java GUI");
        label.setForeground(Color.WHITE); // Optional: to make text visible on red
        panel.add(label);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
