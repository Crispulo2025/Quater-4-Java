import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {

        // Frame settings
        setTitle("GridLayout Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 10, 10));

        // Add six buttons
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));

        // Add panel to frame
        add(panel);

        // Display frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}