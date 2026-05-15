import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFieldToDialog {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Text Field Example");

        // Create text field
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        // Create button
        JButton button = new JButton("Show Text");
        button.setBounds(50, 100, 200, 30);

        // Button action
        button.addActionListener(e -> {
            String text = textField.getText();
            JOptionPane.showMessageDialog(frame, text);
        });

        // Add components
        frame.add(textField);
        frame.add(button);

        // Set layout to null for absolute positioning
        frame.setLayout(null);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}