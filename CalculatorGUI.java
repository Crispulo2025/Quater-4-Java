import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- Top panel: Display -----
        JPanel displayPanel = new JPanel(new FlowLayout());
        JTextField displayField = new JTextField(15);
        displayField.setEditable(false); // Make display read-only
        displayPanel.add(displayField);

        // ----- Center panel: Number buttons using GridLayout -----
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(new JButton(String.valueOf(i)));
        }
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("="));

        // Add panels to frame
        frame.add(displayPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
