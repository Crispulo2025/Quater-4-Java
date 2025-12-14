import javax.swing.*;
import java.awt.*;

public class LayoutConsistencyDemo {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Layout Manager Consistency Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with FlowLayout (menu buttons)
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        northPanel.add(new JButton("Home"));
        northPanel.add(new JButton("Profile"));
        northPanel.add(new JButton("Settings"));

        // CENTER panel with GridLayout (content area)
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        centerPanel.add(new JButton("Content 1"));
        centerPanel.add(new JButton("Content 2"));
        centerPanel.add(new JButton("Content 3"));
        centerPanel.add(new JButton("Content 4"));

        // SOUTH panel with FlowLayout (action buttons)
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        southPanel.add(new JButton("OK"));
        southPanel.add(new JButton("Cancel"));

        // Add panels to main panel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
