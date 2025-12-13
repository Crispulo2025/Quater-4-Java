import javax.swing.*;
import java.awt.*;

public class NavigationFlowLayout {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Navigation Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // Top panel with FlowLayout for navigation buttons
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create navigation buttons
        JButton btnPrevious = new JButton("Previous");
        JButton btnHome = new JButton("Home");
        JButton btnNext = new JButton("Next");

        // Add buttons to top panel
        topPanel.add(btnPrevious);
        topPanel.add(btnHome);
        topPanel.add(btnNext);

        // Add top panel to the frame (NORTH region)
        frame.add(topPanel, BorderLayout.NORTH);

        // Center panel (optional content area)
        JPanel centerPanel = new JPanel();
        centerPanel.add(new JLabel("Main Content Area"));
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
