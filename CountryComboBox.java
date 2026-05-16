import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class CountryComboBox {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country Selector");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create label
        JLabel label = new JLabel("Select a country:");

        // Create JComboBox with 5 countries
        String[] countries = {"Philippines", "Japan", "China", "USA", "Canada"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        // Update label when selection changes
        comboBox.addActionListener(e -> {
            String selectedCountry = (String) comboBox.getSelectedItem();
            label.setText("Selected: " + selectedCountry);
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