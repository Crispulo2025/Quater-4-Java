import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonLabelChange {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JButton ActionListener Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JLabel
        JLabel label = new JLabel("Original Text");

        // Create JButton
        JButton button = new JButton("Click Me");

        // Add ActionListener to JButton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }
}