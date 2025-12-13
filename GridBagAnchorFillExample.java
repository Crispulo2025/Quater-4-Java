import javax.swing.*;
import java.awt.*;

public class GridBagAnchorFillExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Anchor and Fill Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing

        // Row 0, Column 0: Button, default fill, anchored WEST
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(new JButton("Button 1"), gbc);

        // Row 0, Column 1: TextField, fills horizontally
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField("TextField 1", 15), gbc);

        // Row 1, Column 0-1: Button spans 2 columns, fills horizontally
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(new JButton("Button 2 (span 2 columns)"), gbc);

        // Row 2, Column 0: TextArea, fills both directions
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        JTextArea textArea = new JTextArea(5, 20);
        panel.add(new JScrollPane(textArea), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
