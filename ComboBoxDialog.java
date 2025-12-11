import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Message Dialog");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JComboBox items
        String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Button to show dialog
        JButton showButton = new JButton("Show Selection");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "You selected: " + selected);
            }
        });

        frame.add(new JLabel("Select an option:"));
        frame.add(comboBox);
        frame.add(showButton);

        frame.setVisible(true);
    }
}
