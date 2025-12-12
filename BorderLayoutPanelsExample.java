import javax.swing.*;
import java.awt.*;

public class BorderLayoutPanelsExample extends JFrame {

    public BorderLayoutPanelsExample() {
        // Frame properties
        setTitle("BorderLayout with Three Panels");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set BorderLayout for the frame
        setLayout(new BorderLayout(10, 10)); // 10px horizontal and vertical gaps

        // NORTH panel
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.add(new JLabel("North Panel"));
        add(northPanel, BorderLayout.NORTH);

        // CENTER panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GREEN);
        centerPanel.add(new JButton("Center Button"));
        add(centerPanel, BorderLayout.CENTER);

        // SOUTH panel
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.add(new JTextField("South TextField", 15));
        add(southPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BorderLayoutPanelsExample().setVisible(true);
        });
    }
}
