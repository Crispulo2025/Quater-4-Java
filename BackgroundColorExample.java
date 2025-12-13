import javax.swing.JFrame;
import java.awt.Color;

public class BackgroundColorExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Background Color Example");

        // Set the size of the window
        frame.setSize(400, 300);

        // Set the background color of the content pane
        frame.getContentPane().setBackground(Color.CYAN); // You can change Color.CYAN to any Color

        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
