import javax.swing.*;
import java.awt.*;

public class GridBagExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5); // spacing around components

        // Button 1 at (0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"), gbc);

        // Button 2 at (1,0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);

        // Button 3 at (0,1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Button 3"), gbc);

        // Button 4 at (1,1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Button 4"), gbc);

        // Button 5 at (0,2)
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JButton("Button 5"), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
