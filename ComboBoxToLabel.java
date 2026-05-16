import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxToLabel {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JLabel
        JLabel label = new JLabel("Selected item will appear here");

        // Create JComboBox
        String[] items = {"Apple", "Banana", "Mango", "Orange", "Grape"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Add ActionListener to JComboBox
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                label.setText("Selected: " + selectedItem);
            }
        });

        // Add components to frame
        frame.add(comboBox);
        frame.add(label);

        // Show frame
        frame.setVisible(true);
    }
}