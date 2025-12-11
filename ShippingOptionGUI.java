import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShippingOptionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shipping Options");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Label to display delivery time
        JLabel deliveryLabel = new JLabel("Select a shipping option");

        // Radio buttons for shipping options
        JRadioButton standardBtn = new JRadioButton("Standard");
        JRadioButton expressBtn = new JRadioButton("Express");
        JRadioButton overnightBtn = new JRadioButton("Overnight");

        // Group radio buttons to allow only one selection
        ButtonGroup group = new ButtonGroup();
        group.add(standardBtn);
        group.add(expressBtn);
        group.add(overnightBtn);

        // ActionListener to update delivery time
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (standardBtn.isSelected()) {
                    deliveryLabel.setText("Delivery Time: 5-7 days");
                } else if (expressBtn.isSelected()) {
                    deliveryLabel.setText("Delivery Time: 2-3 days");
                } else if (overnightBtn.isSelected()) {
                    deliveryLabel.setText("Delivery Time: 1 day");
                }
            }
        };

        // Attach listener to all radio buttons
        standardBtn.addActionListener(listener);
        expressBtn.addActionListener(listener);
        overnightBtn.addActionListener(listener);

        // Add components to frame
        frame.add(standardBtn);
        frame.add(expressBtn);
        frame.add(overnightBtn);
        frame.add(deliveryLabel);

        frame.setVisible(true);
    }
}
