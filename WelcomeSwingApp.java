import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class WelcomeSwingApp {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Swing Example");

        // Create the JLabel
        JLabel label = new JLabel("Welcome to Java Swing", JLabel.CENTER);

        // Create the JButton
        JButton button = new JButton("Click Me");

        // Set layout manager
        frame.setLayout(new BorderLayout());

        // Add components to the frame
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
