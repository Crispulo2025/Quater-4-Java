import javax.swing.*;
import java.awt.*;

public class NestedPanelsExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Nested Panels Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with FlowLayout
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(new JLabel("Header Label"));
        northPanel.add(new JButton("Info"));

        // CENTER panel with GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));

        // SOUTH panel with BoxLayout (X-axis)
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.X_AXIS));
        southPanel.add(new JButton("OK"));
        southPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        southPanel.add(new JButton("Cancel"));

        // Add nested panels to main panel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
