import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogButtonExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Dialog Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(140, 60, 120, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Hello! This is your message dialog.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}