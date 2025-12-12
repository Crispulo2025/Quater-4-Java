import javax.swing.*;
import java.awt.*;

public class FlowAndGridExample extends JFrame {

    public FlowAndGridExample() {
        // Frame properties
        setTitle("FlowLayout and GridLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main frame uses BorderLayout
        setLayout(new BorderLayout(10, 10));

        // Top panel with FlowLayout
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JTextField textField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        topPanel.add(textField);
        topPanel.add(submitButton);
        add(topPanel, BorderLayout.NORTH);

        // Center panel with GridLayout 2x2
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5)); // 5px horizontal and vertical gaps
        for (int i = 1; i <= 4; i++) {
            centerPanel.add(new JButton("Button " + i));
        }
        add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FlowAndGridExample().setVisible(true);
        });
    }
}
