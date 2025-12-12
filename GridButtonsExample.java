import javax.swing.*;
import java.awt.*;

public class GridButtonsExample extends JFrame {

    public GridButtonsExample() {
        // Frame properties
        setTitle("2x5 GridLayout Buttons");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with 2 rows, 5 columns GridLayout, 5px gaps
        JPanel panel = new JPanel(new GridLayout(2, 5, 5, 5));

        // Add 10 buttons
        for (int i = 1; i <= 10; i++) {
            panel.add(new JButton("Button " + i));
        }

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GridButtonsExample().setVisible(true);
        });
    }
}
