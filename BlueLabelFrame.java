import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class BlueLabelFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Blue Label Example");

        // Create JLabel
        JLabel label = new JLabel("Hello, this is a blue label!", JLabel.CENTER);

        // Set text color (foreground)
        label.setForeground(Color.BLUE);

        // Optional: make text a bit bigger for visibility
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Add label to frame
        frame.add(label);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}