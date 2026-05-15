import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class NameLabelFrame {

    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Name Display");

        // Create JLabel with your name
        JLabel label = new JLabel("Cris Maranan", SwingConstants.CENTER);

        // Set font style and size
        label.setFont(new Font("Arial", Font.BOLD, 24));

        // Add label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(500, 400);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}