import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SumTwoNumbers {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Sum of Two Numbers");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create text fields
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);

        // Create button
        JButton button = new JButton("Compute Sum");

        // Button click event
        button.addActionListener(e -> {
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;

                JOptionPane.showMessageDialog(frame, "Sum: " + sum);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
            }
        });

        // Add components
        frame.add(num1);
        frame.add(num2);
        frame.add(button);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}