import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class FlowLayoutButtonsApp {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add panel to frame
        frame.add(panel);

        // Show window
        frame.setVisible(true);
    }
}