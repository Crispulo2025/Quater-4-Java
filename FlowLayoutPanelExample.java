import javax.swing.*;
import java.awt.*;

public class FlowLayoutPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("FlowLayout Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Create buttons
        JButton addButton = new JButton("Add");
        JButton editButton = new JButton("Edit");
        JButton deleteButton = new JButton("Delete");

        // Add buttons to the panel
        panel.add(addButton);
        panel.add(editButton);
        panel.add(deleteButton);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
