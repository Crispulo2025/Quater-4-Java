import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Create JLabels
        JLabel northLabel = new JLabel("NORTH", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("SOUTH", SwingConstants.CENTER);
        JLabel eastLabel = new JLabel("EAST", SwingConstants.CENTER);
        JLabel westLabel = new JLabel("WEST", SwingConstants.CENTER);
        JLabel centerLabel = new JLabel("CENTER", SwingConstants.CENTER);

        // Add labels to BorderLayout regions
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}