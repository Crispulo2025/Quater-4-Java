import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BoxLayout with Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Main panel using vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // -------- Panel 1: FlowLayout --------
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout Panel"));
        flowPanel.add(new JLabel("Name:"));
        flowPanel.add(new JTextField(10));

        // -------- Panel 2: GridLayout --------
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout Panel"));
        gridPanel.add(new JButton("Button 1"));
        gridPanel.add(new JButton("Button 2"));
        gridPanel.add(new JButton("Button 3"));
        gridPanel.add(new JButton("Button 4"));

        // -------- Panel 3: BorderLayout --------
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(BorderFactory.createTitledBorder("BorderLayout Panel"));
        borderPanel.add(new JLabel("North Label"), BorderLayout.NORTH);
        borderPanel.add(new JButton("Center Button"), BorderLayout.CENTER);

        // Add all panels to main panel
        mainPanel.add(flowPanel);
        mainPanel.add(gridPanel);
        mainPanel.add(borderPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
