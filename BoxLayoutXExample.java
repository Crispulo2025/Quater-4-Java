import javax.swing.*;
import java.awt.*;

public class BoxLayoutXExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("BoxLayout X-Axis Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        // Create a panel with BoxLayout (X_AXIS)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Create buttons
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");

        // Add buttons with rigid areas for spacing
        panel.add(btn1);
        panel.add(Box.createRigidArea(new Dimension(10, 0))); // horizontal space
        panel.add(btn2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(btn3);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
