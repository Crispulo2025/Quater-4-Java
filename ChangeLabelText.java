import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ChangeLabelText {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Change Label Text");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create label
        JLabel label = new JLabel("Enter your name:");

        // Create text field
        JTextField textField = new JTextField(15);

        // Create button
        JButton button = new JButton("Submit");

        // Button action: change label text when clicked
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });

        // Add components
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Frame settings
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}