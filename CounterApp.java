import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp extends JFrame implements ActionListener {

    private int counter = 0;
    private JLabel counterLabel;
    private JButton incrementButton;

    public CounterApp() {

        // Frame settings
        setTitle("Counter Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label to display counter
        counterLabel = new JLabel("Counter: 0");
        counterLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Button to increment counter
        incrementButton = new JButton("Increment");
        incrementButton.addActionListener(this);

        // Add components to frame
        add(counterLabel);
        add(incrementButton);

        // Make frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        counterLabel.setText("Counter: " + counter);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}