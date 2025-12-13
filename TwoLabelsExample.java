import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class TwoLabelsExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Two Labels Side by Side");

        // Set FlowLayout to arrange components horizontally
        frame.setLayout(new FlowLayout());

        // Create two JLabels
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        // Add labels to the frame
        frame.add(label1);
        frame.add(label2);

        // Set frame properties
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
