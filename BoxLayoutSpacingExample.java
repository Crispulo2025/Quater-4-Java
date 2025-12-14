import javax.swing.*;
import java.awt.*;

public class BoxLayoutSpacingExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BoxLayout Spacing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel with BoxLayout on Y-axis
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Center-align buttons
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components with spacing
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // 20px vertical space
        panel.add(button2);
        panel.add(Box.createVerticalGlue()); // flexible space that grows
        panel.add(button3);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
