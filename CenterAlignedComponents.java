import javax.swing.*;
import java.awt.*;

public class CenterAlignedComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Center Alignment Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use GridBagLayout for centering
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Components to center
        JLabel label = new JLabel("Centered Label");
        JButton button = new JButton("Centered Button");

        frame.add(label, gbc);

        gbc.gridy = 1;
        frame.add(button, gbc);

        frame.setVisible(true);
    }
}
