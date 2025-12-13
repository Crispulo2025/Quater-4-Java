import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("FlowLayout Example");

        // Set FlowLayout as the layout manager
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        // Add buttons to the frame
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        // Set frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
