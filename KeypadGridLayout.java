import javax.swing.*;
import java.awt.*;

public class KeypadGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keypad Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Panel with GridLayout: 4 rows x 3 columns
        JPanel keypadPanel = new JPanel(new GridLayout(4, 3, 5, 5)); // 5px gap

        // Add buttons 1–9
        for (int i = 1; i <= 9; i++) {
            keypadPanel.add(new JButton(String.valueOf(i)));
        }

        // Add special buttons: *, 0, #
        keypadPanel.add(new JButton("*"));
        keypadPanel.add(new JButton("0"));
        keypadPanel.add(new JButton("#"));

        frame.add(keypadPanel);
        frame.setVisible(true);
    }
}
