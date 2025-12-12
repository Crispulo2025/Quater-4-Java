import javax.swing.*;
import java.awt.*;

public class ColoredPanelsExample extends JFrame {

    public ColoredPanelsExample() {
        // Frame properties
        setTitle("BorderLayout with Colored Panels");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set BorderLayout
        setLayout(new BorderLayout(10, 10)); // 10px horizontal and vertical gaps

        // NORTH panel (red)
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.add(new JLabel("NORTH Panel"));
        add(northPanel, BorderLayout.NORTH);

        // CENTER panel (green)
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GREEN);
        centerPanel.add(new JLabel("CENTER Panel"));
        add(centerPanel, BorderLayout.CENTER);

        // SOUTH panel (blue)
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.add(new JLabel("SOUTH Panel"));
        add(southPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColoredPanelsExample().setVisible(true);
        });
    }
}
