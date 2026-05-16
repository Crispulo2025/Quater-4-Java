import javax.swing.*;
import java.awt.event.*;

public class ClickCounterButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Click Counter");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(120, 40, 100, 40);

        JLabel label = new JLabel("Clicks: 0");
        label.setBounds(140, 100, 200, 30);

        final int[] count = {0}; // array used to allow modification inside lambda

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]++; // increment counter
                label.setText("Clicks: " + count[0]);
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}