import javax.swing.*;
import java.awt.*;

public class BorderWithGrid extends JFrame {

    public BorderWithGrid() {
        // Frame properties
        setTitle("BorderLayout with GridPanel");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set BorderLayout for main frame
        setLayout(new BorderLayout(10, 10));

        // NORTH, SOUTH, EAST, WEST labels (optional)
        add(new JLabel("NORTH", SwingConstants.CENTER), BorderLayout.NORTH);
        add(new JLabel("SOUTH", SwingConstants.CENTER), BorderLayout.SOUTH);
        add(new JLabel("EAST", SwingConstants.CENTER), BorderLayout.EAST);
        add(new JLabel("WEST", SwingConstants.CENTER), BorderLayout.WEST);

        // CENTER panel with 2 rows x 3 columns GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(2, 3, 5, 5)); // 5px gaps
        for (int i = 1; i <= 6; i++) {
            centerPanel.add(new JButton("Button " + i));
        }

        add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BorderWithGrid().setVisible(true);
        });
    }
}
