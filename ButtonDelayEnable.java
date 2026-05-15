import javax.swing.*;
import java.awt.event.*;

public class ButtonDelayEnable extends JFrame implements ActionListener {

    private JButton button;
    private JLabel statusLabel;

    public ButtonDelayEnable() {

        // Frame setup
        setTitle("Button Delay Enable Example");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Button
        button = new JButton("Click Me");
        button.setBounds(120, 50, 100, 40);
        button.addActionListener(this);

        // Status label
        statusLabel = new JLabel("Button is ready.");
        statusLabel.setBounds(110, 110, 200, 30);

        add(button);
        add(statusLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Disable button immediately
        button.setEnabled(false);
        statusLabel.setText("Please wait 5 seconds...");

        // Timer for 5 seconds (5000 ms)
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                button.setEnabled(true);
                statusLabel.setText("Button is ready again.");
            }
        });

        timer.setRepeats(false); // run only once
        timer.start();
    }

    public static void main(String[] args) {
        new ButtonDelayEnable();
    }
}