import javax.swing.*;
import java.awt.*;

public class GridButtonFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayout with GridLayout Center");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- CENTER panel with 2x4 GridLayout -----
        JPanel centerPanel = new JPanel(new GridLayout(2, 4, 5, 5));

        // Add buttons labeled Button 1 to Button 8
        for (int i = 1; i <= 8; i++) {
            centerPanel.add(new JButton("Button " + i));
        }

        // Add center panel to frame
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
