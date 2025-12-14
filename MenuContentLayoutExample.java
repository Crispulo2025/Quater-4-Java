import javax.swing.*;
import java.awt.*;

public class MenuContentLayoutExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Menu and Content Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with FlowLayout for menu buttons
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        northPanel.add(new JButton("Home"));
        northPanel.add(new JButton("Profile"));
        northPanel.add(new JButton("Settings"));
        northPanel.add(new JButton("Logout"));

        // CENTER panel with GridLayout for content (e.g., 3x3 buttons)
        JPanel centerPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            centerPanel.add(new JButton("Item " + i));
        }

        // Add panels to main panel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
