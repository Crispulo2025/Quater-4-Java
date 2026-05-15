import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class ComboBoxEventDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("JComboBox Event Handling");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create label to display selection
        JLabel label = new JLabel("Select a fruit:");

        // Create JComboBox
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);

        // Update label when selection changes
        comboBox.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            label.setText("Selected: " + selected);
        });

        // Add components
        frame.add(comboBox);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}