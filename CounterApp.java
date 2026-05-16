import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class CounterApp {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Counter Application");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Counter value
        final int[] counter = {0};

        // Label to display counter
        JLabel label = new JLabel("Counter: 0");

        // Buttons
        JButton increaseButton = new JButton("Increase");
        JButton resetButton = new JButton("Reset");

        // Increase counter
        increaseButton.addActionListener(e -> {
            counter[0]++;
            label.setText("Counter: " + counter[0]);
        });

        // Reset counter
        resetButton.addActionListener(e -> {
            counter[0] = 0;
            label.setText("Counter: 0");
        });

        // Add components
        frame.add(label);
        frame.add(increaseButton);
        frame.add(resetButton);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}