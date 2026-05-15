import javax.swing.*;
import java.awt.event.*;

public class MessageDialogExample extends JFrame implements ActionListener {

    private JButton button;

    public MessageDialogExample() {

        // Frame setup
        setTitle("Message Dialog Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Button
        button = new JButton("Click Me");
        button.setBounds(80, 60, 120, 40);
        button.addActionListener(this);

        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Show message dialog when button is clicked
        JOptionPane.showMessageDialog(
                this,
                "Hello! You clicked the button 🎉",
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        new MessageDialogExample();
    }
}