import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CitySelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("City Selector");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // List of 10 cities
        String[] cities = {
            "Manila", "Quezon City", "Cebu", "Davao",
            "Baguio", "Iloilo", "Taguig", "Mandaluyong",
            "Makati", "Pasig"
        };

        JComboBox<String> cityBox = new JComboBox<>(cities);
        JLabel label = new JLabel("Selected City: ");

        // Handle selection
        cityBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) cityBox.getSelectedItem();
                label.setText("Selected City: " + selected);
            }
        });

        frame.add(cityBox);
        frame.add(label);

        frame.setVisible(true);
    }
}
