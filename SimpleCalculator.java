import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Simple Calculator");

        // Set grid layout (3 rows x 4 columns)
        frame.setLayout(new GridLayout(4, 3));

        // Create number buttons 0–9
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton(String.valueOf(i)));
        }

        // Add 0 button at the end
        frame.add(new JButton("0"));

        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}