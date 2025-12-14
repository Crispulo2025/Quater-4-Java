import javax.swing.*;
import java.awt.*;

public class BorderLayoutEastWest {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("BorderLayout with Multiple Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // Create WEST panel with GridLayout for multiple buttons
        JPanel westPanel = new JPanel(new GridLayout(3, 1, 5, 5)); // 3 buttons vertically
        westPanel.add(new JButton("West 1"));
        westPanel.add(new JButton("West 2"));
        westPanel.add(new JButton("West 3"));

        // Create EAST panel with GridLayout for multiple buttons
        JPanel eastPanel = new JPanel(new GridLayout(3, 1, 5, 5)); // 3 buttons vertically
        eastPanel.add(new JButton("East 1"));
        eastPanel.add(new JButton("East 2"));
        eastPanel.add(new JButton("East 3"));

        // CENTER panel with a text area
        JTextArea centerArea = new JTextArea("Center Area");
        JScrollPane scrollPane = new JScrollPane(centerArea);

        // Add panels to the frame
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
