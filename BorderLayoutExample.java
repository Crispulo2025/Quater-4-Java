import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class BorderLayoutExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("BorderLayout Example");

        // Set BorderLayout as the layout manager
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel label = new JLabel("This is the NORTH region", JLabel.CENTER);
        JButton button = new JButton("Click Me");
        JTextField textField = new JTextField();

        // Add components to specific regions
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);
        frame.add(textField, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
