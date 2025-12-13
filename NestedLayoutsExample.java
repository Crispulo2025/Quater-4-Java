import javax.swing.*;
import java.awt.*;

public class NestedLayoutsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Layouts Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Main panel with vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Top panel with FlowLayout
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.setBackground(Color.CYAN);
        topPanel.add(new JButton("Flow 1"));
        topPanel.add(new JButton("Flow 2"));
        topPanel.add(new JButton("Flow 3"));

        // Middle panel with GridLayout
        JPanel middlePanel = new JPanel(new GridLayout(2, 2, 5, 5));
        middlePanel.setBackground(Color.LIGHT_GRAY);
        middlePanel.add(new JButton("Grid 1"));
        middlePanel.add(new JButton("Grid 2"));
        middlePanel.add(new JButton("Grid 3"));
        middlePanel.add(new JButton("Grid 4"));

        // Bottom panel with BorderLayout
        JPanel bottomPanel = new JPanel(new BorderLayout(5, 5));
        bottomPanel.setBackground(Color.PINK);
        bottomPanel.add(new JButton("NORTH"), BorderLayout.NORTH);
        bottomPanel.add(new JButton("CENTER"), BorderLayout.CENTER);
        bottomPanel.add(new JButton("SOUTH"), BorderLayout.SOUTH);

        // Add panels to main panel
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(bottomPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
