import javax.swing.*;
import java.awt.*;

public class BorderLayoutCenterOnly {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BorderLayout - CENTER Only");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Add only the CENTER component
        JTextArea centerArea = new JTextArea("This is the CENTER component.\nIt expands to fill the entire window.");
        frame.add(new JScrollPane(centerArea), BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
