import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FruitComboBox {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Favorite Fruit Selector");

        // Fruits for JComboBox
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        // Create JComboBox
        JComboBox<String> comboBox = new JComboBox<>(fruits);

        // Add action listener to detect selection change
        comboBox.addActionListener(e -> {
            String selectedFruit = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, "You selected: " + selectedFruit);
        });

        // Add combo box to frame
        frame.add(comboBox);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}