import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GreetForm {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Greet Form");

        // Set FlowLayout
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel nameLabel = new JLabel("Enter your name: ");
        JTextField nameField = new JTextField(20);
        JButton greetButton = new JButton("Greet");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(greetButton);

        // Set frame properties
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
