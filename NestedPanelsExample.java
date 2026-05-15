import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class NestedPanelsExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Nested JPanel Example");

        // Create label panel
        JPanel labelPanel = new JPanel();
        JLabel label = new JLabel("Welcome to Nested Panels");
        labelPanel.add(label);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Cancel");

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Add panels to frame
        frame.setLayout(new BorderLayout());
        frame.add(labelPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}