import javax.swing.*;
import java.awt.*;

public class ThreeLayoutsExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Three Layout Managers Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with FlowLayout (menu buttons)
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        northPanel.add(new JButton("New"));
        northPanel.add(new JButton("Open"));
        northPanel.add(new JButton("Save"));

        // CENTER panel with GridLayout (content buttons)
        JPanel centerPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            centerPanel.add(new JButton("Content " + i));
        }

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
