import javax.swing.*;
import java.awt.*;

public class FlowVsGrid extends JFrame {

    public FlowVsGrid(boolean useGrid) {
        setTitle("FlowLayout vs GridLayout Example");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel;

        if (useGrid) {
            // GridLayout with 2 rows and 3 columns
            panel = new JPanel(new GridLayout(2, 3, 5, 5)); // 5px gaps
        } else {
            // FlowLayout
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // left aligned
        }

        // Add buttons
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("Button " + i));
        }

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Change to 'true' to see GridLayout version
            new FlowVsGrid(false).setVisible(true); // FlowLayout
        });
    }
}
