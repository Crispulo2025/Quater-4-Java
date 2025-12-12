import javax.swing.*;
import java.awt.*;

public class NestedPanelExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Nested JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the outer panel with BorderLayout
        JPanel outerPanel = new JPanel(new BorderLayout(10, 10));

        // Create the inner panel with FlowLayout
        JPanel innerPanel = new JPanel(new FlowLayout());

        // Create two buttons and add them to the inner panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        innerPanel.add(button1);
        innerPanel.add(button2);

        // Add the inner panel to the CENTER of the outer panel
        outerPanel.add(innerPanel, BorderLayout.CENTER);

        // Optionally add a label at the NORTH of the outer panel
        outerPanel.add(new JLabel("Nested JPanel Example", JLabel.CENTER), BorderLayout.NORTH);

        // Add the outer panel to the frame
        frame.add(outerPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
