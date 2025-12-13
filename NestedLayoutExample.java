import javax.swing.*;
import java.awt.*;

public class NestedLayoutExample {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Nested Layouts Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // Top panel with FlowLayout
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.add(new JButton("Home"));
        topPanel.add(new JButton("Settings"));
        topPanel.add(new JButton("Profile"));

        // Center panel with GridLayout 2x2
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));

        // Add panels to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
