import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {

    private JButton openButton;

    public MainWindow() {

        // Main frame setup
        setTitle("Main Window");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Button
        openButton = new JButton("Open New Window");
        openButton.setBounds(70, 60, 150, 40);
        openButton.addActionListener(this);

        add(openButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Create secondary window
        JFrame secondFrame = new JFrame("Secondary Window");
        secondFrame.setSize(250, 150);
        secondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secondFrame.setLayout(null);

        JLabel label = new JLabel("Hello from second window!");
        label.setBounds(40, 40, 200, 30);

        secondFrame.add(label);

        secondFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}