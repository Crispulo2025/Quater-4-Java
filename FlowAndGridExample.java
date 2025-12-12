import javax.swing.*;
import java.awt.*;

public class FlowAndGridExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow + Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout());

        // --- TOP PANEL: FlowLayout ---
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JTextField inputField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        topPanel.add(inputField);
        topPanel.add(submitButton);

        // --- BOTTOM PANEL: GridLayout 2x3 ---
        JPanel bottomPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            bottomPanel.add(new JButton("Button " + i));
        }

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
