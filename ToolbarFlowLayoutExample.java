import javax.swing.*;
import java.awt.*;

public class ToolbarFlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Toolbar panel using FlowLayout
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));

        // Add some icon buttons (using text for simplicity)
        for (int i = 1; i <= 10; i++) {
            JButton iconButton = new JButton("Icon " + i);
            toolbar.add(iconButton);
        }

        // Place toolbar in NORTH region
        mainPanel.add(toolbar, BorderLayout.NORTH);

        // Center panel (dummy content)
        JPanel centerPanel = new JPanel();
        centerPanel.add(new JLabel("Main Content Area"));
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
