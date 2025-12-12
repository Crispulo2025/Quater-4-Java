import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowButtonDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Button Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // Main frame layout
        frame.setLayout(new BorderLayout());

        // --- PANEL WITH FLOWLAYOUT ---
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        // Label at bottom
        JLabel displayLabel = new JLabel("Click a button...");
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create buttons
        String[] names = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        
        for (String name : names) {
            JButton btn = new JButton(name);

            // Add listener to show label text on click
            btn.addActionListener(e -> displayLabel.setText("You clicked: " + name));

            buttonPanel.add(btn);
        }

        // Add components to frame
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(displayLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
