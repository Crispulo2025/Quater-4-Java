import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class ChangeBackgroundColor {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Change Background Color");

        // Create button
        JButton button = new JButton("Change Color");

        // Change background color when button is clicked
        button.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.CYAN);
        });

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}