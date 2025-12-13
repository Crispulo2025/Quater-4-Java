import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        // Set GridLayout with 3 rows and 4 columns, 5px horizontal and vertical gaps
        frame.setLayout(new GridLayout(3, 4, 5, 5));

        // Add twelve JLabel components
        for (int i = 1; i <= 12; i++) {
            JLabel label = new JLabel("Label " + i, SwingConstants.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            frame.add(label);
        }

        // Make frame visible
        frame.setVisible(true);
    }
}
