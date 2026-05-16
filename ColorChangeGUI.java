import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Background Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        // Action for Blue button
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        // Action for Red button
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        // Add buttons to frame
        frame.add(blueButton);
        frame.add(redButton);

        frame.setVisible(true);
    }
}