import javax.swing.*;
import java.awt.*;

public class MultipleButtonsLambda {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lambda Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Click a button");

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");

        // Lambda event handling
        btn1.addActionListener(e -> {
            System.out.println("Button 1 clicked");
            label.setText("You clicked: Button 1");
        });

        btn2.addActionListener(e -> {
            System.out.println("Button 2 clicked");
            label.setText("You clicked: Button 2");
        });

        btn3.addActionListener(e -> {
            System.out.println("Button 3 clicked");
            label.setText("You clicked: Button 3");
        });

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(label);

        frame.setVisible(true);
    }
}