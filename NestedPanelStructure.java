import javax.swing.*;
import java.awt.*;

public class NestedPanelStructure {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panel Structure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // --- CENTER panel: GridLayout 2x2 for buttons ---
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));

        // --- EAST panel: BoxLayout vertical for checkboxes ---
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        
        JCheckBox cb1 = new JCheckBox("Option A");
        JCheckBox cb2 = new JCheckBox("Option B");
        JCheckBox cb3 = new JCheckBox("Option C");

        eastPanel.add(cb1);
        eastPanel.add(Box.createVerticalStrut(8));  // spacing
        eastPanel.add(cb2);
        eastPanel.add(Box.createVerticalStrut(8));
        eastPanel.add(cb3);

        // --- SOUTH panel: Feedback label ---
        JPanel southPanel = new JPanel();
        JLabel feedbackLabel = new JLabel("Waiting for user action...");
        southPanel.add(feedbackLabel);

        // Add all subpanels to main panel
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        frame.add(mainPanel);

        frame.setVisible(true);
    }
}
