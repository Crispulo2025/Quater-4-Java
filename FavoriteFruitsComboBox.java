import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FavoriteFruitsComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Favorite Fruits");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel to display selection
        JLabel selectedLabel = new JLabel("Select your favorite fruit:");

        // JComboBox with five fruits
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        JComboBox<String> fruitBox = new JComboBox<>(fruits);

        // ActionListener to detect selection
        fruitBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = (String) fruitBox.getSelectedItem();
                selectedLabel.setText("Your favorite fruit: " + selectedFruit);
            }
        });

        // Add components to frame
        frame.add(fruitBox);
        frame.add(selectedLabel);

        frame.setVisible(true);
    }
}
