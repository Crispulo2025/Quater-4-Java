import javax.swing.*;
import java.awt.*;

public class SimpleDashboard {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // Optional top panel (header)
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);
        topPanel.add(new JLabel("Dashboard Header"));
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Center panel with GridLayout (2 rows x 3 columns)
        JPanel centerPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Button " + i);
            centerPanel.add(button);
        }
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Optional side panel
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.LIGHT_GRAY);
        sidePanel.add(new JLabel("Sidebar"));
        mainPanel.add(sidePanel, BorderLayout.EAST);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
