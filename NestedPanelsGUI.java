import javax.swing.*;
import java.awt.*;

public class NestedPanelsGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Nested Panels Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ----- Main panel with BorderLayout -----
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // ----- CENTER Panel: 2x2 GridLayout buttons -----
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));

        // ----- EAST Panel: Vertical BoxLayout with 3 checkboxes -----
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        eastPanel.add(new JCheckBox("Option 1"));
        eastPanel.add(new JCheckBox("Option 2"));
        eastPanel.add(new JCheckBox("Option 3"));

        // ----- SOUTH Panel: Feedback label -----
        JPanel southPanel = new JPanel();
        JLabel feedbackLabel = new JLabel("Feedback will appear here.");
        southPanel.add(feedbackLabel);

        // ----- Add panels to main panel -----
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
