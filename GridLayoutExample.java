import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("GridLayout Example");

        // Set GridLayout with 2 rows and 2 columns
        frame.setLayout(new GridLayout(2, 2));

        // Create four buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
