import javax.swing.*;
import java.awt.*;

public class GridLayoutPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("GridLayout Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JPanel with GridLayout (2 rows, 3 columns)
        JPanel panel = new JPanel(new GridLayout(2, 3, 5, 5)); // 5px gaps

        // Create and add six buttons
        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
