import javax.swing.*;
import java.awt.*;

public class CalculatorGridLayout {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator Interface");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3, 5, 5));

        // Number buttons 1–9
        for (int i = 1; i <= 9; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }

        // Additional buttons
        panel.add(new JButton("0"));
        panel.add(new JButton("+"));
        panel.add(new JButton("="));

        frame.add(panel);
        frame.setVisible(true);
    }
}