import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloUserDialog {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Hello User Example");

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Create the button
        JButton button = new JButton("Click Me");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display message dialog when button is clicked
                JOptionPane.showMessageDialog(frame, "Hello, User!");
            }
        });

        // Add button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
