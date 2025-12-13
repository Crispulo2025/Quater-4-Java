import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Create panels with different colors
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.add(new JLabel("NORTH"));

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.add(new JLabel("SOUTH"));

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GREEN);
        eastPanel.add(new JLabel("EAST"));

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.ORANGE);
        westPanel.add(new JLabel("WEST"));

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(new JLabel("CENTER"));

        // Add panels to frame
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
