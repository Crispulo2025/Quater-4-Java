import javax.swing.*;
import java.awt.*;

public class TitleLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title Label Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title label with larger font
        JLabel titleLabel = new JLabel("Application Title", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Other components with default font size
        JLabel infoLabel = new JLabel("This is a normal text label", JLabel.CENTER);
        JButton button = new JButton("Click Me");

        // Panel for other components
        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.add(infoLabel);
        centerPanel.add(button);

        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
