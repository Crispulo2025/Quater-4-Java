import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // Set FlowLayout for the frame
        frame.setLayout(new FlowLayout());

        // Create and add buttons
        for (int i = 1; i <= 5; i++) {
            JButton button = new JButton("Button " + i);
            frame.add(button);
        }

        // Make frame visible
        frame.setVisible(true);
    }
}
