import javax.swing.JFrame;
import javax.swing.JButton;

public class SetBoundsExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("setBounds Example");

        // Disable the layout manager to allow manual positioning
        frame.setLayout(null);

        // Create a button
        JButton button = new JButton("Click Me");

        // Set the position and size of the button (x, y, width, height)
        button.setBounds(100, 50, 120, 40);

        // Add button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
