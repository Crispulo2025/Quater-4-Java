import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DynamicMessageApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic Message Example");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // ComboBox items
        String[] items = {"Morning", "Afternoon", "Evening", "Night"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Label to show message
        JLabel messageLabel = new JLabel("Select a time of day.");

        // Update label dynamically
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                switch (selected) {
                    case "Morning": messageLabel.setText("Good Morning!"); break;
                    case "Afternoon": messageLabel.setText("Good Afternoon!"); break;
                    case "Evening": messageLabel.setText("Good Evening!"); break;
                    case "Night": messageLabel.setText("Good Night!"); break;
                }
            }
        });

        frame.add(new JLabel("Select Time:"));
        frame.add(comboBox);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}
