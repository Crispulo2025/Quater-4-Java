import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class PanelExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("JPanel Example");

        // Create a JPanel and set its layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create components to add to the panel
        JLabel label = new JLabel("Enter something:");
        JButton button = new JButton("Submit");

        // Add components to the panel
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
