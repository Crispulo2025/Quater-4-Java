import javax.swing.*;
import java.awt.event.*;

public class LastTypedCharacter {

    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 300, 30);

        JLabel label = new JLabel("Last typed character: ");
        label.setBounds(50, 100, 300, 30);

        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                label.setText("Last typed character: " + ch);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // not used
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // not used
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.setVisible(true);
    }
}