import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonClickMessage {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Button Click Example");

        // Create JButton
        JButton button = new JButton("Click Me");

        // Add action listener to show message dialog
        button.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}