import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelChangeApp {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Label Change App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create label
        JLabel label = new JLabel("Original Text");
        label.setBounds(50, 50, 200, 30);

        // Create button
        JButton button = new JButton("Change Text");
        button.setBounds(50, 100, 150, 30);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text Changed!");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}