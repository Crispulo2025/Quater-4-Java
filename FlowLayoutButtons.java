import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutButtons {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("FlowLayout Example");

        // Set layout to FlowLayout (side by side)
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add buttons to frame
        frame.add(button1);
        frame.add(button2);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}