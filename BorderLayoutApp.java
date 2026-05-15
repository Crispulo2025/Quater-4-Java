import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutApp {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create buttons
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Add buttons to specific regions
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Display window
        frame.setVisible(true);
    }
}