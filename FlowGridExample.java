import javax.swing.*;
import java.awt.*;

public class FlowGridExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Flow + Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- Top panel: FlowLayout with JTextField and Button -----
        JPanel topPanel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        topPanel.add(textField);
        topPanel.add(submitButton);

        // ----- Bottom panel: GridLayout 2x3 with buttons -----
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Button " + i));
        }

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(gridPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
