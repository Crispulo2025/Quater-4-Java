import javax.swing.*;
import java.awt.*;

public class CombinedLayoutExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Combined FlowLayout and BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with FlowLayout for buttons
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        northPanel.add(new JButton("New"));
        northPanel.add(new JButton("Open"));
        northPanel.add(new JButton("Save"));

        // CENTER panel with a text area
        JTextArea textArea = new JTextArea("Type your text here...");
        JScrollPane scrollPane = new JScrollPane(textArea);

        // SOUTH panel with FlowLayout for action buttons
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        southPanel.add(new JButton("OK"));
        southPanel.add(new JButton("Cancel"));

        // Add panels to the main panel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
