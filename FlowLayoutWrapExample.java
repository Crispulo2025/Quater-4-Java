import javax.swing.*;
import java.awt.*;

public class FlowLayoutWrapExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("FlowLayout Wrapping Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Add five buttons
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Button " + i));
        }

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
