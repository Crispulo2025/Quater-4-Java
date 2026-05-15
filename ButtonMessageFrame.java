import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonMessageFrame {

    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Button Example");

        // Create the button
        JButton button = new JButton("Click Me");

        // Add action listener to the button
        button.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Button was clicked!")
        );

        // Add button to the frame
        frame.add(button);

        // Set frame size
        frame.setSize(500, 400);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}