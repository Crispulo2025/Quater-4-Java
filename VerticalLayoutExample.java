import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class VerticalLayoutExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Vertical Layout Example");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Set BoxLayout to arrange components vertically (Y_AXIS)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create components
        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20);
        JButton button = new JButton("Submit");

        // Add components to the panel with some spacing
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);

        // Add panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
