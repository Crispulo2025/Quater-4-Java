import javax.swing.JFrame;
import java.awt.Color;

public class GrayBackgroundFrame {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Light Gray Background");

        // Set frame size
        frame.setSize(500, 400);

        // Change background color to light gray
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}