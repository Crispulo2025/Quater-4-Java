import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class DisabledButtonExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Disabled Button Example");

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Disable the button
        button.setEnabled(false);

        // Add button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
