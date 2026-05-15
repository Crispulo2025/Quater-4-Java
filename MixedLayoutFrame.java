import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MixedLayoutFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Mixed Layout Example");

        // Set main layout to BorderLayout
        frame.setLayout(new BorderLayout());

        // CENTER component
        JButton centerButton = new JButton("CENTER");
        frame.add(centerButton, BorderLayout.CENTER);

        // Create SOUTH panel with FlowLayout
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());

        // Buttons inside SOUTH panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        southPanel.add(button1);
        southPanel.add(button2);

        // Add panel to SOUTH region
        frame.add(southPanel, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}