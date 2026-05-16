import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FavoriteFruitsGUI {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Favorite Fruits");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JCheckBoxes
        JCheckBox apple = new JCheckBox("Apple");
        JCheckBox banana = new JCheckBox("Banana");
        JCheckBox mango = new JCheckBox("Mango");
        JCheckBox orange = new JCheckBox("Orange");
        JCheckBox grape = new JCheckBox("Grape");

        // Create JButton
        JButton button = new JButton("Show Selected Fruits");

        // Create JTextArea
        JTextArea textArea = new JTextArea(8, 25);
        textArea.setEditable(false);

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selectedFruits = "Selected Fruits:\n";

                if (apple.isSelected()) {
                    selectedFruits += "- Apple\n";
                }

                if (banana.isSelected()) {
                    selectedFruits += "- Banana\n";
                }

                if (mango.isSelected()) {
                    selectedFruits += "- Mango\n";
                }

                if (orange.isSelected()) {
                    selectedFruits += "- Orange\n";
                }

                if (grape.isSelected()) {
                    selectedFruits += "- Grape\n";
                }

                textArea.setText(selectedFruits);
            }
        });

        // Add components to frame
        frame.add(apple);
        frame.add(banana);
        frame.add(mango);
        frame.add(orange);
        frame.add(grape);

        frame.add(button);
        frame.add(new JScrollPane(textArea));

        // Make frame visible
        frame.setVisible(true);
    }
}