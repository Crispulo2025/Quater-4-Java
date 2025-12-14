import javax.swing.*;
import java.awt.*;

public class BoxLayoutXAxisExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BoxLayout X-Axis Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        // Create a panel with BoxLayout on X-axis
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Create components
        JButton button1 = new JButton("Button 1");
        JTextField textField = new JTextField(15);
        JButton button2 = new JButton("Button 2");

        // Optional: add horizontal spacing between components
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(10, 0))); // 10px horizontal space
        panel.add(textField);
        panel.add(Box.createRigidArea(new Dimension(10, 0))); // 10px horizontal space
        panel.add(button2);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
