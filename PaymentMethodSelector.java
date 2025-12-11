import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentMethodSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Select Payment Method");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel to display selection
        JLabel selectedLabel = new JLabel("Your selected payment method: ");

        // Create JRadioButtons
        JRadioButton creditCard = new JRadioButton("Credit Card");
        JRadioButton paypal = new JRadioButton("PayPal");
        JRadioButton cash = new JRadioButton("Cash");

        // Group the radio buttons so only one can be selected
        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(creditCard);
        paymentGroup.add(paypal);
        paymentGroup.add(cash);

        // ActionListener for radio buttons
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedLabel.setText("Your selected payment method: " + e.getActionCommand());
            }
        };

        creditCard.addActionListener(listener);
        paypal.addActionListener(listener);
        cash.addActionListener(listener);

        // Add components to frame
        frame.add(creditCard);
        frame.add(paypal);
        frame.add(cash);
        frame.add(selectedLabel);

        frame.setVisible(true);
    }
}
