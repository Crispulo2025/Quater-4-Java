import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting Form");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel and JTextField for name input
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);

        // JButton to show greeting
        JButton greetButton = new JButton("Greet Me");

        // ActionListener for button
        greetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Hello, " + name + "! Welcome!");
                }
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(greetButton);

        frame.setVisible(true);
    }
}
