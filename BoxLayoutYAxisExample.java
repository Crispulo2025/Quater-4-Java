import javax.swing.*;
import java.awt.*;

public class BoxLayoutYAxisExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BoxLayout Y-Axis Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel and set BoxLayout on Y-axis
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create labels
        JLabel label1 = new JLabel("First Label");
        JLabel label2 = new JLabel("Second Label");
        JLabel label3 = new JLabel("Third Label");

        // Optional: center-align labels horizontally
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add labels to panel
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
