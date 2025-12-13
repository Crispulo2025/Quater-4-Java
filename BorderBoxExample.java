import javax.swing.*;
import java.awt.*;

public class BorderBoxExample {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("BorderLayout with BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // WEST panel with BoxLayout (Y_AXIS)
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBackground(Color.LIGHT_GRAY);
        westPanel.add(new JButton("West Button 1"));
        westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(new JButton("West Button 2"));
        westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(new JButton("West Button 3"));

        // EAST panel with BoxLayout (Y_AXIS)
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        eastPanel.setBackground(Color.CYAN);
        eastPanel.add(new JButton("East Button 1"));
        eastPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        eastPanel.add(new JButton("East Button 2"));
        eastPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        eastPanel.add(new JButton("East Button 3"));

        // CENTER panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(new JLabel("Center Panel"));

        // Add panels to main panel
        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
