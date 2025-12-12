import javax.swing.*;
import java.awt.*;

public class GridButtonGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("3x3 Button Grid GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- NORTH: Header -----
        JLabel headerLabel = new JLabel("Button Grid Example", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(headerLabel, BorderLayout.NORTH);

        // ----- CENTER: 3x3 Grid of buttons -----
        JPanel centerPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            centerPanel.add(new JButton("Button " + i));
        }
        frame.add(centerPanel, BorderLayout.CENTER);

        // ----- SOUTH: Status label -----
        JLabel statusLabel = new JLabel("Status: Ready", JLabel.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
