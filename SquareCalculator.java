import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareCalculator extends JFrame implements ActionListener {

    private JTextField inputField;
    private JLabel resultLabel;
    private JButton computeButton;

    public SquareCalculator() {

        // Frame setup
        setTitle("Square Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field
        inputField = new JTextField(10);

        // Button
        computeButton = new JButton("Square It");
        computeButton.addActionListener(this);

        // Result label
        resultLabel = new JLabel("Result: ");

        // Add components
        add(new JLabel("Enter a number:"));
        add(inputField);
        add(computeButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num = Double.parseDouble(inputField.getText());
            double square = num * num;

            resultLabel.setText("Result: " + square);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Please enter a number.");
        }
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}