import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmDialogExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Confirm Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        JLabel resultLabel = new JLabel("Your choice will appear here.");
        JButton askButton = new JButton("Ask Confirmation");

        askButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        frame,
                        "Do you want to continue?",
                        "Confirm",
                        JOptionPane.YES_NO_CANCEL_OPTION
                );

                if (choice == JOptionPane.YES_OPTION) {
                    resultLabel.setText("You clicked: YES");
                } else if (choice == JOptionPane.NO_OPTION) {
                    resultLabel.setText("You clicked: NO");
                } else if (choice == JOptionPane.CANCEL_OPTION) {
                    resultLabel.setText("You clicked: CANCEL");
                } else {
                    resultLabel.setText("Dialog closed without choosing.");
                }
            }
        });

        frame.add(askButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
