import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class NameInputFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Name Input");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create label
        JLabel label = new JLabel("Enter your name:");

        // Create text field
        JTextField textField = new JTextField(20);

        // Add components to frame
        frame.add(label);
        frame.add(textField);

        // Frame settings
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}