import javax.swing.*;
import java.awt.*;

public class ResizableSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resizable Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new BorderLayout(10, 10));

        // Top panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(new JLabel("Resizable Swing Interface"));

        // Center panel
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));

        // Bottom panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(new JButton("OK"));
        bottomPanel.add(new JButton("Cancel"));

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
