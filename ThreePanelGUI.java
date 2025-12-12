import javax.swing.*;
import java.awt.*;

public class ThreePanelGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Panel Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // NORTH panel
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.CYAN);
        northPanel.add(new JButton("North Button"));

        // CENTER panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(new JButton("Center Button"));

        // SOUTH panel
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.PINK);
        southPanel.add(new JButton("South Button"));

        // Add panels to frame
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
