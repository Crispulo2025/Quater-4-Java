import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // ----- Display (Top) -----
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display, BorderLayout.NORTH);

        // ----- Buttons Panel (Center) with GridLayout -----
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // Number buttons 1–9 + 0
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(new JButton(String.valueOf(i)));
        }
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("="));

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
