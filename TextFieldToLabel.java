import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class TextFieldToLabel {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("TextField to JLabel");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create JTextField
        JTextField textField = new JTextField(15);

        // Create JButton
        JButton button = new JButton("Display Text");

        // Create JLabel
        JLabel label = new JLabel("Entered text will appear here");

        // Button click event
        button.addActionListener(e -> {
            String text = textField.getText();
            label.setText("You entered: " + text);
        });

        // Add components
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}