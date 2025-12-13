import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class TextFieldButtonExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Input Example");

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Create a JTextField wide enough for a short sentence
        JTextField textField = new JTextField(25);

        // Create a JButton
        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        frame.add(textField);
        frame.add(submitButton);

        // Set frame properties
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
