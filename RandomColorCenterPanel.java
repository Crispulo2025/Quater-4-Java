import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomColorCenterPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        frame.setLayout(new BorderLayout());

        // --- CENTER PANEL: background changes here ---
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);

        // Random generator
        Random rand = new Random();

        // --- ACTION LISTENER: changes center panel color ---
        ActionListener colorChanger = e -> {
            // Generate a random color
            Color randomColor = new Color(
                rand.nextInt(256),
                rand.nextInt(256),
                rand.nextInt(256)
            );
            centerPanel.setBackground(randomColor);
        };

        // --- NORTH PANEL ---
        JPanel northPanel = new JPanel();
        JButton btnNorth = new JButton("North Button");
        btnNorth.addActionListener(colorChanger);
        northPanel.add(btnNorth);

        // --- SOUTH PANEL ---
        JPanel southPanel = new JPanel();
        JButton btnSouth = new JButton("South Button");
        btnSouth.addActionListener(colorChanger);
        southPanel.add(btnSouth);

        // --- EAST PANEL ---
        JPanel eastPanel = new JPanel();
        JButton btnEast = new JButton("East Button");
        btnEast.addActionListener(colorChanger);
        eastPanel.add(btnEast);

        // --- WEST PANEL ---
        JPanel westPanel = new JPanel();
        JButton btnWest = new JButton("West Button");
        btnWest.addActionListener(colorChanger);
        westPanel.add(btnWest);

        // Add panels to frame
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);

        frame.setVisible(true);
    }
}
