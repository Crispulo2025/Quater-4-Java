import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class NamePanelApp {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("My Name App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel
        JPanel panel = new JPanel();

        // Create JLabel with your name
        JLabel label = new JLabel("Your Name Here");

        // Add label to panel
        panel.add(label);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}